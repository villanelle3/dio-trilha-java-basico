package dominio;

import java.time.LocalDate;

public class Mentoria{
    
    private String titulo;
    private String descricao;
    private LocalDate data;
    
    public String getTitulo() {
        return titulo;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
        public String toString(){
        return "Mentoria: " + titulo + " - " + descricao + " - " + data;
        }
    
}