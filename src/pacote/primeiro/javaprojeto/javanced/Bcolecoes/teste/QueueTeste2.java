package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Consumidor;
import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste2 {
    public static void main(String[] args) {
        //O uso da PriorityQueue é para dar prioridade a um determinado argumento, de acordo com a
        //regra de negócio.
        Queue<Manga> nsm = new PriorityQueue<>(new porQuantidade().reversed());
        nsm.add(new Manga(1L, "Monster", 6));
        nsm.add(new Manga(2L, "Berserk", 5));
        nsm.add(new Manga(3L, "Vagabond", 7));
        nsm.add(new Manga(4L, "Oyasumi Punpun", 4));
        nsm.add(new Manga(5L, "Vinland Saga", 8));
        nsm.add(new Manga(6L, "Fullmetal Alchemist", 9));
        nsm.add(new Manga(7L, "Attack on Titan", 1));

        while(!nsm.isEmpty()){
            System.out.println(nsm.poll());
        }
    }
}
