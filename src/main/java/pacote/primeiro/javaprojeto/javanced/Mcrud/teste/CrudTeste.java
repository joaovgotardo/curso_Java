package pacote.primeiro.javaprojeto.javanced.Mcrud.teste;

import pacote.primeiro.javaprojeto.javanced.Mcrud.servico.DiretorServico;

import java.util.Scanner;

public class CrudTeste {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int o; //Essa variável é introduzida para evitar erros no scanner.
        while(true){
            DiretorServico.impressaoMenu();
            o = Integer.parseInt(SC.nextLine());
            if (o == 0) break;
            DiretorServico.opcoesMenu(o);
        }
    }
}
