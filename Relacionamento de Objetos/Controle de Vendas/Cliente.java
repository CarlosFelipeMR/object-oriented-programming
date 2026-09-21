public class Cliente{

	private String nome;
	private String cpf;
	private Double renda;
	private Double limiteDeCredito;

	public Cliente(String nome,String cpf,Double renda){
		
		this.nome = nome;
		this.cpf = cpf;
		this.renda = renda;
		calculaLimite();
	
	}
	public void calculaLimite(){
		
		this.limiteDeCredito = this.renda * 2.5;
	
	
	}
	
	public String getNome(){
		
		return this.nome;
	
	}
	public String getCpf(){
		
		return this.cpf;
	
	}
	public Double getRenda(){
		
		return this.renda;
	
	}
	public Double getLimiteDeCredito(){
		
		return this.limiteDeCredito;
	
	}
	
	public void setNome(String nome){
	
		this.nome = nome;
	
	}
	public void setCpf(String cpf){
	
		this.cpf = cpf;
	
	}
	public void setRenda(Double renda){
	
		this.renda = renda;
		calculaLimite();
	}
	

}
