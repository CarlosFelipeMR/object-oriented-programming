public class Venda{

	private int numero;
	private Cliente comprador;
	private Produto produto;
	private int quantidade;
	
	public Venda (int numero,Cliente comprador,Produto produto,int quantidade){
		
		this.numero = numero;
		this.comprador = comprador;
		this.produto = produto;
		this.quantidade = quantidade;
		
	
	}
	
	public String imprimir() {

    Double valorTotal = produto.getPreco() * quantidade;

    if (valorTotal <= comprador.getLimiteDeCredito()) {
        
        return "Nome: " + this.comprador.getNome()
             + "\nProduto: " + this.produto.getDescricao()
             + "\nQuantidade: " + this.quantidade
             + "\nValor total: " + valorTotal
             + "\nCompra dentro do limite de crédito.";

    } else {
        
        return "Nome: " + this.comprador.getNome()
             + "\nProduto: " + this.produto.getDescricao()
             + "\nQuantidade: " + this.quantidade
             + "\nValor total: " + valorTotal
             + "\nCompra maior que o limite de crédito.";
    }
}
	
	public int getNumero(){
		
		return this.numero;
	
	}
	public Cliente getComprador(){
		
		return this.comprador;
	
	}
	public Produto getProduto(){
		
		return this.produto;
	
	}
	public int getQuantidade(){
		
		return this.quantidade;
	
	}
	
	public void setNumero(int numero){
		
		this.numero = numero;
	
	}

	public void setComprador(Cliente comprador){
	
		this.comprador = comprador;
		
	}
	
	public void setProduto(Produto produto){
		
		this.produto = produto;
	
	}
	
	public void setQuantidade(int quantidade){
		
		this.quantidade = quantidade;
	
	}

}
