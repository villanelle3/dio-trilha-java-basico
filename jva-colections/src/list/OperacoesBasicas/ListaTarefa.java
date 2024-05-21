package jva_colections.src.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributos
    private List<Tarefa> tarefaList;

    // Construtor: NESSE CASO QUERO UMA LISTA VAZIA!
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    // Métodos:
    public void adcionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumTotalDeTarefa(){
        return tarefaList.size();
    }

    public void obterDescricoesDeTarefa(){
        for(Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.adcionarTarefa("Comprar pão");
        lista.adcionarTarefa("Estudar Java");
        lista.obterDescricoesDeTarefa();
        lista.removerTarefa("Comprar pão");
        lista.obterDescricoesDeTarefa();
        System.out.println("Total de tarefas: " + lista.obterNumTotalDeTarefa());
    }
}


// javac -d . Tarefa.java ListaTarefa.java
// java jva_colections.src.list.OperacoesBasicas.ListaTarefa
