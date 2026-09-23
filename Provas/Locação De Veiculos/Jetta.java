public class Jetta{


	private String placa;
	private String modelo;
	private String tipo;
	private int quilometragem;

	public Jetta(String placa,String modelo,String tipo){
		
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = 0;
	}
	public Jetta(String placa,String modelo,String tipo,int quilometragem){
		
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.quilometragem = quilometragem;
	}
	
	public Double calcularlocacao(int dias){
		
		int kmAdd;
		if(this.tipo.equalsIgnoreCase("ECONOMICO")){
			
			kmAdd = dias * 100;
			this.quilometragem += kmAdd;
			return (dias * 100) + kmAdd * 0.10;
		
		
		}else if(this.tipo.equalsIgnoreCase("SUV")){
			
			kmAdd = dias * 100;
			this.quilometragem += kmAdd;
			return (dias * 150) + kmAdd * 0.10;
	
		}else if(this.tipo.equalsIgnoreCase("LUXO")){
			
			kmAdd = dias * 100;
			this.quilometragem += kmAdd;
			return (dias * 250) + kmAdd * 0.10;
		
		}else{
			return -1.0;
		}
	}
	public Double calcularlocacao(int dias,int kmRodados){
		
		int  kmAdd;
		if(this.tipo.equalsIgnoreCase("ECONOMICO")){
			
			kmAdd = dias * kmRodados;
			this.quilometragem += kmAdd;
			return (dias * 100) + kmAdd * 0.10;
		
		
		}else if(this.tipo.equalsIgnoreCase("SUV")){
			
			kmAdd = dias * kmRodados;
			this.quilometragem += kmAdd;
			return (dias * 150) + kmAdd * 0.10;
	
		}else if(this.tipo.equalsIgnoreCase("LUXO")){
			
			kmAdd = dias * kmRodados;
			this.quilometragem += kmAdd;
			return (dias * 250) + kmAdd * 0.10;
		
		}else{
			return -1.0;
		}
	}
	public Double calcularlocacao(int dias,int kmRodados,boolean seguro){
		
		int kmAdd;
		
	    if(seguro){	
			if(this.tipo.equalsIgnoreCase("ECONOMICO")){
				
				kmAdd = dias * kmRodados;
				this.quilometragem += kmAdd;
				return ((dias * 100) + kmAdd * 0.10) + 50 * dias;
			
			
			}else if(this.tipo.equalsIgnoreCase("SUV")){
				
				kmAdd = dias * kmRodados;
				this.quilometragem += kmAdd;
				return ((dias * 150) + kmAdd * 0.10 ) + 50 * dias;
		
			}else if(this.tipo.equalsIgnoreCase("LUXO")){
				
				kmAdd = dias * kmRodados;
				this.quilometragem += kmAdd;
				return ((dias * 250) + kmAdd * 0.10) + 50 * dias;
			
			}else{
				return -1.0;
			}
		}else{
			return -1.0;
		}
	}
	
	public String exibirDetalhes(){
		
		return "Placa: ["+ getPlaca() + "]"
		+ "\nModelo: ["+ getModelo() + "]"
		+ "\nTipo: ["+ getTipo() + "]"
		+"\\nQuilometragem: ["+ getQuilometragem() + "]";
	}
	
	public String getPlaca(){
		
			return this.placa;
		
	} 
	public String getModelo(){
		
			return this.modelo;
		
	} 
	public String getTipo(){
		
			return this.tipo;
		
	} 
	public int getQuilometragem(){
		
			return this.quilometragem;
		
	} 
	
	public void setPlaca(String placa){
		
		this.placa = placa;
		
	
	}
	public void setModelo(String modelo){
		
		this.modelo = modelo;
		
	
	}
	public void setTipo(String tipo){
		
		this.tipo = tipo;
		
	
	}
	public void setQuilometragem(int quilometragem){
		
		this.quilometragem = quilometragem;
		
	
	}
}
