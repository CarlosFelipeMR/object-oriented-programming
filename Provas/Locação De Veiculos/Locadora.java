import java.util.Scanner;

public class Locadora{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Jetta car1 = new Jetta("ABC-2375","GOL","ECONOMICO",100000);
        Jetta car2 = new Jetta("JHG-1923","DUSTER","SUV",20000);
        Jetta car3 = new Jetta("QWU-2845","BMW","LUXO",4000);

        while (true){

            System.out.println("1 - "+ car1.getModelo());
            System.out.println("2 - "+ car2.getModelo());
            System.out.println("3 - "+ car3.getModelo());
            System.out.println("Ou aperte qualquer outro numero pra sair");

            int opcao1 = scan.nextInt();

            System.out.println();

           Jetta escolhido = null;

            switch (opcao1) {

                case 1:
					escolhido = car1;
					break;

                case 2:
					escolhido = car2;
					break;
                
                case 3:
					escolhido = car3;
					break;
				
				case 4: return;

                default: 
                System.out.println("erro");
                return;
            }

			do{

				System.out.println("1 - Exibir Detalhes");
				System.out.println("2 - Calcular Locação somente pelos Dias ");
				System.out.println("3 - Calcular Locação pelos Dias e Km Rodados");
				System.out.println("4 - Calcular com Seguro Incluso");

				System.out.println("0 - Sair");

				System.out.println();

				int opcao = scan.nextInt();
				int dias,kmRodados;
				System.out.println();

				switch (opcao) {

					case 1:
						scan.nextLine();
						
						System.out.println(escolhido.exibirDetalhes());
						
						System.out.println();

						break;

					case 2:
						
						scan.nextLine();
						
						System.out.println("digite a quantidade de dias de locação:");
						dias = scan.nextInt();
						
						System.out.println(escolhido.calcularlocacao(dias));
						
						System.out.println();

						break;

					case 3:
						
						
						scan.nextLine();
						
						System.out.println("digite a quantidade de dias de locação:");
						dias = scan.nextInt();
						System.out.println("digite a quantidade de Km rodada por dia:");
						kmRodados = scan.nextInt();
						
						System.out.println(escolhido.calcularlocacao(dias,kmRodados));
						
						System.out.println();

						break;
					
					case 4:
						boolean seguro;
						
						scan.nextLine();
						
						System.out.println("digite a quantidade de dias de locação:");
						dias = scan.nextInt();
						System.out.println("digite a quantidade de Km rodada por dia:");
						kmRodados = scan.nextInt();
						System.out.println("digite a true para adicionar o seguro:");
						seguro = scan.nextBoolean();
						

						System.out.println(escolhido.calcularlocacao(dias,kmRodados,seguro));
						
						System.out.println();

						break;

				 
					case 0:

						return;

					default: System.out.println("erro.");
						return;
				}
			}while(true);	
        }
    }
	
}
