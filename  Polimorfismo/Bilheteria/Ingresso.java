public class Ingresso {

	private Double valor;
	
	public Ingresso(Double valor){
		
		this.valor = valor;
		
	}
	
	
	public String mostraValor(){
		
		return Double.toString(getValor());
	
	}
	
	public Double getValor(){
		
		return this.valor;
	
	}
	public void setValor(){
		
		this.valor = valor;
	
	}



}
