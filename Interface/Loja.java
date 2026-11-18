
public class Loja {

    public static void main(String[] args) {

        FoneDeOuvido fone = new FoneDeOuvido(
            "JBL", "Tune 520BT", 200.0, "Bluetooth"
        );

        Smartphone celular = new Smartphone(
            "Samsung", "Galaxy A15", 1500.0, 128
        );

        Notebook notebook = new Notebook(
            "Acer", "Aspire 5", 3500.0, "Ryzen 7"
        );

        Smartwatch relogio = new Smartwatch(
            "Samsung", "Galaxy Watch", 1000.0, true
        );

        System.out.println("=== FONE DE OUVIDO ===");
        System.out.println(fone.detalhar());
        System.out.println("Desconto: R$ " + fone.aplicarDesconto(10.0));
        System.out.println("Preco final: R$ " + fone.precoFinal());

        System.out.println("\n=== SMARTPHONE ===");
        System.out.println(celular.detalhar());
        System.out.println("Desconto: R$ " + celular.aplicarDesconto(10.0));
        System.out.println("Preco final: R$ " + celular.precoFinal());

        System.out.println("\n=== NOTEBOOK ===");
        System.out.println(notebook.detalhar());
        System.out.println("Desconto: R$ " + notebook.aplicarDesconto(10.0));
        System.out.println("Preco final: R$ " + notebook.precoFinal());

        System.out.println("\n=== SMARTWATCH ===");
        System.out.println(relogio.detalhar());
        System.out.println("Preco final: R$ " + relogio.precoFinal());

        relogio.setResistenteAgua(false);
        System.out.println("Garantia sem resistencia a agua: "
                + relogio.tempoGarantia() + " meses");
    }
}
