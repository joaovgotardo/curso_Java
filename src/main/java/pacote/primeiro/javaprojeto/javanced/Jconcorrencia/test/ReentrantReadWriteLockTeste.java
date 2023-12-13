package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite{
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rrwl;

    public MapReadWrite(ReentrantReadWriteLock rrwl) {
        this.rrwl = rrwl;
    }

    public void inserir(String chave, String valor){
        rrwl.writeLock().lock(); //Abrindo o lock, permitindo escrita.
        try{
            //O lock de escrita só pode ser obtido de uma thread por vez.
            if(rrwl.isWriteLocked()){
                System.out.printf("%s iniciou um writeLock",
                        Thread.currentThread().getName());
            }
            Thread.sleep(3000);
            map.put(chave, valor);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            rrwl.writeLock().unlock();
        }
    }

    public Set<String> chaves(){
        rrwl.readLock().lock();
        try{
            return map.keySet();
        }finally{
            rrwl.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockTeste {
    //O ReentrantReadWriteLock tem a mesma função do ReentrantLock, permitindo entrada e saída.
    public static void main(String[] args) {
        ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock(); //Tmb aceita fair.
        MapReadWrite mrw = new MapReadWrite(rrwl);

        Runnable escritor = () -> {
            for (int i = 0; i < 20; i++) {
                mrw.inserir(String.valueOf(i), String.valueOf(i*5));
            }
        };

        //Adiciona o leitor de threads.
        Runnable leitor = () -> {
            if (rrwl.isWriteLocked()){
                System.out.println("Thread de escrita bloqueada");
            }
            rrwl.readLock().lock();
            System.out.println("Lock obtido");
            try{
                System.out.println(Thread.currentThread().getName() + "\n"
                    + mrw.chaves());
            }finally{
                rrwl.readLock().unlock();
            }
        };

        Thread a1 = new Thread(escritor);
        Thread b1 = new Thread(leitor);
        Thread b2 = new Thread(leitor);
        a1.start();
        b1.start();
        b2.start();
    }
}
