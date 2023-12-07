package pacote.primeiro.javaprojeto.javanced.Ithreads.test;

public class ThreadDeadlockTeste {
    public static void main(String[] args) {
        //Deadlock
        //A thread 1 está executando A. A thread 2 está executando B.
        //Se a thread 1 quiser executar B, terá que esperar a thread 2 terminar seu processo.
        //Se a thread 2 quiser executar A, terá que esperar a thread 1 terminar seu processo.
        //Com isso, as threads entram em um deadlock: as threads não conseguem acessar o próximo
        //processo.
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable runA = () -> {
            synchronized (lock1){
                System.out.println("T1: Está no lock1");
                System.out.println("T1: Espera o lock2");
                synchronized (lock2){
                    System.out.println("T1: Está no lock2");
                }
            }
        };
        Runnable runB = () -> {
            synchronized (lock2){
                System.out.println("T2: Está no lock2");
                System.out.println("T2: Espera o lock1");
                synchronized (lock1){
                    System.out.println("T2: Está no lock1");
                }
            }
        };
        new Thread(runA).start();
        new Thread(runB).start();
        //Esse programa nunca terminará. Para executar o próximo lock, a thread atual deve
        //"soltar" o atual; mas o lock não pode ficar sem thread. Por isso, nada acontece.
        //No computador que isso foi testado, isso não aconteceu, pois as threads são poucas.
        //Em sistemas mais robustos, isso acontece. Para resolver o problema, é preciso inverter
        //em runB, lock2 e lock1.

        //Métodos que são usados em todos os objetos: wait, notify, notifyAll.
        //Usado em MultiThread.
    }
}
