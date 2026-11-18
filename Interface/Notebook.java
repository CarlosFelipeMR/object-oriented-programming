public class Notebook extends Eletronico implements Desconto,Garantia{

    
	private String processador;
	
	public Notebook(String marca,String modelo,Double preco,String processador){
		
		super(marca,modelo,preco);
		this.processador = processador;
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
		+ "\nProcessador: " + processador
		+ "\nTempo de Garantia: " + tempoGarantia() + " Meses";
	}

    public String getProcessador() {
        return processador;
    }

  

    public void setProcessador(String processador) {
        this.processador = processador;
    }

   
}
