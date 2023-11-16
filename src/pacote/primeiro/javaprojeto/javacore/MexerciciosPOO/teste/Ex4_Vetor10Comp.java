package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import java.util.Scanner;

//Verifique se as componentes de um vetor de 10 componentes lidos pelo teclado
//formam uma progressão aritmética, informando se sim ou se não.
public class Ex4_Vetor10Comp {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para o vetor: ");
            vetor[i] = j.nextInt();
        }
        for (int b:vetor) {
            System.out.print(b + ", ");
        }
    }
}
