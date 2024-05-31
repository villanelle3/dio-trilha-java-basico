public class Main {
  public static void main(String[] args) {

     Banco b = new Banco();
     b.setNome("Banco do Brasil");

    Cliente laura = new Cliente();
    laura.setNome("Laura");
    
    Conta cc = new ContaCorrente(laura);
    cc.depositar(100);
    Conta cp = new ContaPoupanca(laura);
    cc.transferir(cp, 50);

    cc.imprimirExtrato();
    cp.imprimirExtrato();

    System.out.println(" ");
    
    Cliente joao = new Cliente();
    joao.setNome("Joao");

    Conta cc2 = new ContaCorrente(joao);
    cc2.depositar(720);
    Conta cp2 = new ContaPoupanca(joao);

    cc2.imprimirExtrato();
    cp2.imprimirExtrato();

    System.out.println(" ");

    b.adicionarConta(cc);
    b.adicionarConta(cc2);

    b.exibirContas();
  }
}