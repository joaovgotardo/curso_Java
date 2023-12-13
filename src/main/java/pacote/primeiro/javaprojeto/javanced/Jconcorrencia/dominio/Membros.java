package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//Fazendo a classe com lock ao invés de synchronized.
public class Membros {
    //queue é feito para segurar elementos antes do processamento.
    private final Queue<String> emails = new ArrayBlockingQueue<>(5);
    private final ReentrantLock lock = new ReentrantLock();

    //O condition é usado para métodos semelhantes ao wait e notifyAll dentro do lock.
    private final Condition condition = lock.newCondition();
    private boolean aberto = true;

    public boolean isAberto(){
        return aberto;
    }

    public int emailsPendentes(){
        lock.lock();
        try {
            return emails.size();
        }finally {
            lock.unlock();
        }
        //O try-finally é sempre usado pois uma vez aberto, o lock deve ser fechado.
    }

    public void adicionarMembros(String email){
        lock.lock();
        try{
            System.out.println("E-mail adicionado por: " +
                    Thread.currentThread().getName());
            this.emails.add(email);
//            this.emails.notifyAll();
            condition.signalAll(); //Substitui o notifyAll
        }finally {
            lock.unlock();
        }
    }

    public String reterEmail(){
        System.out.println("Checagem da existencia de e-mails por: " +
                Thread.currentThread().getName());
        lock.lock();
        try{
            while (this.emails.isEmpty()){
                if(!aberto) return null;
                System.out.println("Não há e-mails disponíveis para: " +
                        Thread.currentThread().getName() + ", modo de espera");
                try{
//                    this.emails.wait();
                    condition.await(); //Substitui o wait.
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return this.emails.poll(); //Remove o primeiro da fila.
        }finally {
            lock.unlock();
        }
    }

    public void fechar(){
        aberto = false;
        lock.lock();
        try{
            System.out.println("Notificando a thread: " + Thread.currentThread().getName()
                + "que seus e-mails não estão sendo mais recolhidos.");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
