import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        SessaoCinema cine1 = null;

        while (true) {

            System.out.println("1 - Criar sessão com preço do ingresso em 25 R$");
            System.out.println("2 - Criar sessão alterando o preço do ingresso");
            System.out.println("Ou aperte qualquer outro numero pra sair");

            int opcao1 = scan.nextInt();

            System.out.println();

            int numero;
            String filme;
            int capacit;
            double preco;

            switch (opcao1) {

                case 1:

                    System.out.println("Digite o número da sessão:");
                    numero = scan.nextInt();

                    scan.nextLine();

                    System.out.println("Digite o nome do filme:");
                    filme = scan.nextLine();

                    System.out.println("Digite a capacidade da sessão:");
                    capacit = scan.nextInt();

                    cine1 = new SessaoCinema(numero, filme, capacit);

                    break;

                case 2:

                    System.out.println("Digite o número da sessão:");
                    numero = scan.nextInt();

                    scan.nextLine();

                    System.out.println("Digite o nome do filme:");
                    filme = scan.nextLine();

                    System.out.println("Digite a capacidade da sessão:");
                    capacit = scan.nextInt();

                    System.out.println("Digite o preço do ingresso:");
                    preco = scan.nextDouble();

                    cine1 = new SessaoCinema(numero, filme, capacit, preco);

                    break;

                default:

                    return;
            }

            // Sai do primeiro while depois de criar a sessão
            break;
        }


        while (true) {

            System.out.println("1 - Exibir Sessão");
            System.out.println("2 - Exibir Sessão com lotação");
            System.out.println("3 - Comprar Ingresso único");
            System.out.println("4 - Comprar Ingresso em quantidade");
            System.out.println("5 - Comprar Meia entrada ou ingresso em quantidade");
            System.out.println("6 - Calculo de vendas da bilheteria");
            System.out.println("0 - Sair");

            System.out.println();

            int opcao = scan.nextInt();

            System.out.println();

            int quantidade;
            boolean meia;

            switch (opcao) {

                case 1:

                    System.out.println(cine1.exibirSessao());
                    System.out.println();

                    break;

                case 2:

                    System.out.println(cine1.exibirSessao(true));
                    System.out.println();

                    break;

                case 3:

                    System.out.println(cine1.venderIngresso());
                    System.out.println();

                    break;

                case 4:

                    System.out.println("Digite a quantidade de ingressos:");
                    quantidade = scan.nextInt();

                    System.out.println(cine1.venderIngresso(quantidade));
                    System.out.println();

                    break;

                case 5:

                    System.out.println("Digite a quantidade de ingressos:");
                    quantidade = scan.nextInt();

                    System.out.println("Digite true para meia entrada ou false para ingressos normais:");
                    meia = scan.nextBoolean();

                    System.out.println(cine1.venderIngresso(quantidade, meia));
                    System.out.println();

                    break;

                case 6:

                    System.out.println(cine1.calcularBilheteria());
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
