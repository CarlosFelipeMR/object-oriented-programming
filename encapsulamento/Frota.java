public class Frota{

	public static void main (String[] args) {
		
		Carro carro1 = new Carro(10.0);
		
		System.out.println("quilometragem inicial:\n"
		+ carro1.getQuilometragem()+"km");
		System.out.println("cobustivel inicial:\n"
		+ carro1.getCombustivel()+"L");
		
		carro1.percorrerDistancia(60);
		
		System.out.println("quilometragem atual:\n"
		+ carro1.getQuilometragem()+"km");
		System.out.println("Combustivel Pós viagem:\n"
		+ carro1.getCombustivel()+"L");
		
		carro1.abastecer(20.0);
		
		System.out.println("dps do abastecimento:\n"
		+ carro1.getCombustivel()+"L");
		
		System.out.println("ainda da pra rodar:"
		+ carro1.autonomia()+"km");
		
	}
}

