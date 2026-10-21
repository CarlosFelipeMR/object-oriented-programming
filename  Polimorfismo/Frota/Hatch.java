public class Hatch extends Carro{

	private int bagageiro;
	
	public Hatch(int passageiros,int combustivel,Double rendimento,boolean cambioAutomatico,int bagageiro){
		
		super(passageiros,combustivel,rendimento,cambioAutomatico);
		this.bagageiro = bagageiro;
		
	
	
	}
	public Double  calculaVolume(int passageiros){
		
		Double result;
		if(passageiros < 3){
			
			return result = this.bagageiro * 2.0;
			
		}else if(passageiros == 3){
		
			return result = this.bagageiro * 1.5;
			
		}else{
			
			return result = this.bagageiro * 1.0;
		
		}
	
	}

	public int getBagageiro() {
    return bagageiro;
	}

	public void setBagageiro(int bagageiro) {
		this.bagageiro = bagageiro;
	}

}
