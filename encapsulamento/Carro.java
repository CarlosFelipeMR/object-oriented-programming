public class Carro{
	
	private double combustivel;
	private double quilometragem;
	
	public Carro(Double combustivel){
	
		this.quilometragem = 0;
		this.combustivel = combustivel;
	
	
	}
	
	public void percorrerDistancia(int distancia){
		
		double combustivelNess = distancia / 12.0;
		if(combustivel >= combustivelNess){
		this.quilometragem += distancia;
		this.combustivel -= combustivelNess;
		}else{
			System.out.println("quantidade de combustivel insuficiente");
		}
	}
	
	public void abastecer(Double litros){
		
		this.combustivel += litros;
	
	
	}
	
	public Double autonomia(){
		
		double result = combustivel * 12; 
		return result;
	
	
	}
	
	public Double getCombustivel(){
	
		return this.combustivel;
	
	}	
	
	public void setCombustivel(Double combustivel){
		
		this.combustivel = combustivel;
	
	}
	
	public Double getQuilometragem(){
	
		return this.quilometragem;
	
	}
	public void setQuilometragem(Double quilometros){
	
		this.quilometragem = quilometros;
		
	}
}

