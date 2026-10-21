public class CamaroteInferior extends Vip{

	private String localizacao;
	
	public CamaroteInferior(Double valor, Double adicional,String localizacao){
		
		super(valor,adicional);
		this.localizacao = localizacao;
	}

	@Override
	public String mostraValor(){
		
		Double result; 
		if (localizacao.equalsIgnoreCase("lateral"))
		{
			result = getValor() + getAdicional() + ((getValor() + getAdicional()) * 0.20);
			return Double.toString(result);
		
		}else if(localizacao.equalsIgnoreCase("frontal"))
		{
			result = getValor() + getAdicional() +((getValor() + getAdicional()) * 0.35);
			return Double.toString(result);
		
		}
		return Double.toString(getValor());
	}
	
	public String getLocalizacao(){
		
		return this.localizacao;
	
	}
	public void setLocalizacao(String localizacao){
		
		this.localizacao = localizacao;
		
	
	}
}
