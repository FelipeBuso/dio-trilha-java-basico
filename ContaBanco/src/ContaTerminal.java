
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Felipe Buso
 * @version 1.0
 * @since 17/03/2025
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
