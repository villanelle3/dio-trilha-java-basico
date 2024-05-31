public interface IConta{
  // tudo é automaticamente publico
  void sacar(double valor);
  void depositar(double valor);
  void transferir(Conta contaDestino, double valor);
  void imprimirExtrato();
}