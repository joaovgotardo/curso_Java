package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

import java.util.Scanner;

//Crie uma classe para representar uma conta-corrente, com métodos para depositar
//uma quantia, sacar uma quantia e obter o saldo. Para cada saque será debitada também uma
//taxa de operação equivalente à 0,5% do valor sacado. Para a criação de objetos dessa classe
//será possível (opcional) informar o valor do saldo da conta.
public class Ex3_ContaCorrente {
    Scanner a = new Scanner(System.in);
    private int conta_Corrente;
    private double saldo;
    private int operador;
    public double deposito;
    public double saque;
    public final double TAXA_OPERACAO = 0.005;

//    public Ex3_ContaCorrente(int conta_Corrente, double saldo, int operador){
//        this.conta_Corrente = conta_Corrente;
//        this.saldo = saldo;
//        this.operador = operador;
//    }

//    public void Informar (int conta_Corrente, double saldo){
//        System.out.println("Informe sua conta corrente: ");
//        conta_Corrente = a.nextInt();
//        this.conta_Corrente = conta_Corrente;
//        System.out.println("Informe seu saldo: ");
//        saldo = a.nextDouble();
//        this.saldo = saldo;
//    }

    public void Deposito_Quantia(){
        System.out.println("Digite a quantia para depósito: ");
        deposito = a.nextDouble();
        this.saldo = saldo + deposito;
    }

    public void Saque_Quantia(){
        System.out.println("Digite a quantia para saque: ");
        saque = a.nextDouble() + (saque*TAXA_OPERACAO);
        this.saldo = saldo - saque;
    }

    public void Obter_Quantia(){
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public int getConta_Corrente() {
        return conta_Corrente;
    }

    public void setConta_Corrente(int conta_Corrente) {
        this.conta_Corrente = conta_Corrente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }
}
