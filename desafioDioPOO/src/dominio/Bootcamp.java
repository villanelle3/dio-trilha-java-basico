package dominio;

import java.time.LocalDate;
import java.util.Set;
import java.util.LinkedHashSet;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // Getter para o nome do bootcamp
    public String getNome() {
        return nome;
    }

    // Setter para o nome do bootcamp
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a descrição do bootcamp
    public String getDescricao() {
        return descricao;
    }

    // Setter para a descrição do bootcamp
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para a lista de desenvolvedores inscritos
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    // Getter para a lista de conteúdos do bootcamp
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}
