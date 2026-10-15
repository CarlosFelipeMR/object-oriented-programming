public class Empresa{

    public static void main(String[] args) {

        // Testando Pessoa
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Carlos");
        pessoa.setEndereco("Rua Central");
        pessoa.setTelefone("99999-9999");

        System.out.println("=== PESSOA ===");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());


        // Testando Fornecedor
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("João");
        fornecedor.setCredito(2000.0);
        fornecedor.setDivida(500.0);

        System.out.println("\n=== FORNECEDOR ===");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Saldo: " + fornecedor.obterSaldo());


        // Testando Empregado
        Empregado empregado = new Empregado();

        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(2000.0);
        empregado.setImposto(10.0);

        System.out.println("\n=== EMPREGADO ===");
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário final: " + empregado.calcularSalario());
    }
}
