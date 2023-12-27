package br.com.bluefox.contas;
public class Conta {
    private final String titular;
    private final String cpf;
    private final int numeroConta;
    private final int numeroAgencia;

    public Conta (String titular, String cpf, int numeroConta, int numeroAgencia) {
        this.titular = titular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
    }

    public String getTitular() {
        return titular;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }
}
