package strategy;

public class DefinirPrioridade {
	
	public static void main(String[] args) {
		
		NivelPrioridade baixa = new PrioridadeBaixa();
		NivelPrioridade mediana = new PrioridadeMediana();
		NivelPrioridade alta = new PrioridadeAlta();
		
		Consulta consulta = new Consulta();
		consulta.setConsulta(baixa);
		consulta.marcarConsulta();
		consulta.setConsulta(mediana);
		consulta.marcarConsulta();
		consulta.setConsulta(alta);
		consulta.marcarConsulta();
		
	}


}
