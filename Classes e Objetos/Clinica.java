import java.util.Scanner;

public class Clinica{
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Paciente paciente1 = new Paciente();
		
		System.out.println("digite o nome do primeiro paciente");
		paciente1.nome = scan.nextLine();
		
		System.out.println("digite o sexo do primeiro paciente");
		paciente1.sexo = scan.nextLine();
		
		System.out.println("digite o peso do primeiro paciente");
		paciente1.peso = scan.nextDouble();
		
		System.out.println("digite a altura do primeiro paciente");
		paciente1.altura = scan.nextDouble();
		
		scan.nextLine();
		
		Paciente paciente2 = new Paciente();
		
		System.out.println("digite o nome do segundo paciente");
		paciente2.nome = scan.nextLine();
		
		System.out.println("digite o sexo do segundo paciente");
		paciente2.sexo = scan.nextLine();
		
		System.out.println("digite o peso do segundo paciente");
		paciente2.peso = scan.nextDouble();
		
		System.out.println("digite a altura do segundo paciente");
		paciente2.altura = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("===RESULTADO===\n");
		System.out.println("nome: "+paciente1.nome);
		System.out.println("sexo:"+paciente1.sexo);
		System.out.println("IMC:"+paciente1.CalcularIMC());
		System.out.println("\n");
		System.out.println("nome: "+paciente2.nome);
		System.out.println("sexo:"+paciente2.sexo);
		System.out.println("IMC:"+paciente2.CalcularIMC());
		
	}
}

