package objetos;

public class main {

	public static void main(String[] args) throws Exception {
		
		//criando um objeto ControleAcademico
		ControleAcademico sistemaUni = new ControleAcademico("UEPB", "Rua Baraunas");
		
		//adicionando disciplinas
		sistemaUni.addDisciplina("MAP", "Ter - 20h e Qui - 18h");
		sistemaUni.addDisciplina("Estrutura de Dados", "Seg - 18h e Qua - 20h");
		sistemaUni.addDisciplina("Matematica Discreta", "Seg - 20h e Qua - 18h");
		sistemaUni.addDisciplina("Banco de Dados", "Ter - 18h e Qui - 20h");
		
		//adicionando alunos
		sistemaUni.matricularAluno("12345678978", "Joao");
		sistemaUni.matricularAluno("78945612378", "Felipe");
		sistemaUni.matricularAluno("45678913245", "Jonata");
		
		//adicionando Professores
		sistemaUni.matricularProfessor("12345679845", "Diego");
		sistemaUni.matricularProfessor("79845612398", "Thomas");
		
		sistemaUni.matricularDisciplinaAluno(1, );
		
	}

}
