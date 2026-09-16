public class Funcionario1{

	private String nome;
	private Double salarioBase;
	private int tempoDeServico;
	
	
	
	public Funcionario1 (String nome,Double salario,int tempo){
		
		this.nome = nome;
		this.salarioBase = salario;
		this.tempoDeServico = tempo;
	
	}
	double comissao;
	double result;
	public double mostrarSalario(){
		
		if (tempoDeServico < 10){
			
			comissao = getSalarioBase() * 0.12;
			result = getSalarioBase() + comissao;
			System.out.println("sua comissão foi de R$ "+ comissao);
			System.out.println("salário total: \nR$"+ result);
			return result;
			
		}else{
			
			comissao = getSalarioBase() * 0.17;
			result = getSalarioBase() + comissao;
			System.out.println("sua comissão foi de: \nR$ "+ comissao);
			System.out.println("salário total: \nR$"+ result);
			
			return result;
		
		
		}
	}

	double vendas;
	public double mostrarSalario(double totalDeVendas){
		
		if (tempoDeServico < 10){
			
			vendas = totalDeVendas * 0.015;
			comissao = getSalarioBase()* 0.05;
			result = (getSalarioBase() + comissao) + vendas;
			System.out.println("sua comissão foi de R$ "+ comissao);
			System.out.println("sua comissão de vendas foi de R$ "+ vendas);
			System.out.println("salário total: \nR$"+ result);
			return result;
			
		}else{
			
			vendas = totalDeVendas * 0.02;
			comissao = getSalarioBase() * 0.10;
			result = (getSalarioBase() + comissao) + vendas;
			System.out.println("sua comissão foi de R$ "+ comissao);
			System.out.println("sua comissão de vendas foi de R$ "+ vendas);
			System.out.println("salário total: \nR$"+ result);
			return result;
		
		}
	}

	public String getnome(){
	
		return this.nome;
	
	}
	public double getSalarioBase(){
	
		return this.salarioBase;
	
	}
	public int getTempoDeServico(){
	
		return this.tempoDeServico;
	
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
		
	}
	public void setSalarioBase(double salarioBase){
		
		this.salarioBase = salarioBase;
		
	}
	public void setTempoDeServiço(int tempo){
		
		this.tempoDeServico = tempo;
		
	}
	

}




