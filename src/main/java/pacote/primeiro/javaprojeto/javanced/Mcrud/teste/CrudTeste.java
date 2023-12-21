package pacote.primeiro.javaprojeto.javanced.Mcrud.teste;

import pacote.primeiro.javaprojeto.javanced.Mcrud.servico.DiretorServico;
import pacote.primeiro.javaprojeto.javanced.Mcrud.servico.FilmeServico;

import java.util.Scanner;

public class CrudTeste {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int o; //Essa variável é introduzida para evitar erros no scanner.
        while(true){
            menu();
            o = Integer.parseInt(SC.nextLine());
            if (o == 0) break;
            switch(o){
                case 1: {
                    DiretorServico.impressaoMenu();
                    o = Integer.parseInt(SC.nextLine());
                    DiretorServico.opcoesMenu(o);
                }
                case 2: {
                    FilmeServico.impressaoMenu();
                    o = Integer.parseInt(SC.nextLine());
                    FilmeServico.opcoesMenu(o);
                }
            }
            DiretorServico.opcoesMenu(o);
        }
    }

    private static void menu(){
        System.out.println("Digite uma das opções: \n");
        System.out.println("1 - Diretor.");
        System.out.println("2 - Filme.");
        System.out.println("0 - Sair.");
    }
}
