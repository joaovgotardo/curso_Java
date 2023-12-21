package pacote.primeiro.javaprojeto.javanced.Mcrud.servico;

import pacote.primeiro.javaprojeto.javanced.Mcrud.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Mcrud.dominio.Filme;
import pacote.primeiro.javaprojeto.javanced.Mcrud.repositorio.FilmeRepositorio;

import java.util.List;
import java.util.Scanner;

public class FilmeServico {
    private static final Scanner SC = new Scanner(System.in);

    public static void impressaoMenu(){
        System.out.println("Digite uma das opções: \n");
        System.out.println("1 - Buscar filme.\n");
        System.out.println("2 - Deletar filme.\n");
        System.out.println("3 - Salvar filme.\n");
        System.out.println("4 - Atualizar filme.\n");
        System.out.println("5 - Voltar.\n");
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
            case 4: atualizar(); break;
            default: throw new IllegalArgumentException();
        }
    }

    private static void buscar(){
        System.out.println("Buscando valores...");
        String nome = SC.nextLine();
        List<Filme> filmes = FilmeRepositorio.buscaPorNome(nome);
        filmes.forEach(d -> System.out.printf("%d - %s%n", d.getId(), d.getNome()));
    }

    private static void deletar(){
        System.out.println("Digite um ID para deletar");
        int id = Integer.parseInt(SC.nextLine());
        System.out.println("Confirme novamente: S/N");
        String confirm = SC.nextLine();
        //IgnoreCase deixa essa opção não case-sensitive.
        if("s".equalsIgnoreCase(confirm)){
            FilmeRepositorio.deletar(id);
        }
    }

    private static void salvar(){
        System.out.println("Digite o nome do filme");
        String nome = SC.nextLine();
        System.out.println("Digite a duração");
        String duracao = SC.nextLine();
        System.out.println("Quer ver quais IDs de Diretor estão disponíveis? (S/N)");
        String verif = SC.nextLine();
        if("s".equalsIgnoreCase(verif)) DiretorServico.buscar();
        System.out.println("Digite o ID do diretor: ");
        int id_diretor = Integer.parseInt(SC.nextLine());
        Filme filme = Filme.builder()
                .nome(nome)
                .duracao(duracao)
                .id_diretor(Diretor.builder().id(id_diretor).build())
                .build();
        FilmeRepositorio.salvar(filme);
    }

    private static void atualizar(){
        System.out.println("Digite o ID do Filme a ser atualizado.");
        Filme filme_id = FilmeRepositorio.buscaPorId(Integer.parseInt(SC.nextLine()));
        System.out.println("Digite o novo nome, ou vazio se não quiser atualizar.");
        String nome = SC.next();
        assert filme_id != null; //O assert só está usado pois esse aplicativo não é um
        //programa em produção real; nesses casos, é recomendado o uso do Optional para evitar
        // nulPointers.
        nome = nome.isEmpty() ? filme_id.getNome() : nome;

        System.out.println("Digite a duração do filme.");
        String duracao = SC.nextLine();

        Filme filme = Filme.builder()
                .id(filme_id.getId())
                .nome(nome)
                .duracao(duracao)
                .id_diretor(filme_id.getId_diretor())
                .build();
        FilmeRepositorio.atualizar(filme);
    }
}
