public class Fornecedor extends Pessoa{

	
	private Double credito;
	private Double divida;
	
	public Fornecedor(String nome,String endereco,String telefone,Double credito,Double divida){
		
		super(nome,endereco,telefone);
		this.credito = credito;
		this.divida = divida;
		
	}
	
	public Double obterSaldo(){
		
		Double result = credito - divida;
		return result;
		
	}
	
	public Double getCredito(){
		
		return this.credito;
		
	}
	public void setCredito(Double credito){
		
		this.credito = credito;
	
	}
	public Double getDivida(){
		
		return this.divida;
		
	}
	public void setDivida(Double divida){
		
		this.divida = divida;
	
	}


}
