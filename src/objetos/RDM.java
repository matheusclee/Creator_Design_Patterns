package objetos;

import java.util.ArrayList;
import java.util.List;

public class RDM {
	
	private List<Professor> professores;
	private List<Aluno> alunos;
	

	public RDM (){
		professores = new ArrayList<Professor>();
		alunos = new ArrayList<Aluno>();

	}
	
	public void addAluno(String cpf, int matricula, String nome) throws Exception{
		// verifica se ja existe algum aluno com o cpf informado
		for(int i = 0; i < alunos.size(); i++){
			if(alunos.get(i).getCpf()==cpf){
				throw new Exception("O CPF informado ja existe.");
			}
		}
		
		alunos.add(new Aluno(cpf, matricula, nome));
	}
	
	public void addProfessor(String cpf, String nome) throws Exception{
		// verifica se ja existe professor com o cpf informado
		for(int i = 0; i < alunos.size(); i++){
			if(alunos.get(i).getCpf()==cpf){
				throw new Exception("O CPF informado ja existe.");
			}
		}
		
		professores.add(new Professor(cpf, nome));
	}
	
	public void addDisciplinaAluno(int matricula, Disciplina disciplina) throws Exception{
		for(int i = 0; i < alunos.size(); i++){
			if(matricula == alunos.get(i).getMatricula()){
				alunos.get(i).addDisciplina(disciplina);
			}
			
		}
	}
	
	public void addDisciplinaProfessor(String cpf, Disciplina disciplina) throws Exception{
		if(verificarDisciplinaProfessores(disciplina.getId()) == false){
			for(int i = 0; i < professores.size(); i++){
				if(cpf == professores.get(i).getCpf()){
					professores.get(i).addDisciplina(disciplina);
				}
			}
		}else{
			throw new Exception("Disciplina cadastrada em outro professor");
		}
	}
	
	public int numAlunosDisciplina(int id){
		int qntDisciplinas = 0;
		for(int i = 0; i < alunos.size(); i++){
			if(alunos.get(i).verificarDisciplinaExiste(id)){
				qntDisciplinas++;
			}
		}
		
		return qntDisciplinas;
	}
	
	public String horarioAluno(int matricula){
		int indice = -1;
		for(int i = 0; i < alunos.size(); i++){
			if(matricula == alunos.get(i).getMatricula()){
				indice = i;
			}
		}
		StringBuilder info = new StringBuilder();
		info.append("Horario do Aluno: \n");
		info.append(alunos.get(indice).toString());
		return info.toString();
	}
	
	public String horarioProfessor(String cpf){
		int indice = -1;
		for(int i = 0; i < professores.size(); i++){
			if(cpf == professores.get(i).getCpf()){
				indice = i;
			}
		}
		StringBuilder info = new StringBuilder();
		info.append("Horario do Professor: \n");
		info.append(professores.get(indice).toString());
		return info.toString();
	}
	
	private boolean verificarDisciplinaProfessores(int id){
		for(int i = 0; i < professores.size(); i++){
			if(professores.get(i).verificarDisciplinaExiste(id)){
				return true;
			}
		}
		return false;
	}
	
	
}
