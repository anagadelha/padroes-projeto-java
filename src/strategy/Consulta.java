package strategy;

public class Consulta {
	
	private NivelPrioridade prioridade;

	public void setConsulta (NivelPrioridade prioridade) {
		this.prioridade = prioridade;
	} 
	
	public void marcarConsulta() { 
		prioridade.marcarConsulta();
		
	}

}
