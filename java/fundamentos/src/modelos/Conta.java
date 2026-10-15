package modelos;

public class Conta {

    public String cpfCliente;
    public int agencia;
    public double saldo;
    public int numeroConta;


    public Conta () {

    }

    public Conta (String cpfParam, int agenciaParam, int numParam) {
        this.cpfCliente = cpfParam;
        this.agencia = agenciaParam;
        this.numeroConta = numParam;
    }

    public void exibirSaldo() {
        System.out.println("\nSaldo atual da conta é de: R$" + this.saldo);
    }

    public void depositar(double valor) {

        this.saldo += valor;
        System.out.println("\nDepósito de R$" + valor + " concluído com sucesso!");
    }

    public void sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$"  + valor + " concluído com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }
}
