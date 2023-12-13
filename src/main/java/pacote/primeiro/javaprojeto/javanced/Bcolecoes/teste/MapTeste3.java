package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Consumidor;
import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste3 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Rodna Raskolnikov");
        Consumidor c2 = new Consumidor("Gregor Samsa");

        Manga m1 = new Manga(1L, "Monster");
        Manga m2 = new Manga(2L, "Berserk");
        Manga m3 = new Manga(3L, "Vagabond");
        Manga m4 = new Manga(4L, "Oyasumi Punpun");
        Manga m5 = new Manga(5L, "Vinland Saga");
        Manga m6 = new Manga(6L, "Fullmetal Alchemist");

        //Para adicionar vários valores a uma chave, deve-se usar uma lista.
        List<Manga> mangas1 = List.of(m1, m3, m5);
        List<Manga> mangas2 = List.of(m2, m4, m6);
        Map<Consumidor, List<Manga>> map = new HashMap<>();
        map.put(c1, mangas1);
        map.put(c2, mangas2);
        for (Map.Entry<Consumidor, List<Manga>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome()); //Imprimindo consumidor
            for (Manga manga: entry.getValue()) {
                System.out.println(manga.getNome()); //Imprimindo mangá
            }
        }
    }
}
