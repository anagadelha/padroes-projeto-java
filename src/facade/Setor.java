package facade;

public class Setor {

		private static Setor especialidade = new Setor();
		
		private Setor() {
			super();
		}
		
		public static Setor getEspecialidade() {
			return especialidade;
		}
		
		public String definirSetor(String sintomas) {
			return "Clínica Geral";
		}


}
