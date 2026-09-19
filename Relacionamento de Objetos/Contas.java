import java.util.Scanner;

public class Contas {

	public static void main (String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 
		 Pessoa5 pessoa = new Pessoa5();
		 ContaBancaria conta = new ContaBancaria();
		 
		 pessoa.setNome("FELEPI");
		 pessoa.setCpf("164.124.156.02");
		 pessoa.setEndereco("AV. PRINCIPAL 1835a");
		 pessoa.setTelefone("38 991951763");
		 pessoa.setRenda(2000.0);
		 
		 conta.setCliente(pessoa);
		 conta.setNumeroDaConta(12345);
		 conta.setSaldo(100.0);

		 
		 System.out.println("Digite o valor do saque:");
		 float saque = scan.nextFloat();
		 
		 boolean result = conta.sacar(saque);
		 
		 if(result){
		
			System.out.println(result);
			System.out.println("saque feito com sucesso!");
		
		}else{
			
			System.out.println(result);
			System.out.println("Sua tentativa de saque falhou!");
		}
		 System.out.println("Digite o valor do deposito:");
		 float deposito = scan.nextFloat();
		 
		 boolean result2 = conta.depositar(deposito);
		 
		 if(result2){
		
			System.out.println(result2);
			System.out.println("deposito feito com sucesso!");
		
		}else{
			
			System.out.println(result2);
			System.out.println("Sua tentativa de deposito falhou!");
		}
			
	
		System.out.println("Cliente: " + conta.getCliente().informacoes());
		System.out.println("Número da conta:" + conta.getNumeroDaConta());
		System.out.println("Saldo:" + conta.getSaldo());
	}
}

