public class Veiculo{

	private double combustivel;

	
	
	public Veiculo(double combustivel){
		
		this.combustivel = combustivel;
	
	
	}
	 

	public Veiculo(){
		
		this.combustivel = 0.0;
	
	
	}
	 
	public double autonomia(){
		System.out.println("GASOLINA:");
		System.out.println("km ");
		return combustivel * 12;
	
	}
	
	public double autonomia(String tipoCombustivel){
		
		if(tipoCombustivel.equals("GASOLINA")){
			System.out.println("GASOLINA:");
			System.out.println("km ");
			return getCombustivel() * 12;
			
		}else if(tipoCombustivel.equals("ETANOL")){
			System.out.println("ETANOL:");
			System.out.println("km ");
			return getCombustivel() * 8;
		}else{
			System.out.println("tipo de combustivel indisponivel!");
			return 0.0;
		}
	}
	public double autonomia(String tipoCombustivel,double abastecimento){
		
		System.out.println("antes do abastecimento:"+getCombustivel());
		
		double result = getCombustivel() + abastecimento;
		
		System.out.println("após o abastecimento:"+result);
		
		if(tipoCombustivel.equals( "GASOLINA")){
			System.out.println("GASOLINA:");
			System.out.println("km ");
			return result * 12;
		
		}else if(tipoCombustivel.equals("ETANOL")){
			System.out.println("ETANOL:");
			System.out.println("km ");
			return result * 8;
		
		}else{
			System.out.println("tipo de combustivel indisponivel!");
			return 0.0;
		}
	}
	public double autonomia(String tipoCombustivel,boolean carga){
			
			double result1 = getCombustivel() * 12;
			double result2 = getCombustivel() * 8;
			
			if(tipoCombustivel.equals("GASOLINA")  && carga == true){
				System.out.println("GASOLINA:");
				System.out.println("km ");
				return result1 - result1 * 0.30;

			
			}else if(tipoCombustivel.equals("ETANOL")&& carga == true){
				System.out.println("ETANOL:");
				System.out.println("km ");
				return result2 - result2 * 0.30;
			
			}else{
				System.out.println("tipo de combustivel indisponivel!");
				return 0.0;
			}
			
	}
	
	public double getCombustivel(){
		
		return this.combustivel;
	
	}
	
	public void setCombustivel(double combustivel){
		
		this.combustivel = combustivel;
	
	}
}

	
