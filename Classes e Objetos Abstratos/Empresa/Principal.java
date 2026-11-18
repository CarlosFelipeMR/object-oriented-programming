
public class Principal {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor(
            "Carlos", "Rua A", "999999999",
            5000.0, 1500.0
        );

        Administrador administrador = new Administrador(
            "Ana", "Rua B", "988888888",
            1, 4000.0, 500.0, 800.0
        );

        Operario operario = new Operario(
            "Pedro", "Rua C", "977777777",
            2, 2500.0, 300.0, 10000.0, 0.05
        );

        Vendedor vendedor = new Vendedor(
            "Maria", "Rua D", "966666666",
            3, 2000.0, 200.0, 15000.0, 0.10
        );

        System.out.println("Fornecedor: " + fornecedor.getNome());
        System.out.println("Saldo: R$ " + fornecedor.obterSaldo());

        System.out.println("\nAdministrador: " + administrador.getNome());
        System.out.println("Salario: R$ " + administrador.calculaSalario());

        System.out.println("\nOperario: " + operario.getNome());
        System.out.println("Salario: R$ " + operario.calculaSalario());

        System.out.println("\nVendedor: " + vendedor.getNome());
        System.out.println("Salario: R$ " + vendedor.calculaSalario());
    }
}
