package strategy;

public class PrioridadeAlta implements NivelPrioridade {
	
	@Override
	public void marcarConsulta() {
		System.out.println("A prioridade � alta. Marcar atendimento imediato.");
	}

}
