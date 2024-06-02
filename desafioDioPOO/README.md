# Projeto de Bootcamp de Desenvolvimento Java

Este projeto simula um sistema de bootcamp para desenvolvedores, onde é possível criar cursos e mentorias, inscrever desenvolvedores em bootcamps e acompanhar o progresso dos desenvolvedores nos conteúdos.

## Estrutura do Projeto

O projeto está organizado no pacote `dominio` e contém as seguintes classes principais:

- `Conteudo`: Classe abstrata que define a estrutura básica de um conteúdo, incluindo métodos para cálculo de XP e getters/setters para título e descrição.
- `Curso`: Subclasse de `Conteudo` que representa um curso com uma carga horária.
- `Mentoria`: Subclasse de `Conteudo` que representa uma mentoria com uma data específica.
- `Dev`: Classe que representa um desenvolvedor, contendo métodos para inscrição em bootcamps, progressão em conteúdos e cálculo de XP total.
- `Bootcamp`: Classe que representa um bootcamp, contendo uma lista de conteúdos e desenvolvedores inscritos.

### Classes e Métodos

#### Conteudo

Classe abstrata que define a estrutura de um conteúdo.

```java
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    
    public abstract double calcularXP();
    
    // Getters e Setters
}
