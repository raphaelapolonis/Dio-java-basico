
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome_cliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nome_cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo do cliente (utilizar vírgula, nao ponto, para decimais): ");
        saldo = scanner.nextFloat();
        
        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
