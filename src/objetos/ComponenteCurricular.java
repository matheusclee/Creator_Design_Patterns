package objetos;

import java.util.ArrayList;
import java.util.List;

public class ComponenteCurricular {
	
	private List<Disciplina> disciplinas;
	
	public ComponenteCurricular(){
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addDisciplina(Disciplina disciplina) throws Exception{
		if(verificaDisciplinaExiste(disciplina.getId()) == false){
			disciplinas.add(disciplina);
		}else{
			throw new Exception("Disciplina ja matriculada ao aluno.");
		}
		

	}
	
	public boolean removerDisciplina(int id){
		for(int i = 0; i < disciplinas.size(); i++){
			if(disciplinas.get(i).getId()==id){
				disciplinas.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		info.append("Componente Curricular:\n");
		for(int i = 0; i < disciplinas.size(); i++){
			info.append(disciplinas.get(i).toString());
		}
		return info.toString();
	}
	
	public int quantidadeDisciplinas(){
		return disciplinas.size();
	}
	
	public boolean verificaDisciplinaExiste(int id){
		for(int i = 0; i < disciplinas.size(); i++){
			if(id == disciplinas.get(i).getId()){
				return true;
			}
		}
		return false;
	}
	
}
