public class ContaPoupanca extends ContaBancaria{

	private int diaDeRendimento;
	
	public ContaPoupanca(Pessoa cliente,int numeroDaConta,Double saldo,int diaDeRendimento){
		
		super(cliente,numeroDaConta,saldo);
		this.diaDeRendimento = diaDeRendimento;
		
	}

	public Double calcularNovoSaldo(Double taxa){
		
		Double saldoAtual = getSaldo();
		Double novoSaldo = saldoAtual + (saldoAtual * taxa/100);
		
		setSaldo(novoSaldo);
		
		return getSaldo();
		
	}
	
	public int getDiaDeRendimento(){
		
		return this.diaDeRendimento;
		
	}
	public void setDiaDeRendimento(int diaDeRendimento){
		
		this.diaDeRendimento = diaDeRendimento;
	
	}
}
