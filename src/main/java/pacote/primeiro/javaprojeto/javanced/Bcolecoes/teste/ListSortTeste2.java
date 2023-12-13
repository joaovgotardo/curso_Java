package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.*;

class byIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getId().compareTo(m2.getId());
    }
}

public class ListSortTeste2 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "Monster"));
        mangas.add(new Manga(2L, "Berserk"));
        mangas.add(new Manga(3L, "Vagabond"));
        mangas.add(new Manga(4L, "Oyasumi Punpun"));
        mangas.add(new Manga(5L, "Vinland Saga"));
        mangas.add(new Manga(6L, "Fullmetal Alchemist"));
        //Para objetos como esses, apenas o Collections.sort não basta, pois eles não são apenas Strings.
        Collections.sort(mangas); //Com o CompareTo implementado, agora o sort pode ser feito.
        for (Manga manga:mangas) {
            System.out.println(manga);
        }
        //Comparator é usado para eventuais sorts de outros tipos. Ele não é implementado diretamente
        //na classe. Ele também precisa ser Comparable, isso se dá pela implementação dos métodos
        //dessa interface.
        mangas.sort(new byIdComparator());
        System.out.println("--");
        for (Manga manga:mangas) {
            System.out.println(manga);
        }
    }
}
