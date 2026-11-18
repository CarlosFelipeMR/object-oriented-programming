public class FoneDeOuvido extends Eletronico implements Desconto {

   
	private String tipoConexao;
	
	public FoneDeOuvido(String marca,String modelo,Double preco,String tipoConexao){
		
		super(marca,modelo,preco);
		this.tipoConexao = tipoConexao;
	
	
	}
	
	@Override
	public Double aplicarDesconto(Double porcentagem){
		
		return getPreco() * (porcentagem/100);
		
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
		+ "\ntipo de Conexão: " + tipoConexao;
	}
	
    public String getTipoConexao() {
        return tipoConexao;
    }

   

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

  
  
}
