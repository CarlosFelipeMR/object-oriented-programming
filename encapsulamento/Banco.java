import java.util.Scanner;
public class Banco{
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("digite o nome do cliente");
		String nome = scan.nextLine();
		System.out.println("digite o numero do cliente");
		int numero = scan.nextInt();
		
		ContaCorrente conta1 = new ContaCorrente(nome,numero);
		
		//cadastrar senha
		System.out.println("digite a senha");
		int senha = scan.nextInt();
		
		boolean resultado = conta1.cadastrarSenha(senha);
		
		if(resultado){
			System.out.println("senha cadastrada!");
		}else{
			System.out.println("senha ja cadastrada!");
		}
		
		//alterar senha
		System.out.println("digite a senha");
		senha = scan.nextInt();
		System.out.println("digite a nova senha");
		int novaSenha = scan.nextInt();
		resultado = conta1.alterarSenha(senha,novaSenha);
		
		
		if(resultado){
			System.out.println("senha alterada!");
		}else{
			System.out.println("senha incorreta!");
		}
		
		//creditar
		System.out.println("digite a senha");
		senha = scan.nextInt();
	
		System.out.println("digite o valor a ser creditado");
		double valor = scan.nextDouble();
		resultado = conta1.creditar(senha,valor);
		
		if(resultado){
			System.out.println("valor Creditado com sucesso!");
		}else{
			System.out.println("senha incorreta!");
		}
		
		//debitar
		System.out.println("digite a senha");
		senha = scan.nextInt();
	
		System.out.println("digite o valor a ser debitado");
		valor = scan.nextDouble();
		resultado = conta1.debitar(senha,valor);
		
		if(resultado){
			System.out.println("valor debitado com sucesso!");
		}else{
			System.out.println("senha incorreta!");
		}
		
		//consultar saldo
		System.out.println("digite a senha");
		senha = scan.nextInt();
		
		System.out.println(conta1.consultaSaldo(senha));
	
	}
}

