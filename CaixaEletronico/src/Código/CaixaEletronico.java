//CAAC
package Código;

import java.util.Scanner;

public class CaixaEletronico {
   
    float saldo = 0;
    double deposito = 0;
    double saque = 0;  
    Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        CaixaEletronico objeto = new CaixaEletronico();
        
        objeto.ClienteSaldo();
        objeto.inicializar();

    }
    public void ClienteSaldo(){
        System.out.println("Digite aqui o seu saldo: ");
        saldo = tcl.nextFloat();        
    }
    /**
     * Ações
     */
    public void Caixa() {
        System.out.println("");
        System.out.println("BEM VINDO AO CAIXA ELETRONICO");
        System.out.println("");
        System.out.println("Digite:");
        System.out.println("");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Saldo");
        System.out.println("4 - Sair");
        System.out.println("");
      
    }
        /**
     *Essa Parte do: %.2f\n foi o Alex 3° inf que me ensinou. ai eu achei intereçante colocar  
     */
    
    public void saldo() {
        System.out.printf("Seu saldo é de: R$%.2f\n", saldo);
    }
    
    public void saque(){
        System.out.println("Digite o valor que deseja sacar");
        tcl = new Scanner(System.in);
        saque = (double) tcl.nextDouble();
        
        if(saldo >= saque){
            saldo -= saque;
            System.out.println("");
            System.out.printf("Seu saldo agora é de: R$ %.2f\n", saldo);
        }else{
            System.out.println("Saldo Insuficiente");
            System.out.printf("Seu saldo atual é de:R$ %.2f\n", saldo);
        }       
    }
 
    public void deposito(){
       System.out.println("");
       System.out.println("digite o valor a ser depositado");
       deposito = tcl.nextDouble();
       saldo += deposito;
       System.out.printf("Seu saldo agora é de: R$%.2f\n", saldo);
    }
 
    public void inicializar(){   
       int acao = 1;
        while (acao != 0) {

            Caixa();

            acao = tcl.nextInt();

            switch (acao) {
                case 1:
                    saque();
                    break;
                case 2:
                    deposito();
                    break;
                case 3:
                    saldo();
                    break;
                case 4:
                    acao = 0;
                    System.out.println("OBRIGADO, VOLTE SEMPRE");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
        
        
    
    }
}




