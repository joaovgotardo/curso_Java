package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
    }
}
