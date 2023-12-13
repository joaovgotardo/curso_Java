package pacote.primeiro.javaprojeto.exercicios;

/* Declarar e construir um vetor de inteiros e usar um laço for para inicializar seus elementos com os
valores de 1 até 10 em Java*/

public class Carrays_Ex1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
