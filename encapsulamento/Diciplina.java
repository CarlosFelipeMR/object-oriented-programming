public class Diciplina{

	public static void main (String[] args) {
	
		AlunoE aluno1 = new AlunoE("Felepi",111,6.0);
		
		System.out.println(aluno1.resultadoFinal());
		
		aluno1.setMedia(4.0);
		
		System.out.println(aluno1.resultadoFinal());
		 
	}
}

