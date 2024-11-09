public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente joao = new Cliente("João", "123.456.789-00");
        Cliente maria = new Cliente("Maria", "987.654.321-00");

        // Criando contas para os clientes
        Conta contaJoaoCorrente = new ContaCorrente(1, joao);
        Conta contaMariaPoupanca = new ContaPoupanca(2, maria);

        // Criando o banco e adicionando as contas
        Banco banco = new Banco();
        banco.adicionarConta(contaJoaoCorrente);
        banco.adicionarConta(contaMariaPoupanca);

        // Operações bancárias
        contaJoaoCorrente.depositar(1000);
        contaJoaoCorrente.transferir(200, contaMariaPoupanca);
        contaMariaPoupanca.sacar(50);

        // Exibe os clientes e suas contas
        for (Conta conta : banco.getContas()) {
            System.out.println(conta);
        }

        // Exibe os clientes e suas contas
        System.out.println("\nClientes e suas contas:");
        System.out.println(joao);
        System.out.println(maria);
    }
}
