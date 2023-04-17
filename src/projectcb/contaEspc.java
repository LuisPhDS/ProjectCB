package projectcb;
public class contaEspc extends contaBancaria{
    double credito;

    public contaEspc(String nome, String cpf, String numeroC, int agencia, double saldo, double credito) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroC = numeroC;
        this.agencia = agencia;
        this.saldo = saldo;
        this.credito = credito;
    }

    
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    @Override
    public int sacar(double saque){
        if(getSaldo() + getCredito() < saque){
            return -1;
        }else{
            setSaldo(getSaldo() - saque);
        }
        return 0;
    }
}
