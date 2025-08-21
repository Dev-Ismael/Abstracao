package Exercicio2;

public interface OperacoesConta {
    void depositar(double valor);
    void sacar(double valor);
    void consultarSaldo();
    double transferir( ContaBancaria contaBancaria, double valor);
}
