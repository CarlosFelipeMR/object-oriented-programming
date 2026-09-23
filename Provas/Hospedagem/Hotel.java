import java.util.Scanner;

public class Hotel{

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Reserva reserva = new Reserva(222, "FELEPI", 5, true);

		Double valorDiaria = 0.0;
		Double valorLimpeza = 0.0;
		Double valorPasseios = 0.0;
		
		Double valorPasseio = 0.0;
		
		
		while(true){
			
			System.out.println("1- Exibir Reserva Sem Detalhes");
			System.out.println("2- Exibir Reserva Com Detalhes");
			System.out.println("3- Calcular Diárias");
			System.out.println("4- Calcular Diárias com taxa de limpeza");
			System.out.println("5- Calcular Passeios");
			System.out.println("6- Calcular Passeios em quantidade");
			System.out.println("7- Valor total da viagem");
			
			int opcao = scan.nextInt();
			
			System.out.println();
			
			String passeio;
			
			
			switch (opcao)
			{
				case 1:
					scan.nextLine();
					
					System.out.println(reserva.exibirReserva());
					
					System.out.println();
					
					break;
				
				case 2:
					boolean ref;
					scan.nextLine();
					
					System.out.println("Digite True para Refeições inclusas ");
					ref = scan.nextBoolean();
					
					System.out.println(reserva.exibirReserva(ref));
					
					System.out.println();
					
					break;
				case 3:
					scan.nextLine();
					
					valorDiaria = reserva.calculaDiaria();

					System.out.println(valorDiaria);
					
					System.out.println();
					break;
					
					
				case 4:
					Double limpeza;

					System.out.println("Digite o valor da taxa de limpeza:");
					limpeza = scan.nextDouble();

					valorLimpeza = limpeza;

					System.out.println(reserva.calculaDiaria(limpeza));

					System.out.println();
					break;
					
					
				case 5:
					
					scan.nextLine();
					
					System.out.println("Digite o Tipo de Passeio:");
					System.out.println("CAVALGADA");
					System.out.println("TRILHA");
					System.out.println("PESCA");
					passeio = scan.nextLine();
					
					valorPasseio = reserva.adicionarPasseio(passeio);

					valorPasseios += valorPasseio;

					System.out.println(valorPasseio);
					
					System.out.println();
					
					break;
					
				case 6:
					int quantidade;
					
					scan.nextLine();
					
					System.out.println("Digite o Tipo de Passeio:");
					System.out.println("CAVALGADA");
					System.out.println("TRILHA");
					System.out.println("PESCA");
					passeio = scan.nextLine();
					
					System.out.println("Digite a Quantidade de vezes que foi no Passeio");
					quantidade = scan.nextInt();
					
					valorPasseio = reserva.adicionarPasseio(passeio, quantidade);

					valorPasseios += valorPasseio;

					System.out.println(valorPasseio);
					break;
					
				case 7:

					Double total = valorDiaria + valorLimpeza + valorPasseios;

					System.out.println("Valor total da viagem: R$ " + total);
					
					System.out.println();
					break;
					
				default:System.out.println("Opção invalida!");
					return;
			}
			
		
			
			
			
			
			
			
		}
	}
}

