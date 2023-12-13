package pacote.primeiro.javaprojeto.exercicios;

/*Faça um programa que receba dois inteiros
e diga qual deles é o maior e qual o menor.
*/

public class Acondicao_ex1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        if (a > b) {
            System.out.print("Maior é " + a + " e o menor é " + b);
        } else if (b > a) {
            System.out.print("Maior é " + b + " e o menor é " + a);
        } else {
            System.out.print("Os dois são iguais");
        }
    }
}
