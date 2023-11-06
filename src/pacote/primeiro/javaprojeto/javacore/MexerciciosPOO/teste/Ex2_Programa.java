//2 - Considere um vetor de 10 números inteiros positivos maiores que zero e um único
//número X inteiro, também positivo e maior que zero. Faça um programa para:
//(a) ler pelo teclado os valores do vetor;
//(b) ler pelo teclado o número X;
//(c) dizer quantos números no vetor são maiores que X, menores que X e iguais a X
package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import java.util.Scanner;

public class Ex2_Programa {
    public static void main(String[] args) {
        int[] vetor = new int[11];
        Scanner s = new Scanner(System.in);
        System.out.println("Defina X");
        int x = s.nextInt();
        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Defina o " + i + "º valor do vetor");
            vetor[i] = s.nextInt();
        }
        int iguais = 0; int menor = 0; int maior = 0;
        for (int i = 1; i < vetor.length; i++){
            if(x > vetor[i]){
                maior += 1;
            }else if (x < vetor[i]){
                menor += 1;
            }else{
                iguais += 1;
            }
        }
        System.out.println("Quantidade de valores iguais a x: " + iguais);
        System.out.println("Quantidade de valores maiores que x: " + maior);
        System.out.println("Quantidade de valores menores que x: " + menor);
    }
}
