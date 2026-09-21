import java.util.Scanner;

public class Empresa{

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("1 - Salário funcionário 1");
			System.out.println("2 - Salário funcionário 2");
			System.out.println("0 - Sair");
			
			Funcionario1 func1 = new Funcionario1("Felepi",1720.0,15);
			Funcionario1 func2 = new Funcionario1("Rafa",2440.0,7);
			
			int opcao = scan.nextInt();
			
			
			switch (opcao)
			{
				case 1:
					func1.mostrarSalario(82000.0);
					break;
				case 2:
					func2.mostrarSalario(50000.0);
					break;
				case 0 :
					return;
				default:
					return;
			}
		}
	}
}

