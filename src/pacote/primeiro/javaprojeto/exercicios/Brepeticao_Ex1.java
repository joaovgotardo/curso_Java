package pacote.primeiro.javaprojeto.exercicios;

/*Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de
três e que se encontram no conjunto dos números de 1 até 500. */

public class Brepeticao_Ex1 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 501; i++) {
            if (i%3 == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos múltiplos de 3 entre 1 e 500 é: " + soma);
    }
}
