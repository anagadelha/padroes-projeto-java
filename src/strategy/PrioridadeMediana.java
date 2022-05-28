package strategy;

public class PrioridadeMediana implements NivelPrioridade {
	
	@Override
	public void marcarConsulta() {
		System.out.println("A prioridade é média. Marcar atendimento em data próxima.");
	}

}