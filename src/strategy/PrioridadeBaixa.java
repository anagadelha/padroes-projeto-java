package strategy;

public class PrioridadeBaixa implements NivelPrioridade {
	
	@Override
	public void marcarConsulta() {
		System.out.println("A prioridade é baixa. Não há tempo limite de espera para atendimento.");
	}

}