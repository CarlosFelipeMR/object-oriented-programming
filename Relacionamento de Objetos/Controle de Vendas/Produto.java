public class Produto{

	private int codigo;
	private String descricao;
	private Double custo;
	private Double preco;
	
	public Produto(int codigo,String descricao,Double custo){
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.custo = custo;
		calculaPreco();
	
	
	}
	
	public void calculaPreco(){
		
		Double add = this.custo * 0.25;
		this.preco = custo + add;
		
	}
	
	public int getCodigo(){
		
		return this.codigo;
	
	}

	public String getDescricao(){
		
		return this.descricao;
	
	}

	public Double getCusto(){
		
		return this.custo;
	
	}

	public Double getPreco(){
		
		return this.preco;
	
	}

	public void setCodigo(int codigo){
		
		this.codigo = codigo;
	
	}
	public void setDescricao(String descricao){
		
		this.descricao = descricao;
	
	}
	public void setCusto(Double custo){
		
		this.custo = custo;
		calculaPreco();
	}


}
