public class Smartphone extends Eletronico implements Desconto,Garantia{

   
	private int capacidadeArmazenamento;
    
    public Smartphone(String marca,String modelo,Double preco,int capacidadeArmazenamento){
		
		super(marca,modelo,preco);
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
    
   
	@Override
	public Double aplicarDesconto(Double porcentagem){
		
		return getPreco() * (porcentagem/100);
		
	}
	
	@Override
	public int tempoGarantia(){
		
		return 6;
	
	}
	@Override 
	public Double precoFinal(){
		
		return getPreco() - aplicarDesconto(10.0);
	
	}
	
	@Override
	public String detalhar(){
		
		return "Marca: " + getMarca()
		+ "\nModelo: " + getModelo()
		+ "\nPreço: " + getPreco()
		+ "\nCapacidade de Armazenamento: " + capacidadeArmazenamento
		+ "\nTempo de Garantia: " + tempoGarantia() + " Meses";
	}
	
    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

   

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

   
    
}
