import java.util.Scanner;
import java.text.DecimalFormat;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0.0; 
        boolean continuar = true;

        while (continuar) { 

            System.out.println("Escolha uma opção:");
            System.out.println("\t1. Depositar");
            System.out.println("\t2. Sacar");
            System.out.println("\t3. Consultar saldo");
            System.out.println("\t0. Encerrar");

            int opcao = scanner.nextInt(); 
            
            switch(opcao) {
                case 1:
                    boolean valorValido = false;
                    do {
                        System.out.println("Por favor, digite o valor a ser depositado:");
                        try {
                            double valorDepositar = scanner.nextDouble();
                            saldo = depositar(valorDepositar, saldo);
                            System.out.println("Saldo atual: " + saldo);
                            valorValido = true;
                        } catch (Exception e) {
                            System.out.println("Valor inválido! Tente novamente.");
                            scanner.nextLine();
                        }
                    } while (!valorValido);
                    break;

                case 2:
                    boolean valorValidoSaque = false;
                    do {
                        System.out.println("Por favor, digite o valor a ser sacado:");
                        try {
                            double valorSacar = scanner.nextDouble();
                            valorValidoSaque = true;
                            if (saldo >= valorSacar){
                                saldo = sacar(valorSacar, saldo);
                                System.out.println("Saldo atual: " + saldo);
                            }else{
                                System.out.println("Saldo insuficiente.");
                            }
                        } catch (Exception e) {
                            System.out.println("Valor inválido! Tente novamente.");
                            scanner.nextLine();
                        }
                    } while (!valorValidoSaque);
                    break;
                case 3:
                System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        }
    }
    
    static String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(valor);
    }

    static double depositar(double valorDepositar, double saldoInicial ) {
        double saldoFinal = valorDepositar + saldoInicial;
        return saldoFinal;
	}

    static double sacar(double valorSacar, double saldoInicial ) {
        double saldoFinal = saldoInicial - valorSacar;
        return saldoFinal;
	}
}

// javac SimulacaoBancaria.java
// java SimulacaoBancaria
// del SimulacaoBancaria.class
