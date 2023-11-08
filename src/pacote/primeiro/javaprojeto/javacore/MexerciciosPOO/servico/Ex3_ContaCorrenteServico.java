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
                System.out.println("1 - Fazer um Depósito " + "\n2 - Fazer um Saque \n3 - Obter seu Saldo Atual " +
                        "\n0 - Terminar operação: \n----------");
                System.out.print("Digite um número: ");
                operacao.setOperador(a.nextInt());
                contador_operacoes += 1;
                if (operacao.getOperador() == 1){
                    operacao.Deposito_Quantia();
                } else if (operacao.getOperador() == 2){
                    operacao.Saque_Quantia();
                    if (operacao.getSaldo() < 0){
                        //-225 > 0
                        double cont = 0;
                        while (operacao.getSaldo() < 0){
                            operacao.setSaldo(operacao.getSaldo() + 1);
                            cont += 1;
                        }
                        System.out.println("Operação inválida. O saque não será feito completamente fora dos limites do saldo.");
                        System.out.println("Quantidade requerida: R$" + operacao.saque);
                        operacao.saque -= cont;
                        System.out.println("Quantidade negada: R$" + cont);
                        System.out.println("Saldo atual: R$" + operacao.getSaldo());
                        System.out.println("----------");
                    }
                } else if (operacao.getOperador() == 3) {
                    operacao.Obter_Quantia();
                } else if (operacao.getOperador() == 0){
                    break;
                } else {
                    System.out.print("Digite um número válido.\n");
                }
            }
            System.out.println("Conta-Corrente: " + operacao.getConta_Corrente());
            System.out.println("Saldo Final: R$" + operacao.getSaldo());
            System.out.println("Operações Feitas: " + contador_operacoes);
        }
    }
}
