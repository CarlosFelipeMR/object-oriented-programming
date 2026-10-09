
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Estoque estoque = new Estoque();

        int opcao;

        do {
            System.out.println("\n===== MENU DE ESTOQUE =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Buscar produto pelo código");
            System.out.println("3 - Buscar produto pela descrição");
            System.out.println("4 - Excluir produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {

                case 1: {
                    System.out.println("\n--- Adicionar produto ---");

                    System.out.print("Código: ");
                    int codigo = scan.nextInt();

                    System.out.print("Preço: ");
                    float preco = scan.nextFloat();

                    System.out.print("Quantidade: ");
                    int quantidade = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = scan.nextLine();

                    Produto produto = new Produto(
                        codigo, preco, quantidade, descricao
                    );

                    estoque.adicionarProduto(produto);

                    System.out.println("Produto adicionado!");
                    break;
                }

                case 2: {
                    System.out.println("\n--- Buscar por código ---");

                    System.out.print("Digite o código: ");
                    int codigo = scan.nextInt();
                    scan.nextLine();

                    Produto produto = estoque.buscaProduto(codigo);

                    if (produto != null) {
                        System.out.println("Produto encontrado:");
                        System.out.println(produto);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                }

                case 3: {
                    System.out.println("\n--- Buscar por descrição ---");

                    System.out.print("Digite a descrição: ");
                    String descricao = scan.nextLine();

                    Produto produto = estoque.buscaProduto(descricao);

                    if (produto != null) {
                        System.out.println("Produto encontrado:");
                        System.out.println(produto);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                }

                case 4: {
                    System.out.println("\n--- Excluir produto ---");

                    System.out.print("Digite o código do produto: ");
                    int codigo = scan.nextInt();
                    scan.nextLine();

                    Produto produto = estoque.buscaProduto(codigo);

                    if (produto != null) {
                        estoque.excluiProduto(produto);
                        System.out.println("Produto excluído!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                }

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scan.close();
    }
}
