public class Escola{

	public static void main (String[] args) {
	
		
		System.out.println("Classe Pessoa\n\n");
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Jean");
		pessoa.setCpf("123.456.788-02");
		pessoa.setTelefone("38991237543");
		
		System.out.println("Nome:"+ pessoa.getNome());
		System.out.println("CPF:"+ pessoa.getCpf());
		System.out.println("Telefone:"+ pessoa.getTelefone());
		
		System.out.println();
		System.out.println("Classe Aluno\n\n");
		Aluno aluno = new Aluno();
		
		aluno.setNome("Felipe");
		aluno.setCpf("124.154.156.09");
		aluno.setTelefone("38991237678");
		aluno.setMatricula("1234");
		aluno.setCurso("BSI");
		aluno.setNota1(5.0);
		aluno.setNota2(5.0);
		
		System.out.println("Nome:"+ aluno.getNome());
		System.out.println("CPF:"+ aluno.getCpf());
		System.out.println("Telefone:"+ aluno.getTelefone());
		System.out.println("Matricula:"+ aluno.getMatricula());
		System.out.println("Curso:"+ aluno.getCurso());
		System.out.println("Média:"+ aluno.calculaMedia());
		System.out.println("Situação:"+ aluno.situacao());
		
		
		System.out.println("\n\n");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("João");
		aluno2.setCpf("145.124.156-49");
		aluno2.setTelefone("38998232678");
		aluno2.setMatricula("1235");
		aluno2.setCurso("Ensino Médio");
		aluno2.setNota1(8.0);
		aluno2.setNota2(9.0);
		
		System.out.println("Nome:"+ aluno2.getNome());
		System.out.println("CPF:"+ aluno2.getCpf());
		System.out.println("Telefone:"+ aluno2.getTelefone());
		System.out.println("Matricula:"+ aluno2.getMatricula());
		System.out.println("Curso:"+ aluno2.getCurso());
		System.out.println("Média:"+ aluno2.calculaMedia());
		System.out.println("Situação:"+ aluno2.situacao());
		
		System.out.println();
		System.out.println("Classe Professor\n\n");
		Professor professor = new Professor();
		
		professor.setNome("Adriano");
		professor.setCpf("123.256.409-02");
		professor.setTelefone("38991961543");
		professor.setDiciplina("Redes");
		professor.setValorHoraAula(50.0);
		professor.setQuantidadeHoras(10);
		
		System.out.println("Nome:"+ professor.getNome());
		System.out.println("CPF:"+ professor.getCpf());
		System.out.println("Telefone:"+ professor.getTelefone());
		System.out.println("Diciplina:"+ professor.getDiciplina());
		System.out.println("Total Pago:R$ "+ professor.calculaPagamento());
		
		
		
	}
}

