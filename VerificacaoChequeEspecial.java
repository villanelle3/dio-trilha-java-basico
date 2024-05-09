import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500.0; 
        scanner.close(); 
        
        verificarSaldo(saldo, saque, limiteChequeEspecial); 
    }
    private static void verificarSaldo(double saldo, double saque, double limiteChequeEspecial) {
        if (saldo >= saque) {
            System.out.println("Transacao realizada com sucesso.");
        }else{
            if(saque - saldo <= 500){
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial."); 
            }else{
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido."); 
            }
        }
    }
}
// javac VerificacaoChequeEspecial.java
// java VerificacaoChequeEspecial
// del VerificacaoChequeEspecial.class