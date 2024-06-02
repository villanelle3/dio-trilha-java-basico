package dominio;

public class Curso {
    // atributos
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    // getters
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return "Curso: " + titulo + " - " + descricao + " - " + cargaHoraria;
    }
    
}