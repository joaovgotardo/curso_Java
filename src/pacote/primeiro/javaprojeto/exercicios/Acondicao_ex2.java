package pacote.primeiro.javaprojeto.exercicios;

/*Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar
Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if.
* */

public class Acondicao_ex2 {
    public static void main(String[] args) {
        int num = 7;
        if (num%2 == 0){
            System.out.print(num + " é par");
        }else{
            System.out.println(num + " é ímpar");
        }
    }
}
