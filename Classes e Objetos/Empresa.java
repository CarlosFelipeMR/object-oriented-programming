import java.util.Scanner;

public class Empresa {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.println("digite o nome do primeiro funcionario:");
		funcionario1.nome = scan.nextLine();

		System.out.println("digite as horas trabalhadas do primeiro funcionario:");
		funcionario1.horasTrabalhadas = scan.nextDouble();

		System.out.println("digite o valor da hora do primeiro funcionario:");
		funcionario1.valorHora = scan.nextDouble();
		
		scan.nextLine();
		
		Funcionario funcionario2 = new Funcionario();
		
		System.out.println("digite o nome do segundo funcionario:");
		funcionario2.nome = scan.nextLine();

		System.out.println("digite as horas trabalhadas do segundo funcionario:");
		funcionario2.horasTrabalhadas = scan.nextDouble();

		System.out.println("digite o valor da hora do segundo funcionario:");
		funcionario2.valorHora = scan.nextDouble();

		scan.nextLine();
		
		Funcionario funcionario3 = new Funcionario();
		
		System.out.println("digite o nome do terceiro funcionario:");
		funcionario3.nome = scan.nextLine();

		System.out.println("digite as horas trabalhadas do terceiro funcionario:");
		funcionario3.horasTrabalhadas = scan.nextDouble();

		System.out.println("digite o valor da hora do terceiro funcionario:");
		funcionario3.valorHora = scan.nextDouble();

		scan.nextLine();
		
		System.out.println("=====RESULTADOS=======\n");
		
		System.out.println("nome:"+ funcionario1.nome);
		System.out.println("Salario Final = "+ funcionario1.SalarioFinal());
		
		System.out.println("nome:"+ funcionario2.nome);
		System.out.println("Salario Final = "+ funcionario2.SalarioFinal());
		
		System.out.println("nome:"+ funcionario3.nome);
		System.out.println("Salario Final = "+ funcionario3.SalarioFinal());
	}
}

