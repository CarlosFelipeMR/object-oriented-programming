public class Loja1{

	public static void main (String[] args) {
	
		Cliente cliente = new Cliente("FELEPI","164.124.156.02",2000.0);
		Produto produto = new Produto(1,"AÇAI",15.0);
		
		Venda venda = new Venda(1,cliente,produto,2);
		
		System.out.println(venda.imprimir());
	}
}

