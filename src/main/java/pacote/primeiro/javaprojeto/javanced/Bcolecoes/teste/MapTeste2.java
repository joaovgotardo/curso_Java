package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Consumidor;
import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste2 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Rodna Raskolnikov");
        Consumidor c2 = new Consumidor("Gregor Samsa");

        Manga m1 = new Manga(1L, "Monster");
        Manga m2 = new Manga(6L, "Fullmetal Alchemist");

        Map<Consumidor, Manga> map = new HashMap<>();
        map.put(c1, m1);
        map.put(c2, m2);
        for (Map.Entry<Consumidor, Manga> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNome());
        }
        //Contudo, isso acaba por ficar restrito a apenas 1 chave - 1 valor.
    }
}
