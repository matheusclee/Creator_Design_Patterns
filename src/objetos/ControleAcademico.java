package objetos;

import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {
	
	private String nomeUni;
	private String endereco;
	
	private int idAluno;
	private int idDisciplina;
	
	private RDM rdm = new RDM();
	private List<Disciplina> disciplinas;
	
	public ControleAcademico(String nome, String endereco){
		setNomeUni(nome);
		setEndereco(endereco);	
		idAluno = 0;
		idDisciplina = 0;
		
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addDisciplina(String nome, String horario){
		idDisciplina++;
		disciplinas.add(new Disciplina(idDisciplina, nome, horario));
	}
	
	public void matricularAluno(String cpf, String nome) throws Exception{
		idAluno++;
		rdm.addAluno(cpf, idAluno, nome);
	}
	
	public void matricularProfessor(String cpf, String nome) throws Exception{
		rdm.addProfessor(cpf, nome);
	}
	
	public void matricularDisciplinaAluno(int idAluno, Disciplina disciplina) throws Exception{
		rdm.addDisciplinaAluno(idAluno, disciplina);
	}
	
	public void matricularDisciplinaProfessor(String cpf, Disciplina disciplina) throws Exception{
		rdm.addDisciplinaProfessor(cpf, disciplina);
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNomeUni() {
		return nomeUni;
	}

	public void setNomeUni(String nomeUni) {
		this.nomeUni = nomeUni;
	}
	
}
