public class CamaroteSuperior extends Vip{

	private char classe;
	
	public CamaroteSuperior(Double valor, Double adicional,char classe){
		
		super(valor,adicional);
		this.classe = classe;
		
	}
	
	@Override
	public String mostraValor(){
		
		Double result; 
		if (classe == 'A')
		{
			result = getValor() + getAdicional() + ((getValor() + getAdicional()) * 0.75);
			return Double.toString(result);
		
		}else if(classe == 'B')
		{
			result = getValor() + getAdicional() +((getValor() + getAdicional())* 0.50);
			return Double.toString(result);
		
		}
		return Double.toString( getValor());
	}
	
	public char getClasse(){
		
		return this.classe;
		
	
	}
	public void setClasse(char classe){
		
		this.classe = classe;
	
	}

}
