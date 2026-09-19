public class ContaBancaria{

	private Pessoa5 cliente;
	private int numeroDaConta;
	private Double saldo = null;
	
	public boolean sacar(float saque){
		
		if(saque <= saldo){
			saldo = saldo - saque;
			return true;
		}else
			return false;
	}
	public boolean depositar(float deposito){
		
		if(deposito >= 0){
			saldo = saldo + deposito;
			return true;
		}else
			return false;
	}
	
	public Pessoa5 getCliente(){
		
		return this.cliente;
	
	}
	
	public int getNumeroDaConta(){
		
		return this.numeroDaConta;
	
	}
	
	public Double getSaldo(){
		
		return this.saldo;
	
	}
	
	public void setCliente(Pessoa5 cliente){
		
		this.cliente = cliente;
		
	}
	
	public void setNumeroDaConta(int conta){
		
		this.numeroDaConta = conta;
		 
	}
	
	public void setSaldo(Double saldo){
		
		this.saldo = saldo;
	
	}
}

