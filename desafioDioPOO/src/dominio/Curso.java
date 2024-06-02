package dominio;

public class Curso extends Conteudo {
    // Atributos
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    // Getter para cargaHoraria
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Setter para cargaHoraria
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + " - " + getDescricao() + " - " + cargaHoraria + " horas";
    }
}
