public class Carro extends Veiculo{

	private boolean cambioAutomatico;


	public Carro(int passageiros,int combustivel,Double rendimento,boolean cambioAutomatico){
		
		super(passageiros,combustivel,rendimento);
		this.cambioAutomatico = cambioAutomatico;
	
	
	}
	
	@Override
	public Double autonomia(){
		if (cambioAutomatico)
		{
			Double result = getCombustivel() * getRendimento();
			return result - (result * 0.10);
		}
		
		return getCombustivel() * getRendimento();
	}
	
	public boolean isCambioAutomatico() {
    return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
    this.cambioAutomatico = cambioAutomatico;
	}
}
