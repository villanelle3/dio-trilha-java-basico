import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contasList;

    public Banco() {
        // this.contasList = new ArrayList<>(); 
        this.contasList = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contasList;
    }

    public void setContas(List<Conta> contasList) {
        this.contasList = contasList;
    }

    public void adicionarConta(Conta conta) {
        this.contasList.add(conta);
    }

    public void exibirContas() {
        for (Conta conta : contasList) {
            conta.imprimirDados();  
        }
    }
}
