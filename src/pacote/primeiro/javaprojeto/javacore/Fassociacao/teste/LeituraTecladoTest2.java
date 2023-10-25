package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import java.util.Scanner;

public class LeituraTecladoTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ei man digite algo, digite uma pergunta, e eu respondo sim ou não: ");
        String pergunta = scanner.nextLine();
        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
        int cont = 0;
        for (char vogal : vogais) {
            cont += vogal;
            if (pergunta.charAt(0) == vogal){
                System.out.println("SIM"); break;
            }else {
                if (cont == 371) {
                    System.out.println("NÃO"); break;
                }
            }
        }
    }
}
