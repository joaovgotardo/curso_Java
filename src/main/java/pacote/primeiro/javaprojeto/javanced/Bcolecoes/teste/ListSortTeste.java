package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListSortTeste {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Monster");
        mangas.add("Berserk");
        mangas.add("Vagabond");
        mangas.add("Oyasumi Punpun");
        mangas.add("Vinland Saga");
        mangas.add("Fullmetal Alchemist");
        Collections.sort(mangas); //Organiza os elementos da lista em alfabético.
        //Classe que usa métodos estáticos somente.
        //Em numéricos, organizará em ordem crescente.

        for (String manga:mangas) {
            System.out.println(manga);
        }

        List<Integer> numeros = new ArrayList<>(5);
        numeros.add(27);
        numeros.add(11);
        numeros.add(6);
        numeros.add(75);
        numeros.add(2);
        Collections.sort(numeros);
        for (Integer n:numeros) {
            System.out.println(n);
        }
    }
}
