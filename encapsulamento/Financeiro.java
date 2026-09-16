public class Financeiro{

	public static void main (String[] args) {
	
		Boleto boleto1 = new Boleto(1,"ÁGUA",10,300.0);
		
		System.out.println(boleto1.pagar(10,30.0,500.0));
		System.out.println(boleto1.exibir());
		
		Boleto boleto2 = new Boleto(2,"LUZ",13,500.0);
		
		System.out.println(boleto2.pagar(14,30.0,600.0));
		System.out.println(boleto2.exibir());

	}
}

