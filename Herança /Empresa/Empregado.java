public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private Double salarioBase;
	private Double imposto; 


	public Double calcularSalario(){
		
		Double taxa = this.imposto/100;
		
		return this.salarioBase - (this.salarioBase * taxa);	
	
	}

	public int getCodigoSetor(){
		
		return this.codigoSetor;
	
	}
	public void setCodigoSetor(int codigoSetor){
		
		this.codigoSetor = codigoSetor;
	
	}
	public Double getSalarioBase(){
		
		return this.salarioBase;
	
	}
	public void setSalarioBase(Double salarioBase){
		
		this.salarioBase = salarioBase;
	
	}
	public Double getImposto(){
		
		return this.imposto;
	
	}
	public void setImposto(Double imposto){
		
		this.imposto = imposto;
	
	}

}
