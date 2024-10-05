import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {   
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("\nDigite o número da Agência: ");
    int numero = scanner.nextInt();

    System.out.println("\nDigite a sua Agência: ");
    String agencia = scanner.next();

    scanner.nextLine();

    System.out.println("\nDigite o seu nome completo: ");
    String nomeCliente = scanner.nextLine();

    System.out.println("\nDigite seu saldo: ");
    double saldo = scanner.nextDouble();


    System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
    ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque");
        
    }
}
