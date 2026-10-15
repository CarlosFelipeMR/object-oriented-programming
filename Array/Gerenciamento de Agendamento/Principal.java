import java.util.Scanner;

public class Principal{

	public static void main (String[] args) {
		
		Pessoa pessoa;
		Pessoa pessoaAntiga;
		Pessoa pessoaNova;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Nome da Agenda:");
		String nome = scan.nextLine();
		
		System.out.println("Digite o Tamanho do Vetor:");
		int tamanho = scan.nextInt();
		
		Agenda agenda = new Agenda(nome,tamanho);
		
		while(true){
			System.out.println("1- Adicionar Contato");
			System.out.println("2- Remover Contato");
			System.out.println("3- Alterar Contato");
			System.out.println("4- Listar Contatos");
			System.out.println("5- Buscar Contato");
			
			int opc = scan.nextInt();
			
			switch (opc)
			{
				case 1:
					scan.nextLine();
					
					System.out.println("digite o nome:");
					String nome1 = scan.nextLine();
					
					System.out.println("Dia de nascimento:");
					int dia = scan.nextInt();
					
					System.out.println("Mês de nascimento:");
					int mes = scan.nextInt();
					
					scan.nextLine();
					
					System.out.println("Telefone:");
					String telefone = scan.nextLine();
					
					pessoa = new Pessoa(nome1,dia,mes,telefone);
					
					if (agenda.adicionaPessoa(pessoa)){
						
						System.out.println("Contato cadastrado com sucesso!");
					
					}else{
						
						System.out.println("Falha ao cadastrar contato!");
					}	
					break;
				case 2:
					scan.nextLine();
					
					System.out.println("digite o nome:");
					String nome2 = scan.nextLine();
					
					pessoa = agenda.buscaContato(nome2);
					
					if (agenda.removePessoa(pessoa)){
						
						System.out.println("Contato excluido com sucesso!");
					
					}else{
						
						System.out.println("Falha ao excluir contato!");
					}	
					
					break;
				case 3:
					scan.nextLine();
					
					System.out.println("digite o nome da pessoa que deseja alterar o contato:");
					String nome3 = scan.nextLine();
					
					
					System.out.println("oq vc deseja alterar:");
					System.out.println("1- Dia do nascimento");
					System.out.println("2- Mês do nascimento");
					System.out.println("3- telefone");
					int opc1 = scan.nextInt();
					
					switch (opc1) {
						case 1:
							pessoaAntiga = agenda.buscaContato(nome3);

							if (pessoaAntiga != null) {
								System.out.println("Dia de nascimento:");
								int dia1 = scan.nextInt();

								pessoaNova = new Pessoa(
									pessoaAntiga.getNome(),
									dia1,
									pessoaAntiga.getMesDeNascimento(),
									pessoaAntiga.getTelefone()
								);

								agenda.alteraInformacoes(pessoaNova);
							}
							break;

						case 2:
							pessoaAntiga = agenda.buscaContato(nome3);

							if (pessoaAntiga != null) {
								System.out.println("Mês de nascimento:");
								int mes1 = scan.nextInt();

								pessoaNova = new Pessoa(
									pessoaAntiga.getNome(),
									pessoaAntiga.getDiaDeNascimento(),
									mes1,
									pessoaAntiga.getTelefone()
								);

								agenda.alteraInformacoes(pessoaNova);
							}
							break;

						case 3:
							pessoaAntiga = agenda.buscaContato(nome3);

							if (pessoaAntiga != null) {
								scan.nextLine();

								System.out.println("Telefone:");
								String telefone1 = scan.nextLine();

								pessoaNova = new Pessoa(
									pessoaAntiga.getNome(),
									pessoaAntiga.getDiaDeNascimento(),
									pessoaAntiga.getMesDeNascimento(),
									telefone1
								);

								agenda.alteraInformacoes(pessoaNova);
							}
							break;

						default:
							System.out.println("Opção inválida!");
					}
					break;
				case 4:
					Pessoa[] pessoas = agenda.buscaPessoas();

					for (int i = 0; i < pessoas.length; i++) {
						if (pessoas[i] != null) {
							System.out.println(pessoas[i]);
						}
					}

					break;
				case 5:
					scan.nextLine();

					System.out.println("Digite o nome da pessoa que deseja buscar:");
					String nomeBusca = scan.nextLine();

					Pessoa pessoaEncontrada = agenda.buscaContato(nomeBusca);

					if (pessoaEncontrada != null) {
						System.out.println(pessoaEncontrada);
					} else {
						System.out.println("Contato não encontrado!");
					}

					break;
					
				default:
					
			}
			
		}
	}
}

