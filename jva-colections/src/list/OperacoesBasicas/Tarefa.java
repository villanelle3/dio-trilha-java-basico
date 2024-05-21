package jva_colections.src.list.OperacoesBasicas;

// Passos:
// 1 - atributos
// 2 - construtor
// 3 - getters

class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

