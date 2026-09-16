public class SessaoCinema{
	
	private int numeroDaSala;
	private String filme;
	private int capacidade;
	private int ingressosVendidos;
	private double precoIngresso;
	
	public SessaoCinema(int numeroDaSala,String filme,int capacidade){
		
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.precoIngresso = 25.0;
		this.ingressosVendidos = 0;
	}
	
	public SessaoCinema(int numeroDaSala,String filme,int capacidade,double precoIngresso){
		
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.precoIngresso = precoIngresso;
		this.ingressosVendidos = 0;
	}
	
	double venda;
	
	public double venderIngresso(){
	
		if( this.capacidade > this.ingressosVendidos){
			
			ingressosVendidos += 1;
			venda = precoIngresso;
			return venda;
		
		}else{
			
			venda = -1;
		
			return venda;
		}
			
	
	
	
	}
	public double venderIngresso(int quantidade){
	
		if (this.ingressosVendidos + quantidade <= this.capacidade){
			if(quantidade + ingressosVendidos > this.capacidade){
				System.out.println("quantidade ultrapassa a capacidade!");
				return 0.0;
			}else{
				venda = precoIngresso * quantidade;
				ingressosVendidos += quantidade;
				return venda;
			}
		}else{
			
			venda = -1;
		
			return venda;
		}
	
	}
	public double venderIngresso(int quantidade,boolean meiaEntrada){
		
		if( this.capacidade > this.ingressosVendidos){
			if(meiaEntrada){
				if(quantidade > this.capacidade){
					System.out.println("quantidade ultrapassa a capacidade!");
					return 0.0;
				}else{
					venda = (precoIngresso/2) * quantidade;
					ingressosVendidos += quantidade;
					return venda;
				}
			}else{
				if(quantidade > this.capacidade){
					System.out.println("quantidade ultrapassa a capacidade!");
					return 0.0;
				}else{
					
					venda = precoIngresso * quantidade;
					ingressosVendidos += quantidade;
					return venda;
				}
			}
		}else{
			
			venda = -1;
		
			return venda;
		}
		
	}
	double valorTotal;
	public double calcularBilheteria(){
		
		valorTotal = this.ingressosVendidos * this.precoIngresso;
		
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

