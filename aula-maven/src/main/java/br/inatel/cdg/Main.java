package br.inatel.cdg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVWriter;

import br.inatel.cdg.inimigo.Inimigo;

public class Main {

	public static void main(String[] args) {
		
		List<Inimigo> inimigos = new ArrayList<Inimigo>();
		
		inimigos.add(new Inimigo("Black Knight", 100));
		inimigos.add(new Inimigo("Silver Knight", 200));
		
		Gson gson = new GsonBuilder().
					setPrettyPrinting().create();
		
		String json = gson.toJson(inimigos);
		
		FileWriter writer;
		try {
			writer = new FileWriter("inimigos.json");
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file = new File("inimigos.csv");
		FileWriter outputfile;
		try {
			outputfile = new FileWriter(file);
			
			CSVWriter csvWriter = new CSVWriter(outputfile);
			String[] header = {"Nome", "Vida"};
			csvWriter.writeNext(header);
			
			for (Inimigo inimigo : inimigos) {
				String[] data = {inimigo.getNome(),
								String.valueOf(inimigo.getVida())};
				csvWriter.writeNext(data);
			}
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

}}
