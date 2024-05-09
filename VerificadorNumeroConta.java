import java.util.Scanner; 

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String numeroConta = scanner.nextLine();
        
        verificarNumeroConta(numeroConta); 
    }


    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }else{
            System.out.println("Numero de conta valido.");
        }
    }
}

// javac VerificadorNumeroConta.java
// java VerificadorNumeroConta
// del VerificadorNumeroConta.class