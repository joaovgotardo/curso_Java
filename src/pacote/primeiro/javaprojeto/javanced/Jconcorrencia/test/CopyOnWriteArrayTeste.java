package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class Jogo{
    private final String nome;
    //Para mudar esse atributo, somente criando um novo objeto.

    public Jogo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
public class CopyOnWriteArrayTeste {
    public static void main(String[] args) {
        //o CopyOnArray é uma coleção para threads. Threads geralmente precisam de coleções
        //imutáveis para trabalhar em cima.
        List<Integer> list = new CopyOnWriteArrayList<>();
        //Sempre cria uma nova lista em modificações. Exige bastante desempenho.
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        //Mantém uma cópia do original (iterator).
        Runnable r_iterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(3);
                //Vai imprimir cada elemento desse iterator.
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        
        Runnable r_removedor = () -> {
            for (int i = 0; i < 100; i++) {
                list.remove(i);
                System.out.printf("%s removeu %d%n",
                        Thread.currentThread().getName(), i);
            }
        };

        new Thread(r_iterator).start();
        new Thread(r_iterator).start();
        new Thread(r_removedor).start();
    }
}
