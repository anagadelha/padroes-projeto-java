package facade;

public class FilaHospital {
	
	private FilaHospital() {
		super();
	}
	
	public static void adicionarPaciente(String nome, String sintomas, String setor) {
		System.out.println("Paciente cadastrado com sucesso.");
		System.out.println(nome);
		System.out.println(sintomas);
		System.out.println(setor);
	}

}
