package projectcb;
public abstract class contaBancaria {
    String numeroC, cpf, nome;
    int agencia;
    double saldo;
    
    public int sacar(double saque){
        if(getSaldo()< saque){
            return -1;
        }else{
            setSaldo(getSaldo()-saque);
        }
        return 0;
    }
    public void depositar(double deposito){
        setSaldo(getSaldo() + deposito);
    }    
    public void consultarSaldo(){
        System.out.println(toString());
    }
    
    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numero) {
        this.numeroC = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Consulta:" +
                "\n Nome= " + nome +
                "\n CPF= " + cpf +
                "\n Saldo= " + saldo+
                "\n numero da conta= " + numeroC +
                "\n Agencia= " + agencia;
    }

    
    
}
