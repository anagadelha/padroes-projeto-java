package strategy;

public class PrioridadeMediana implements NivelPrioridade {
	
	@Override
	public void marcarConsulta() {
		System.out.println("A prioridade � m�dia. Marcar atendimento em data pr�xima.");
	}

}