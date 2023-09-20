import java.util.Locale;
import java.util.Scanner;


public class Contador {
 
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Informe o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Informe o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
             verificaSeParam1MaiorParam2(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void verificaSeParam1MaiorParam2(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
            
        }
    }
}