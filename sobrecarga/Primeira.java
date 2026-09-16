public class Primeira{

	public static void main (String[] args) {

		Pessoa pes1 = new Pessoa("felepi");
		System.out.println(pes1.mostraIdade());
		Pessoa pes2 = new Pessoa("jean","M",5,2002);
		System.out.println(pes2.mostraIdade(2,2026));
	}
}

