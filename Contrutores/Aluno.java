public class Aluno{
	
	int matricula;
	String nome;
	String cpf;
	String endereco;
	
	public String toString(){
		
		return "MATRICULA = " + matricula +
		"\nNOME:"+ nome +
		"\nCPF:"+ cpf +
		"\nENDEREÇO:"+ endereco;
	}
	
	public Aluno (int matricula,String nome,String cpf,String endereco ){
		
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	
	
	
	} 
	

}

