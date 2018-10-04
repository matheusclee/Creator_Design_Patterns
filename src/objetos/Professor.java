package objetos;

public class Professor extends Usuario{
	
	private String nome;
	
	public Professor(String cpf, String nome) throws Exception{
		super(cpf);
		setNome(nome);
	}
	
	public String toString(){
		StringBuilder info = new StringBuilder();
		info.append("Nome: " + nome + "CPF: " + super.getCpf());
		info.append(super.toString());
		return info.toString();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}