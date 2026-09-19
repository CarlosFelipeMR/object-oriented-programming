import java.util.Scanner;

public class  Turma{
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		
		System.out.println("digite o nome do primeiro aluno");
		aluno1.nome = scan.nextLine();
		System.out.println("digite a nota 1 do primeiro aluno");
		aluno1.nota1 = scan.nextDouble();
		System.out.println("digite a nota 2 do primeiro aluno");
		aluno1.nota2 = scan.nextDouble();
		
		scan.nextLine();

		Aluno aluno2 = new Aluno();
		
		System.out.println("digite o nome do segundo aluno");
		aluno2.nome = scan.nextLine();
		System.out.println("digite a nota 1 do segundo aluno");
		aluno2.nota1 = scan.nextDouble();
		System.out.println("digite a nota 2 do segundo aluno");
		aluno2.nota2 = scan.nextDouble();
		
		scan.nextLine();
		
		System.out.println("====resultado====\n");
	
		System.out.println("Nome:"+aluno1.nome);
		System.out.println("Média:"+aluno1.Media());
		System.out.println(aluno1.Resultado());
		
		System.out.println("\n");
		
		System.out.println("Nome:"+aluno2.nome);
		System.out.println("Média:"+aluno2.Media());
		System.out.println(aluno2.Resultado());	
	
		scan.close();
	
	
		
	
	
	
	

	
	
	
	
	}
}

