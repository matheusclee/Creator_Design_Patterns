package objetos;

public class Disciplina {

	private int id;
	private String nome;
	private String horario;
	
	public Disciplina (int id_Disciplina, String nome_Disciplina, String horario_Disciplina){
		setId(id_Disciplina);
		setNome(nome_Disciplina);
		setHorario(horario_Disciplina);
	}
	
	public String toString(){
		return "Id: " + id + "Disciplina: " + nome + "Horario: " + horario;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}