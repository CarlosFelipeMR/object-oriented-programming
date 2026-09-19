public class Pessoa5{
	
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Double renda;
	
	public String informacoes(){
		
		return  getNome()+"\n"
		+ getCpf()+"\n"
		+ getEndereco()+"\n"
		+ getTelefone()+"\n"
		+ getRenda();
		
		
	}
	
	public String getNome(){
		
		return this.nome;
	
	}
	public String getCpf(){
		
		return this.cpf;
	
	}
	public String getEndereco(){
		
		return this.endereco;
	
	}
	public String getTelefone(){
		
		return this.telefone;
	
	}
	public Double getRenda(){
		
		return this.renda;
	
	}
	

	public void setNome(String nome){
		
		this.nome = nome;
	
	}
	public void setCpf(String cpf){
		
		this.cpf = cpf;
	
	}
	public void setEndereco(String endereco){
		
		this.endereco = endereco;
	
	}
	public void setTelefone(String telefone){
		
		this.telefone = telefone;
	
	}
	public void setRenda(Double renda){
		
		this.renda = renda;
	
	}






}

