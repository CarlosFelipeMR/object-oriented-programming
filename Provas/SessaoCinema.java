public class SessaoCinema{
	
	private int numeroDaSala;
	private String filme;
	private int capacidade;
	private int ingressosVendidos;
	private Double precoIngresso;
	
	public SessaoCinema(int numeroDaSala,String filme,int capacidade){
		
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.precoIngresso = 25.0;
		this.ingressosVendidos = 0;
	}
	
	public SessaoCinema(int numeroDaSala,String filme,int capacidade,Double precoIngresso){
		
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.precoIngresso = precoIngresso;
		this.ingressosVendidos = 0;
	}
	

	
	public Double venderIngresso(){
	
		if( this.capacidade > this.ingressosVendidos){
			
			this.ingressosVendidos += 1;
			return this.precoIngresso;
		
		}else{
			return -1.0;
		}
			
	
	
	
	}
	public Double venderIngresso(int quantidade){
	
		if (this.ingressosVendidos + quantidade <= this.capacidade){
			
				Double venda = precoIngresso * quantidade;
				ingressosVendidos += quantidade;
				return venda;
			
		}else{
			return -1.0;
		}
	
	}
	public Double venderIngresso(int quantidade, boolean meiaEntrada){
    
    if(this.ingressosVendidos + quantidade <= this.capacidade){
        
        Double venda;
        
        if(meiaEntrada){
            venda = (this.precoIngresso / 2) * quantidade;
        }else{
            venda = this.precoIngresso * quantidade;
        }
        
        this.ingressosVendidos += quantidade;
        return venda;
        
    }else{
        return -1.0;
    }
}
	public double calcularBilheteria(){
		
		Double valorTotal = this.ingressosVendidos * this.precoIngresso;
		
		return valorTotal;
		
	}
	
	public String exibirSessao(){
	
		return "Sala:"+ getNumeroDaSala()
		+"\nFilme:"+ getFilme()
		+"\nIngresso:" + getPrecoIngresso()+" R$";
		
	}
	
	public String exibirSessao(boolean mostrarLotacao){
	
		return "Sala:"+ getNumeroDaSala()
		+"\nFilme:"+ getFilme()
		+"\nIngresso:" + getPrecoIngresso() +" R$"
		+"\nLotação:"+ getIngressosVendidos() + "/" + getCapacidade();
		
	}
	
	public int getNumeroDaSala(){
		
		return this.numeroDaSala;	
	
	}
	public String getFilme(){
		
		return this.filme;	
	
	}
	public int getCapacidade(){
		
		return this.capacidade;	
	
	}
	public int getIngressosVendidos(){
		
		return this.ingressosVendidos;	
	
	}
	public double getPrecoIngresso(){
		
		return this.precoIngresso;	
	
	}
	
	public void setNumeroDaSala(int numeroDaSala){
		
		this.numeroDaSala = numeroDaSala;
		
	}
	public void setFilme(String filme){
		
		this.filme = filme;
		
	}
	public void setCapacidade(int capacidade){
		
		this.capacidade = capacidade;
			
	}
	public void setIngressosVendidos(int ingressosVendidos ){
		
		this.ingressosVendidos = ingressosVendidos;
		
	}
	public void setPrecoIngresso (double precoIngresso ){
		
		this.precoIngresso = precoIngresso;
		
	}
	
	
}

