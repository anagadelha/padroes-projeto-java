package facade;

public class Paciente {
	public void confirmarPaciente(String nome, String sintomas) {
		String setor = Setor.getEspecialidade().definirSetor(sintomas);
		
		FilaHospital.adicionarPaciente(nome, sintomas, setor);
	}

}
