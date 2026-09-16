public class Pessoa{

	private String nome;
	private String sexo;
	private int mesDeNascimento;
	private int anoDeNascimento;
	
	
	public Pessoa(String nome){
		
		this.nome = nome;
		this.mesDeNascimento = 1;
		this.anoDeNascimento = 2000;
		
	}
	
	public Pessoa(String nome,String sexo,int mesNascimento,int anoNascimento){
		
		this.nome = nome;
		this.sexo = sexo;
		this.mesDeNascimento = mesNascimento;
		this.anoDeNascimento = anoNascimento;
		
	
	
	}

	int result;
	public String mostraIdade(){
		
		result =  2018 - anoDeNascimento;
		
		if(this.mesDeNascimento > 10){
		
			result--;
			
		}
		
		return "Nome:"+ getNome()
		+"\nSexo:"+ getSexo() 
		+"\nIdade:"+ result;
		
		
	
	}
	public String mostraIdade(int mes,int ano){
		
		result =  ano - this.anoDeNascimento;
		
		if(this.mesDeNascimento > mes){
		
			result--;
			
		}
		
		return "Nome:"+ getNome()
		+"\nSexo:"+ getSexo() 
		+"\nIdade:"+ result;
	}

	public String getNome(){
	
		return this.nome;
	
	}
	public String getSexo(){
	
		return this.sexo;
	
	}
	public int getMesDeNascimento(){
	
		return this.mesDeNascimento;
	
	}
	public int getAnoDeNaacimento(){
	
		return this.anoDeNascimento;
	
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
	
	}
	public void setSexo(String sexo){
		
		this.sexo = sexo;
	
	}
	public void setMesDeNascimento(int mes){
		
		this.mesDeNascimento = mes;
	
	}
	public void setAnoDeNascimento(int ano){
		
		this.anoDeNascimento = ano;
	
	}
}



