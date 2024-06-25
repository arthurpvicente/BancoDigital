package BancoDigital;

public class BancoDigitalApp {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Arthur Vicente");

        IConta contaCorrente = new ContaCorrente(cliente);
        IConta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(300);
        contaCorrente.transferir(200, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
