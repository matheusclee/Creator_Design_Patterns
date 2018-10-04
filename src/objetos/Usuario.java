package objetos;

public class Usuario {
	
	private String cpf;
	private final int LIMITE_CPF = 11;
	
	private ComponenteCurricular minhasDisciplinas;

	public Usuario(String cpf) throws Exception{
		setCpf(cpf);
	}
	
	public void addDisciplina(Disciplina disciplina) throws Exception{
		minhasDisciplinas.addDisciplina(disciplina);
	}
	
	public boolean removerDisciplina(int id){
		return minhasDisciplinas.removerDisciplina(id);
	}
	
	public boolean verificarDisciplinaExiste(int id){
		return minhasDisciplinas.verificaDisciplinaExiste(id);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) throws Exception {
		if(cpf.length() > LIMITE_CPF){
			throw new Exception("Quantidade de caracteres excedida.");
		}else{
			if(soTemNumeros(cpf)){
				this.cpf = cpf;
			}else{
				throw new Exception("CPF inválido, só números são válidos.");
			}
			
		}
	}
	
	public String toString(){
		return minhasDisciplinas.toString();
	}
	
	private boolean soTemNumeros(String str){
		//cria um array de char
		char[] digitos = str.toCharArray();
		
		boolean soNumeros = true;
		
		for(int i = 0; i < digitos.length; i++){
			if(!Character.isDigit(digitos[i])){
				soNumeros = false;
				break;
			}
		}
		
		return soNumeros;
	}
}
