import dominio.Curso;
import dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(80);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}