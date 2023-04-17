package projectcb;

import java.util.Scanner;

public class ProjectCB {
    public static void main(String[] args) {
     contaCorrente[] conta = new contaCorrente[10];
     Scanner tc = new Scanner(System.in);
     String nome,cpf,numeroC;
     int agencia;
     double saldo;
     
        for (int i = 0; i < conta.length ; i++) {
            System.out.println("Defina a conta "+ i);
            System.out.print("Nome: ");
            nome = tc.next();
            System.out.print("CPF: ");
            cpf = tc.next();
            System.out.print("Numero da conta: ");
            numeroC = tc.next();
            System.out.print("Numero da agencia: ");
            agencia = tc.nextInt();
            System.out.print("Saldo: ");
            saldo = tc.nextDouble();
            
            conta[i] = new contaCorrente(nome,cpf,numeroC,agencia,saldo);
        }
        int opc;
        int opc1;
        System.out.println("Qual conta deseja manipular?");
        opc1 = tc.nextInt();
        do{
            System.out.println("----------");
            System.out.println("""
                               O que deseja fazer?
                                1) Sacar 
                                2) Consultar Saldo
                                3) Depositar
                                0) Sair""");
            opc = tc.nextInt();
            switch(opc){
                case 0 -> System.out.println("Encerrando operação...");
                case 1 -> {
                    System.out.print("Digite o valor do saque: ");
                    saldo = tc.nextDouble();
                        if(conta[opc1].sacar(saldo)== -1){
                            System.out.println("Valor maior que o saldo disponivel...");
                        }else{
                            conta[opc1].sacar(saldo);
                        }
                    }
                case 2 -> conta[opc1].consultarSaldo();
                case 3 -> {
                    System.out.print("Digite o valor do saldo: ");
                    saldo = tc.nextDouble();
                    conta[opc1].depositar(saldo);
                }
                default -> { 
                    System.out.println("Opção invalida");
                }
            }
        }while(opc != 0);
    }  
}
