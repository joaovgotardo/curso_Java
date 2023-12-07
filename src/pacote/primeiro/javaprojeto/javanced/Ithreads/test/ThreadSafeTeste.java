package pacote.primeiro.javaprojeto.javanced.Ithreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafe{
    //Retorna uma lista thread-safe (synchronized list) - Pode ser substituído ao adicionar sync aos métodos.
    private final List<String> nomes = new ArrayList<>();

    public synchronized void add(String nome){
        nomes.add(nome);
    }

    //Esse método não era thread safe, pois assim que for removido o primeiro elemento pela thread 1,
    //ocorreria uma exceção, pois a thread 2 não teria nada para remover.
    public synchronized void remove_first(){
        if(nomes.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(nomes.remove(0));
        }
    }
}

public class ThreadSafeTeste {
    public static void main(String[] args) {
        //StringBuilder x StringBuffer -> esta última é ThreadSafe
        //(Os métodos dessa classe são sincronizados);
        ThreadSafe ts = new ThreadSafe();
        ts.add("Serafim");
        Runnable r = ts::remove_first;
        new Thread(r).start();
        new Thread(r).start();
    }
}
