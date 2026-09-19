public class Fatura{
	
	int numero;
	String descricao;
	int quantidade;
	double preco;

	
	public Double getValorDaFatura(){
		
		return this.quantidade * this.preco;
		
	}

	
	public Fatura(int numero,String descricao,int quantidade,Double preco){
		
		this.numero = numero;
		this.descricao = descricao;
		
		if(quantidade < 0){
			this.quantidade = 0;
		}else{
		this.quantidade = quantidade;
		}
		if(preco < 0){
			this.preco = 0;
		}else{
		this.preco = preco;
		}
	
	}
}
