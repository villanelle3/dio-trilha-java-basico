import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("\tProcesso seletivo\n"); 
        selecaoCandidatos();
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(valor);
    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
        do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("\nCONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
        System.out.println("\nNÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }

    static void imprimirSelecionados(String[] listaSelecionados){
        System.out.println("\tLISTA DE SELECIONADOS \n"); 
        for (int i = 0; i < listaSelecionados.length; i++ ){
            if (listaSelecionados[i] != null) {
                System.out.println(i + " - " + listaSelecionados[i]);
            }
        }
        // System.out.println("\tLISTA DE SELECIONADOS NOVAMENTE: \n"); 
        for (String selecionado : listaSelecionados) {
            if (selecionado != null) {
                // System.out.println(selecionado);
                entrandoEmContato(selecionado);
            }
        }
    }

    static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        String[] listaSelecionados = new String[5];
        double salarioBase = 2000.0;
        int candiadatosSelecionados = 0;
        int i = 0;
        while(candiadatosSelecionados < 5 && i < candidatos.length){
            String candiadato = candidatos[i];
            double salarioPretendido = valorPretendido();
            System.out.println("O candiadato " + candiadato + " solicitou esse valor de salario R$ " + formatarValor(salarioPretendido));
            if (salarioBase >= salarioPretendido){
                System.out.println("[OK] O candiadato " + candiadato + " foi selecionado para a vaga\n");
                listaSelecionados[candiadatosSelecionados] = candiadato;
                candiadatosSelecionados++;
            }else{
                System.out.println("[NÃO OK] O candiadato " + candiadato + " não foi selecionado para a vaga\n");
            }
            i++;
        }
        imprimirSelecionados(listaSelecionados);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}

// javac ProcessoSeletivo.java
// java ProcessoSeletivo
// del ProcessoSeletivo.class
