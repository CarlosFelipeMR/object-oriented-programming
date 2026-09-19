public class Loja{
	
	public static void main (String[] args) {
		
		Fatura fatura1 = new Fatura(
		1,
		"COCA COLA",
		3,
		11.99);
		Fatura fatura2 = new Fatura(
		2,
		"GUARANA", 
		5,
		8.99);
		
		System.out.println("fatura 1");
		System.out.println(fatura1.getValorDaFatura());
		System.out.println("fatura 2");
		System.out.println(fatura2.getValorDaFatura());
		
	}
}

