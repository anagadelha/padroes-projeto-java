package strategy;

public class PrioridadeBaixa implements NivelPrioridade {
	
	@Override
	public void marcarConsulta() {
		System.out.println("A prioridade � baixa. N�o h� tempo limite de espera para atendimento.");
	}

}