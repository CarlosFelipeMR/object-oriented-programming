public class One{

	public static void main (String[] args) {
	
		Veiculo vec1 = new Veiculo(10.0);
		System.out.println(vec1.autonomia());
		System.out.println(vec1.autonomia("ETANOL",20.0));
		System.out.println(vec1.autonomia("ETANOL",true));
	}
}

