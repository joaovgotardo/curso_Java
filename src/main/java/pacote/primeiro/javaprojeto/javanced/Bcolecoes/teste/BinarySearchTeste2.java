package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste2 {
    public static void main(String[] args) {
        byIdComparator bic = new byIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "Monster"));
        mangas.add(new Manga(2L, "Berserk"));
        mangas.add(new Manga(3L, "Vagabond"));
        mangas.add(new Manga(4L, "Oyasumi Punpun"));
        mangas.add(new Manga(5L, "Vinland Saga"));
        mangas.add(new Manga(6L, "Fullmetal Alchemist"));

        Collections.sort(mangas);
        for (Manga manga: mangas) {
            System.out.println(manga);
        }
        Manga aProcurar = new Manga(3L, "Vagabond");
        System.out.println(Collections.binarySearch(mangas, aProcurar)); //Passa a posição por nome

        //Para passar a posição por ID:
        mangas.sort(bic);
        System.out.println(Collections.binarySearch(mangas, aProcurar, bic));
    }
}
