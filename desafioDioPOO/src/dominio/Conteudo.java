package dominio;

import java.util.Objects;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // Método abstrato para calcular o XP, que deve ser implementado pelas subclasses
    public abstract double calcularXP();

    // Getter para o título do conteúdo
    public String getTitulo() {
        return titulo;
    }

    // Setter para o título do conteúdo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para a descrição do conteúdo
    public String getDescricao() {
        return descricao;
    }

    // Setter para a descrição do conteúdo
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Sobrescreve o método equals para comparar conteúdos com base no título e descrição.
     * @param o o objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(titulo, conteudo.titulo) && 
               Objects.equals(descricao, conteudo.descricao);
    }

    /**
     * Sobrescreve o método hashCode para gerar um código hash baseado no título e descrição.
     * @return o código hash gerado
     */
    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao);
    }
}
