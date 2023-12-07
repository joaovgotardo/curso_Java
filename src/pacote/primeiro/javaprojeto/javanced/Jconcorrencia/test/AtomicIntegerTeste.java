package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Contador{
    private int conta;

    private AtomicInteger ai = new AtomicInteger();
    //Essa classe permite contar de forma atômica. O synchronized acaba não sendo
    //preciso.
    private Lock lock = new ReentrantLock(true);
    //Tem a mesma função do synchronized, mas tem algumas vantagens:
    //fairiness - se true, passa para a thread que está esperando a mais tempo.

    void incremento() throws InterruptedException{
        lock.lock();
        //tryLock - Pega o lock somente se ele está livre na hora da chamada.
        lock.tryLock(3, TimeUnit.SECONDS);
        conta++;
        ai.incrementAndGet(); //Incrementa o valor e o pega.
        //O synchronized é preferível por ser mais simples.
    }

    public int getConta(){
        return conta;
    }

    public AtomicInteger getAi() {
        return ai;
    }

}
public class AtomicIntegerTeste {
    public static void main(String[] args) throws InterruptedException{
        //A concorrência auxilia bastante no desenvolvimento de threads.
        Contador contador = new Contador();
        Runnable r = () -> {
            for (int i = 0; i < 5_000; i++) {
                try {
                    contador.incremento();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r, "t1");
        Thread t2 = new Thread(r, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(contador.getConta());
        System.out.println(contador.getAi());
        //Inicialmente, sem o synchronized, o valor sairá errado.
    }
}
