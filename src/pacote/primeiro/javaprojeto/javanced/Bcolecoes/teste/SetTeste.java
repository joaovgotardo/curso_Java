package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        //O set é uma interface que não permite elementos repetidos.
        //O hashSet é uma coleção que tem essa característica do set, e também utiliza o hash.
        Set<Manga> mangas = new HashSet();
        //Para manter a ordem, é preciso usar o LinkedHashSet.
        mangas.add(new Manga(1L, "Monster"));
        mangas.add(new Manga(2L, "Berserk"));
        mangas.add(new Manga(3L, "Vagabond"));
        mangas.add(new Manga(4L, "Oyasumi Punpun"));
        mangas.add(new Manga(5L, "Vinland Saga"));
        mangas.add(new Manga(6L, "Fullmetal Alchemist"));

        //O set não é indexado, por isso é preciso o foreach para pegar os elementos.
        for (Manga manga:mangas) {
            System.out.println(manga);
        }
        //O hash dessa classe é formado levando em consideração o id e o nome.
        //Se por acaso houver um elemento duplicado, isso será verificado a partir do equals.
    }
}
