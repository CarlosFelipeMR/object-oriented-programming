public class Smartwatch extends Eletronico implements Garantia{

 
	private boolean resistenteAgua;
  
	
	public Smartwatch(String marca,String modelo,Double preco,boolean resistenteAgua){
		
		super(marca,modelo,preco);
		this.resistenteAgua = resistenteAgua;
	}
    
   
	
	@Override
	public int tempoGarantia(){
		
		if(resistenteAgua){
			
			return 24;
		
		}else{
			
			return 12;
		}
		
	
	}
	@Override 
	public Double precoFinal(){
		
		return getPreco();
	
	}
	
	@Override
	public String detalhar(){
		
		return "Marca: " + getMarca()
		+ "\nModelo: " + getModelo()
		+ "\nPreço: " + getPreco()
		+ "\nResistente a água: " + resistenteAgua
		+ "\nTempo de Garantia: " + tempoGarantia() + " Meses";
	}
    public boolean isResistenteAgua() {
        return resistenteAgua;
    }

   

    public void setResistenteAgua(boolean resistenteAgua) {
        this.resistenteAgua = resistenteAgua;
    }

   
    
}
