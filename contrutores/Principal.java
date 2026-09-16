public class Principal {
	
	public static void main (String[] args) {
		
		Quadrado quadrado1 = new Quadrado(5.0);
		Quadrado quadrado2 = new Quadrado(8.0);
		
		System.out.println("---RESULTADO---");
		System.out.println("QUADRADO 1");
		System.out.println("Àrea:"+quadrado1.calcularArea());
		System.out.println("Perimetro:"+quadrado1.CalcularPerimetro());
		
		System.out.println("\n\n");
		
		System.out.println("---RESULTADO---");
		System.out.println("QUADRADO 2");
		System.out.println("Àrea:"+quadrado2.calcularArea());
		System.out.println("Perimetro:"+quadrado2.CalcularPerimetro());
		
	}
}

