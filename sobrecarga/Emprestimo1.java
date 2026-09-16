public class Emprestimo1{

	private String nomeCliente;
	private Double renda;
	
	public Emprestimo1(){
	
		
		
	}
	
	public Emprestimo1(String nome,double renda){
		
		this.nomeCliente = nome;
		this.renda = renda;
			
	}
	
	public Double calcularEmprestimo(){
		
		return renda * 4;
	}
	public Double calcularEmprestimo(int parametro){
		
		return renda * parametro;
	}
	public Double calcularEmprestimo(double taxa){
		
		double valor = renda * 5;
		double desconto = valor * taxa / 100;
		
		return valor - desconto ;
	}
	
	
	
	public String getNomeCliente(){
		
		return this.nomeCliente;
		
	}
	public void setNomeCliente(String nome){
	
		this.nomeCliente = nome;
	
	}
	
	public Double getRenda(){
		
		return this.renda;
	
	}
	
	public void setRenda(Double renda){
	
		this.renda = renda;
		
	}
	
	
}

