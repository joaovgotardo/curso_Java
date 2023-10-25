package pacote.primeiro.javaprojeto.exercicios;
/*Desenvolver um algoritmo que leia os números de 1 a 1000 e calcule e escreva a
média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos. */
public class Brepeticao_Ex3 {
    public static void main(String[] args) {
        int soma = 0;
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < 1001; i++) {
            soma += i;
            if (i%2 == 0){
                pares += 1;
            }else if (i%2 != 0){
                impares += 1;
            }
            if (i < 1000){
                continue;
            }
            else{
                System.out.println("A média é: " + soma/i);
            }
        }
    }
}
