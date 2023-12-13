package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "Monster", 4));
        mangas.add(new Manga(2L, "Berserk", 7));
        mangas.add(new Manga(3L, "Vagabond", 3));
        mangas.add(new Manga(4L, "Oyasumi Punpun", 11));
        mangas.add(new Manga(5L, "Vinland Saga", 0));
        mangas.add(new Manga(6L, "Fullmetal Alchemist", 0));

        //O foreach não é bom para remover objetos. Para isso, é recomendado o Iterator.
        Iterator<Manga> iterator = mangas.iterator();
        //O iterator verifica valores da lista, e retornará o que existir.
        while(iterator.hasNext()){
            if(iterator.next().getQuantidade() == 0){
                iterator.remove();
            }
        }

        //Também pode-se usar programação funcional para remover esses objetos.
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
