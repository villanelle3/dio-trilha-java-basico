interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        meuIPhone.selecionarMusica("Happier than ever");
        meuIPhone.tocar();
        meuIPhone.pausar();

        meuIPhone.ligar("40028922");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina(); 
    }
}



// javac Main.java
// java Main
// del Main.class