public class ContaEspecial extends ContaBancaria{

	private Double limite;
	
	public ContaEspecial(Pessoa cliente,int numeroDaConta,Double saldo,Double limite){

		super(cliente,numeroDaConta,saldo);
		this.limite = limite;

	}
	
	@Override
	public boolean sacar(Double valor){

		if (getSaldo() + getLimite() >= valor){

			setSaldo(getSaldo() - valor);
			return true;

		}

		return false;

	}
	
	public Double getLimite(){
		
		return this.limite;
	
	}
	
	public void setLimite(Double limite){
		
		this.limite = limite;
	
	}
}
