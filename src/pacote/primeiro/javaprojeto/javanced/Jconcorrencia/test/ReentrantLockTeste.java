package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Trabalhador implements Runnable{
    private String nome;
    private ReentrantLock lock;
    //Permite uso do fair.

    public Trabalhador(String nome, ReentrantLock lock) {
        this.nome = nome;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock(); //Pega o lock.
        try{
            //O método abaixo seria mais útil se fosse tentando usar o tryLock ao invés do
            //lock.
            if(lock.isHeldByCurrentThread()) { //se a lock está com a thread atual.
                //printf permite uma formatação melhor, substituindo %? pelo atributo.
                System.out.printf("A thread %s começou a execução%n", nome);
            }
            System.out.printf("Existem %d threads na fila%n", lock.getQueueLength()); //Retorna um valor estimado do tamanho
            //da fila de threads.
            System.out.printf("Thread %s na espera por 1,5s%n", nome);
            Thread.sleep(1500);
            System.out.println("Fim da espera.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
public class ReentrantLockTeste {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Trabalhador("I", lock)).start();
        new Thread(new Trabalhador("II", lock)).start();
        new Thread(new Trabalhador("III", lock)).start();
        new Thread(new Trabalhador("IV", lock)).start();
        new Thread(new Trabalhador("V", lock)).start();
        new Thread(new Trabalhador("VI", lock)).start();
        new Thread(new Trabalhador("VII", lock)).start();
        new Thread(new Trabalhador("VIII", lock)).start();
        new Thread(new Trabalhador("IX", lock)).start();
        new Thread(new Trabalhador("X", lock)).start();
    }
}
