import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;             // Variável que armazena o número da conta
        String agencia;         // Variável que armazena a agência
        String nomeCliente;     // Variável que armazena o nome do cliente
        double saldo;           // Variavel que armazena o saldo 

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência (Formato xxx-x):");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome e sobrenome do titular da conta:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da conta:");
        saldo = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque.");

    }
}


// javac ContaTerminal.java
// java ContaTerminal
// del ContaTerminal.class
