package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.servico;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex3_ContaCorrente;

import java.util.Scanner;

public class Ex3_ContaCorrenteServico {
    public static void Operacao(Ex3_ContaCorrente operacao){
        int contador_operacoes = 0;
        Scanner a  = new Scanner(System.in);
        while (operacao.getOperador() == 0){
            System.out.print("Digite qualquer número, exceto 0, para começar a operação: ");
            operacao.setOperador(a.nextInt());
        }
        while (operacao.getOperador() != 0){
            System.out.print("Digite a sua Conta Corrente: ");
            operacao.setConta_Corrente(a.nextInt());
            System.out.print("Digite o seu Saldo: R$");
            operacao.setSaldo(a.nextDouble());
            while(operacao.getOperador() != 0){
                System.out.print("Digite um número: \n 1 - Fazer um Depósito " +
                        "\n 2 - Fazer um Saque \n 3 - Obter seu Saldo Atual \n 0 - Terminar operação; ");
                operacao.setOperador(a.nextInt());
                contador_operacoes += 1;
                if (operacao.getOperador() == 1){
                    operacao.Deposito_Quantia();
                } else if (operacao.getOperador() == 2){
                    operacao.Saque_Quantia();
                } else if (operacao.getOperador() == 3) {
                    operacao.Obter_Quantia();
                } else if (operacao.getOperador() == 0){
                    break;
                } else {
                    continue;
                }
            }
            System.out.println("Conta-Corrente: " + operacao.getConta_Corrente());
            System.out.println("Saldo Final: R$" + operacao.getSaldo());
            System.out.println("Operações Feitas: " + contador_operacoes);
        }
    }
}
