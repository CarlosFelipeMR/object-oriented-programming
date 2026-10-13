
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SetorPessoal setor = new SetorPessoal(10);

        int opcao;

        do {
            System.out.println("\n===== MENU EMPRESA =====");
            System.out.println("1 - Adicionar funcionário");
            System.out.println("2 - Remover funcionário");
            System.out.println("3 - Buscar por matrícula");
            System.out.println("4 - Buscar por nome");
            System.out.println("5 - Listar por departamento");
            System.out.println("6 - Listar por função");
            System.out.println("7 - Listar todos os funcionários");
            System.out.println("8 - Folha de pagamento por departamento");
            System.out.println("9 - Folha de pagamento da empresa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {

                case 1: {
                    System.out.print("Matrícula: ");
                    int matricula = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Nome: ");
                    String nome = scan.nextLine();

                    System.out.print("Departamento: ");
                    int departamento = scan.nextInt();

                    System.out.print("Salário: ");
                    Double salario = scan.nextDouble();
                    scan.nextLine();

                    System.out.print("Função: ");
                    String funcao = scan.nextLine();

                    Funcionario funcionario = new Funcionario(
                        matricula, nome, departamento, salario, funcao
                    );

                    if (setor.adicionarFuncionario(funcionario)) {
                        System.out.println("Funcionário adicionado!");
                    } else {
                        System.out.println(
                            "Não foi possível adicionar. Verifique se a matrícula ou o nome já existe ou se o vetor está cheio."
                        );
                    }
                    break;
                }

                case 2: {
                    System.out.print("Digite a matrícula: ");
                    int matricula = scan.nextInt();
                    scan.nextLine();

                    Funcionario funcionario =
                        setor.buscarFuncionario(matricula);

                    if (funcionario != null) {
                        if (setor.removerFuncionario(funcionario)) {
                            System.out.println("Funcionário removido!");
                        }
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Digite a matrícula: ");
                    int matricula = scan.nextInt();
                    scan.nextLine();

                    Funcionario funcionario =
                        setor.buscarFuncionario(matricula);

                    if (funcionario != null) {
                        System.out.println(funcionario);
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Digite o nome: ");
                    String nome = scan.nextLine();

                    Funcionario funcionario =
                        setor.buscarFuncionario(nome);

                    if (funcionario != null) {
                        System.out.println(funcionario);
                    } else {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                }

                case 5: {
                    System.out.print("Digite o departamento: ");
                    int departamento = scan.nextInt();
                    scan.nextLine();

                    Funcionario[] lista =
                        setor.listarFuncionarios(departamento);

                    if (lista.length == 0) {
                        System.out.println("Nenhum funcionário encontrado.");
                    }

                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(lista[i]);
                    }
                    break;
                }

                case 6: {
                    System.out.print("Digite a função: ");
                    String funcao = scan.nextLine();

                    Funcionario[] lista =
                        setor.listarFuncionarios(funcao);

                    if (lista.length == 0) {
                        System.out.println("Nenhum funcionário encontrado.");
                    }

                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(lista[i]);
                    }
                    break;
                }

                case 7: {
                    Funcionario[] lista = setor.listarFuncionarios();

                    if (lista.length == 0) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }

                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(lista[i]);
                    }
                    break;
                }

                case 8: {
                    System.out.print("Digite o departamento: ");
                    int departamento = scan.nextInt();
                    scan.nextLine();

                    Funcionario[] lista =
                        setor.listarFuncionarios(departamento);

                    double total = 0;

                    for (int i = 0; i < lista.length; i++) {
                        total += lista[i].getSalario();
                    }

                    System.out.printf(
                        "Total da folha do departamento: R$ %.2f%n", total
                    );
                    break;
                }

                case 9: {
                    Funcionario[] lista = setor.listarFuncionarios();

                    double total = 0;

                    for (int i = 0; i < lista.length; i++) {
                        total += lista[i].getSalario();
                    }

                    System.out.printf(
                        "Total da folha da empresa: R$ %.2f%n", total
                    );
                    break;
                }

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scan.close();
    }
}
