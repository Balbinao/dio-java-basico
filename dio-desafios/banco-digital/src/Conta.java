public abstract class Conta {
    private double saldo;
    private int numero;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        cliente.adicionarConta(this); // Vincula a conta ao cliente
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numero + ", Cliente: " + cliente.getNome() + ", Saldo: " + saldo;
    }
}
