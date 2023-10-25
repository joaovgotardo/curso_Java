package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import java.util.Scanner;

public class LeituraTecladoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Assim se inicializa o leitor de dados do teclado;
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Seu nome é: " + nome + " e a sua idade é " + idade + "anos");
    }
}
