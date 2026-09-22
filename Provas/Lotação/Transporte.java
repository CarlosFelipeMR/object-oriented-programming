import java.util.Scanner;

public class Transporte {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Onibus oni1 = null;

        while (true){

            System.out.println("1 - Criar ônibus com preço tarifa em R$ 4,50 ");
            System.out.println("2 - Criar ônibus alterando o preço da tarifa");
            System.out.println("Ou aperte qualquer outro numero pra sair");

            int opcao1 = scan.nextInt();

            System.out.println();

            int numero;
            String linha;
            int capacidade;
            double tarifa;

            switch (opcao1) {

                case 1:

                    System.out.println("Digite o número da lotação:");
                    numero = scan.nextInt();

                    scan.nextLine();

                    System.out.println("Digite o nome da linha:");
                    linha = scan.nextLine();

                    System.out.println("Digite a capacidade da lotação:");
                    capacidade = scan.nextInt();

                    oni1 = new Onibus(numero, linha, capacidade);

                    break;

                case 2:

                    System.out.println("Digite o número da lotação:");
                    numero = scan.nextInt();

                    scan.nextLine();

                    System.out.println("Digite o nome da linha:");
                    linha = scan.nextLine();

                    System.out.println("Digite a capacidade da lotação:");
                    capacidade = scan.nextInt();

                    System.out.println("Digite o preço da tarifa:");
                    tarifa = scan.nextDouble();

                    oni1 = new Onibus(numero, linha, capacidade, tarifa);

                    break;

                default:

                    return;
            }

         
            break;
        }


        while (true) {

            System.out.println("1 - Exibir Sessão");
            System.out.println("2 - Exibir Lotação Detalhada");
            System.out.println("3 - Embarcar Passageiro Único");
            System.out.println("4 - Embarcar Passageiros Em Quantidade");
            System.out.println("5 - Dembarcar Passageiro Único");
            System.out.println("6 - Dembarcar Passageiros Em Quantidade");
			System.out.println("7 - Calculo de Renda");
            System.out.println("0 - Sair");

            System.out.println();

            int opcao = scan.nextInt();

            System.out.println();

			
           
			int quantidade;
			boolean result;
            switch (opcao) {

                case 1:
					scan.nextLine();
					System.out.println(oni1.exibirInfo());
                    System.out.println();

                    break;

                case 2:
					boolean detalhe;
					scan.nextLine();
                    System.out.println("Digite true para ver mais detalhado ou false para menos detalhado:");
                    detalhe = scan.nextBoolean();
                    System.out.println(oni1.exibirInfo(detalhe));
                    System.out.println();

                    break;

                case 3:
					result = oni1.embarcarPassageiro();
					
					scan.nextLine();
                    
                    System.out.println(result);
                    
                    if(result){
						
						System.out.println("embarque concluido com sucesso!");
						
					}else{
						System.out.println("embarque não concluido!");
					}
                    System.out.println();

                    break;

                case 4:
					
					scan.nextLine();
					
					System.out.println("Digite a quantidade de passageiros a embarcar:");
					quantidade = scan.nextInt();
					
					result = oni1.embarcarPassageiro(quantidade);
					
					System.out.println(result);
					
					if(oni1.embarcarPassageiro(quantidade)){
						
						System.out.println("embarque concluido com sucesso!");
						
					}else{
						System.out.println("embarque não concluido!");
					}
					System.out.println();

                    break;

                case 5:
					scan.nextLine();
					
					result = oni1.desembarcarPassageiro();
					
					System.out.println(result);
					
					if(result){
						
						System.out.println("desembarque concluido com sucesso!");
						
					}else{
						System.out.println("desembarque não concluido!");
					}
                   
                    System.out.println();

                    break;

                case 6:
					scan.nextLine();
					
					System.out.println("Digite a quantidade de passageiros a desembarcar:");
					quantidade = scan.nextInt();
					
					result = oni1.desembarcarPassageiro(quantidade);
					
					if(result){
						
						System.out.println("desembarque concluido com sucesso!");
						
					}else{
						System.out.println("desembarque não concluido!");
					}
                   
                    
                    System.out.println();

                    break;
				
				case 7:
					scan.nextLine();
					String tarifa;
                    System.out.println("digite o tipo de tarifa:");
					System.out.println("SIMPLES ou INTEGRADA");
					tarifa = scan.nextLine();
					System.out.println(oni1.calcularRenda(tarifa));
					
					
                    System.out.println();
                    
                    break;
                case 0:

                    return;

                default:

                    return;
            }
        }
    }

}
