package br.inatel.cdg.inimigo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {

	InimigoService inimigoServico;
	
	public BuscaInimigo(InimigoService inimigoService) {
		this.inimigoServico = inimigoService;
	}
	
	public Inimigo buscaInimigo(int id) {
		
		String inimigoJson = inimigoServico.busca(id);
		
		JsonObject jsonObj = JsonParser.
				parseString(inimigoJson).getAsJsonObject();;
		
		return new Inimigo(
				jsonObj.get("nome").getAsString(), 
				jsonObj.get("arma").getAsString(), 
				jsonObj.get("vida").getAsDouble());
	}
	
}