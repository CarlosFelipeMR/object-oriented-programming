public class Boleto{

	private int codigo;
	private String descricao;
	private int diaDeVencimento;
	private Double valor;
	private boolean status;
	
	public Boleto(int codigo,String descricao,int diaDeVencimento,Double valor){
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
		this.status = false ;
	
	}
	
	public boolean pagar(int dia,Double desconto,Double valorPago){
		
		if(status == true){
			
			System.out.println("boleto ja está pago!");
			return false;
			
		}else{
		
			if(dia <= diaDeVencimento){
				
				Double result = this.valor - desconto;
				
				System.out.println("vc terá um desconto de "+ desconto +"R$");
				System.out.println("O novo valor a ser pago e de "+ result +"R$");
				if(valorPago >= result){
					status = true;
					Double troco = valorPago - result; 
					System.out.println("Pagamento realizado com sucesso!");
					System.out.println("seu troco foi de "+ troco +"R$");
					return true;
				}else{
					System.out.println("Pagamento não realizado! tente novamente ");
					return false;
				}	
			}else{
					
					Double acrescimo = this.valor * 0.10;
					Double result = this.valor + acrescimo;
					System.out.println("vc terá um acrescimo de "+ acrescimo +"R$");
					System.out.println("O novo valor a ser pago e de "+ result +"R$");
				if(valorPago >= result){
					status = true;
					Double troco = valorPago - result; 
					System.out.println("Pagamento realizado com sucesso!");
					System.out.println("seu troco foi de "+ troco +"R$");
					return true;
				}else{
					System.out.println("Pagamento não realizado! tente novamente ");
					return false;
				}	
			}
		}
	}
	
	public String exibir(){
		
		return "CÓDIGO:"+codigo
		+"\nDESCRIÇÃO:"+descricao
		+"\nDIA DO VENCIMENTO:"+diaDeVencimento
		+"\nVALOR:"+valor
		+"\nSTATUS = "+status;
		
	}
	
	public int getCodigo(){
		
		return this.codigo;
	
	}
	public String getDescricao(){
		
		return this.descricao;
	
	}
	public int getDiaDeVencimento(){
		
		return this.diaDeVencimento;
	
	}
	public Double getValor(){
		
		return this.valor;
	
	}
	
	public void setCodigo(int codigo){
		
		this.codigo = codigo;
	
	}
	public void setDescricao(String descricao){
		
		this.descricao = descricao;
	
	}
	public void setDiaDeVencimento(int vencimento){
		
		this.diaDeVencimento = vencimento;
	
	}
	public void setValor(Double valor){
		
		this.valor = valor;
	
	}
	
	
}
	


