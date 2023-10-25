package pacote.primeiro.javaprojeto.exercicios;

/*Escreva um programa que pede os coeficientes de uma equação do segundo grau e exibe as raízes da equação,
sejam elas reais ou complexas.*/

/*delta = b²-4*ac */
/*bhaskara = -b +- raiz de delta / 2a */

public class Acondicao_ex3 {
    public static void main(String[] args) {
        int a = 3; int b = -9; int c = 6;
        int delta = (b * b) - 4 * a * c;
        double x1_A = (-b + Math.sqrt(delta));
        double x2_A = (-b - Math.sqrt(delta));
        double x1 = x1_A/(2*a); double x2 = x2_A/(2*a);
        System.out.println("x'= " + (int)x1);
        System.out.println("x''= " + (int)x2);
    }
}