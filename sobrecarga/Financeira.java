public class Financeira{

	public static void main (String[] args) {

		Emprestimo1 empre = new Emprestimo1("Felepi",5000.0);
		
		
		System.out.println(empre.getNomeCliente());
		
		System.out.println("sem parâmetro:"+empre.calcularEmprestimo());
		System.out.println("com parâmetro:"+empre.calcularEmprestimo(10));
		System.out.println("taxa:"+empre.calcularEmprestimo(10.0));
		
		Emprestimo1 emprestimo = new Emprestimo1();
		
		
		emprestimo.setNomeCliente("Gelado");
		emprestimo.setRenda(10000.0);
		
		System.out.println(emprestimo.getNomeCliente());
		
		System.out.println("sem parâmetro:"+emprestimo.calcularEmprestimo());
		System.out.println("com parâmetro:"+emprestimo.calcularEmprestimo(17));
		System.out.println("taxa:"+emprestimo.calcularEmprestimo(15.0));
		
		
	}
}

