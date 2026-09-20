public class Gente{

	private String nome;
	private String sexo;
	private Data nascimento;
	
	public Gente(String nome){
	
		this.nome = nome;
		this.nascimento = new Data(1,1,2000);
		this.sexo = null; 
	}
	
	public Gente(String nome,String sexo,Data nascimento){
		
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		
	}
	
	public String mostraIdade(Data hoje){
		
		
		return "Nome: " + this.nome
		+"\nSexo: " + this.sexo
		+ "\n" + nascimento.calculaTempo(hoje);
	
	}
	
	public String getNome(){
		
		return this.nome;
		
	}
	public String getSexo(){
		
		return this.sexo;
		
	}
	public Data getNascimento(){
		
		return this.nascimento;
		
	}
	public void setNome(String nome){
		
		this.nome = nome;
	
	}
	public void setSexo(String sexo){
		
		this.sexo = sexo;
	
	}
	public void setNascimento(Data nascimento){
		
		this.nascimento = nascimento;
	
	}
}

