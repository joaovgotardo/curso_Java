package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Computador;
import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class computadorMarca implements Comparator<Computador>{
    @Override
    public int compare(Computador o1, Computador o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class porQuantidade implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getQuantidade(), o2.getQuantidade());
    }
}

public class NavigableSetTeste {
    public static void main(String[] args) {
        //NavigableSet é uma SortedSet com métodos de navegação reportando matches mais próximos
        //para alvos de pesquisa.
        NavigableSet<Computador> nsc = new TreeSet<>(new computadorMarca());
        //TreeSet precisa de um Comparator para funcionar sem exceção.
        Computador pc = new Computador("1", "AOC", 4000);
        nsc.add(pc);
        NavigableSet<Manga> nsm = new TreeSet<>(new porQuantidade());
        nsm.add(new Manga(1L, "Monster", 6));
        nsm.add(new Manga(2L, "Berserk", 5));
        nsm.add(new Manga(3L, "Vagabond", 7));
        nsm.add(new Manga(4L, "Oyasumi Punpun", 4));
        nsm.add(new Manga(5L, "Vinland Saga", 8));
        nsm.add(new Manga(6L, "Fullmetal Alchemist", 9));
        nsm.add(new Manga(7L, "Attack on Titan", 1));
        //Se impresso, retorna por nomes, isso resulta de como o compareTo foi implementado.
        for (Manga manga:nsm) {
            System.out.println(manga);
        }
        //O TreeSet deve ser usado quando a classe utilizada implementa Comparable.
        //DescendingSet inverte a ordem de impressão:
        for (Manga manga:nsm.descendingSet()) {
            System.out.println(manga);
        }

        //Métodos
        //Lower < O menor depois dele.
        //Floor <= O mesmo elemento, ou o que vem antes dele.
        //Higher > O maior depois dele.
        //Ceiling >= O mesmo, ou o que vem depois.
        Manga hai = new Manga(11L, "Haikyuu", 4);
        nsm.add(hai);
        System.out.println(nsm.lower(hai));
        System.out.println(nsm.floor(hai));
        System.out.println(nsm.higher(hai));
        System.out.println(nsm.ceiling(hai));

        //Também há o pollFirst e o pollLast, que removem o primeiro ou o último elemento da coleção.
    }
}
