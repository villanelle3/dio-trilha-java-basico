package dominio;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o desenvolvedor no bootcamp, adicionando todos os conteúdos
     * do bootcamp à lista de conteúdos inscritos do desenvolvedor.
     * @param bootcamp o bootcamp em que o desenvolvedor está se inscrevendo
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Move o primeiro conteúdo da lista de conteúdos inscritos para a lista
     * de conteúdos concluídos, simulando a progressão do desenvolvedor.
     */
    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
     * Calcula o total de XP acumulado pelo desenvolvedor com base nos conteúdos
     * concluídos.
     * @return o total de XP acumulado
     */
    public double calcularTotalXP() {
        return conteudosConcluidos.stream()
            .mapToDouble(Conteudo::calcularXP)
            .sum();
    }

    // Getter para o nome do desenvolvedor
    public String getNome() {
        return nome;
    }

    // Setter para o nome do desenvolvedor
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a lista de conteúdos inscritos
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    // Getter para a lista de conteúdos concluídos
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * Sobrescreve o método equals para comparar desenvolvedores com base no nome.
     * @param o o objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome);
    }

    /**
     * Sobrescreve o método hashCode para gerar um código hash baseado no nome.
     * @return o código hash gerado
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
