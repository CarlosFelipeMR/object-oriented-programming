public class Vip extends Ingresso{

	private Double adicional;
	
	public Vip(Double valor,Double adicional){
	
		super(valor);
		this.adicional = adicional;
	}
	
	@Override
	public String mostraValor(){
		
		Double result = getValor() + adicional;
		return Double.toString(result);
	}

	public Double getAdicional(){
		
		return this.adicional;
	
	}
	
	public void setAdicional(Double adicional){
		
		this.adicional = adicional;
	
	}

}
