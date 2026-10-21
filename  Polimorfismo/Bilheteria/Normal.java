public class Normal extends Ingresso{
	
	private boolean pista;
	
	public Normal(Double valor,boolean pista){
		
		super(valor);
		this.pista = pista;
		
	}
	
	
	@Override
	public String mostraValor(){
		
		if (pista)
		{
			Double result = getValor() + (getValor() * 0.10);
			return Double.toString(result);
		}
		
		return Double.toString(getValor());
	}

	public boolean getPista(){
			
		return this.pista;	
		
	}
	
	public void setPista(boolean pista){
		
		this.pista = pista;
	
	}

}
