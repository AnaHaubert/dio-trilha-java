import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a agência.");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta.");
        int numeroConta = scanner.nextInt();

        //extrato
        System.out.println("Digite o valor do depósito inicial.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta é " + numeroConta + " e seu saldo no valor de R$ " + String.format("%.2f", saldo) + " já está disponível para saque!");
    }
}
