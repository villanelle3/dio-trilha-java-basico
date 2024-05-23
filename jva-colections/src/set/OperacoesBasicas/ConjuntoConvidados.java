package jva_colections.src.set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
      //atributo
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    
}
