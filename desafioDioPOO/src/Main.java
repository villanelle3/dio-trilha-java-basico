import dominio.Curso;
import dominio.Mentoria;
import dominio.Dev;
import dominio.Bootcamp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação e configuração do objeto Curso
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Curso de Java");
        cursoJava.setCargaHoraria(80);

        // Criação e configuração do objeto Mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Java");
        mentoriaJava.setDescricao("Mentoria de Java");
        mentoriaJava.setData(LocalDate.now());

        // Criação e configuração do Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);

        // Criação e configuração do Dev
        Dev dev = new Dev();
        dev.setNome("Carol");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());

        // Progredir nos conteúdos
        dev.progredir();
        dev.progredir();

        System.out.println("Conteúdos Inscritos de " + dev.getNome() + ": " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + dev.getNome() + ": " + dev.getConteudosConcluidos());
        System.out.println("XP Total: " + dev.calcularTotalXP());
    }
}
