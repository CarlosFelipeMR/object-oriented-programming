import java.util.Scanner;

public class Tempo{
    
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        
        Data hoje = new Data(19,10,2026);
        Data data = new Data(24,06,2006);
        
        System.out.println(hoje.retornarData());
        System.out.println(data.retornarData());
        
        Gente pessoa1 = new Gente("Felipe");
        Gente pessoa2 = new Gente("Jean","Masculino",data);
        
        System.out.println(pessoa1.mostraIdade(hoje));
        System.out.println(pessoa2.mostraIdade(hoje));
        
        
    }
}
