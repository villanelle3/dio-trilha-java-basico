public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  private Cliente cliente;

  public Conta(Cliente cliente){
    this.agencia = AGENCIA_PADRAO;
    this.numero = Conta.SEQUENCIAL++;
    this.cliente = cliente;
  }

  public int getAgencia() {
      return agencia;
  }
  public int getNumero() {
      return numero;
  }
  public double getSaldo() {
      return saldo;
  }
  public void sacar(double valor) {
      saldo = saldo - valor;
  }
  public void depositar(double valor) {
      saldo += valor;
  }
  public void transferir(Conta contaDestino, double valor) {
      this.sacar(valor);
      contaDestino.depositar(valor);
  }

  public void imprimirDados() {
      System.out.println("Cliente: " + cliente.getNome());
      System.out.println(String.format("Agencia: %d", this.agencia));
      System.out.println(String.format("Numero: %d", this.numero));
      System.out.println(String.format("Saldo: %.2f", this.saldo));
  }
}
