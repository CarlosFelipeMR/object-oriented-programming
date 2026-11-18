
public class Principal {

    public static void main(String[] args) {

        CartaoWeb natal = new Natal("Carlos");
        CartaoWeb aniversario = new Aniversario("Ana");
        CartaoWeb namorados = new DiaDosNamorados("Maria");

        System.out.println(natal.showMessage());
        System.out.println(aniversario.showMessage());
        System.out.println(namorados.showMessage());
    }
}
