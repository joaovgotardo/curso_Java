package pacote.primeiro.javaprojeto.javanced.Ithreads.test;
class RunnableThread2 implements Runnable{
    private char c;

    public RunnableThread2(char c) {
        this.c = c;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i%50 == 0){
                System.out.println();
            }
            Thread.yield(); //Uma solicitação ao scheduler para que a thread atual possa
            //usar o processador. O scheduler pode ignorar.
        }
    }
}

public class ThreadTeste2 {
    public static void main(String[] args) throws InterruptedException {
//        Em um caso que o uso de atributos não é necessário, pode-se criar uma thread dessa forma:
//        Runnable exemplo = () -> {
//        }new Thread (exemplo);
        Thread t1 = new Thread(new RunnableThread2('L'));
        Thread t2 = new Thread(new RunnableThread2('Ô'));
        //yield - usado para que o método em execução pause.
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        //join - o join fará com que o main aguarde até que essa thread morra para continuar.
        //a t1 executa todo seu processo, e então o main poderá executar a t2.
        t1.join(); //Lança exceção
        t2.start();
    }
}
