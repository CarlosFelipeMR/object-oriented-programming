public class Quadrado {
	
	double lado;
	
	public Double calcularArea(){
		
		return lado * lado;
		
	}
	
	public Double calcularPerimetro(){
		
		return  4 * lado;
		
	}

	public Quadrado(Double lado){
		
	this.lado = lado;
		
	}

}



