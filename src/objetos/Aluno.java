package objetos;

public class Aluno extends Usuario{
	
	private int matricula;
	private String nome;
	
	public Aluno (String cpf, int matricula, String nome) throws Exception{
		super(cpf);
		setMatricula(matricula);
		setNome(nome);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		
		info.append("Matricula: " + matricula + "Nome: " + nome + "CPF: " + super.getCpf());
		info.append(super.toString());
		
		return info.toString();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	

}
