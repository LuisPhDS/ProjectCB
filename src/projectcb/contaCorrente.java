package projectcb;
public class contaCorrente extends contaBancaria{

    public contaCorrente(String nome, String cpf, String numeroC, int agencia, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroC = numeroC;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
}
