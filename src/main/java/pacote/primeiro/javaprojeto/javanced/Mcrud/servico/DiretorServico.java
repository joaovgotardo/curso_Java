package pacote.primeiro.javaprojeto.javanced.Mcrud.servico;

import pacote.primeiro.javaprojeto.javanced.Mcrud.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Mcrud.repositorio.DiretorRepositorio;

import java.util.List;
import java.util.Scanner;

public class DiretorServico {
    private static final Scanner SC = new Scanner(System.in);

    public static void impressaoMenu(){
        System.out.println("Digite uma das opções: \n");
        System.out.println("1 - Buscar diretor.\n");
        System.out.println("2 - Deletar diretor.\n");
        System.out.println("0 - Encerrar operação.\n");
    }

    public static void opcoesMenu(int oper){
//        yield está disponível em JDK 14+.
//        int i = switch(oper){
//            case 1,2,3,4,5,6: yield 100;
//            default: yield 0;
//        }
        switch(oper){
            //Se houver JDK 14+, pode-se usar o -> com o switch e eliminar o break.
            case 1: buscar(); break;
            case 2: deletar(); break;
            case 3: salvar(); break;
            default: throw new IllegalArgumentException();
        }
    }

    private static void buscar(){
        System.out.println("Buscando valores...");
        String nome = SC.nextLine();
        List<Diretor> diretores = DiretorRepositorio.buscaPorNome(nome);
        diretores.forEach(d -> System.out.printf("%d - %s%n", d.getId(), d.getNome()));
    }

    private static void deletar(){
        System.out.println("Digite um ID para deletar");
        int id = Integer.parseInt(SC.nextLine());
        System.out.println("Confirme novamente: S/N");
        String confirm = SC.nextLine();
        //IgnoreCase deixa essa opção não case-sensitive.
        if("s".equalsIgnoreCase(confirm)){
            DiretorRepositorio.deletar(id);
        }
    }

    private static void salvar(){
        System.out.println("Digite o nome do diretor");
        String nome = SC.next();
        Diretor diretor = Diretor.builder().nome(nome).build();
        DiretorRepositorio.salvar(diretor);
    }
}
