package br.inatel.cdg.inimigo;

public class UIMockNotifier implements Notifier {
	
	private boolean executed = false;
	
	@Override
	public void notificaMorte(Inimigo inimigo) {
		
		executed = true;
	}
	
	public boolean isExecuted() {
		return executed;
	}

}