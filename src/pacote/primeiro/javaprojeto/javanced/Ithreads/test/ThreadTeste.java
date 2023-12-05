package pacote.primeiro.javaprojeto.javanced.Ithreads.test;

class MyThread extends Thread{
    private char c;

    public MyThread(char c){
        this.c = c;
    }

    @Override
    //Esse método precisa ser implementado
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if(i%50 == 0){
                System.out.println();
            }
        }
    }
}

//Outra maneira de usar threads: usando runnable
class RunnableThread implements Runnable{
    private char c;

    public RunnableThread(char c){
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
            //Faz a thread cessar sua execução pelo tempo determinado.
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //Isso vai ocasionar as threads executar, pausar por 1s, e imprimir de maneira
            //mais "padronizada".
        }
    }
}

public class ThreadTeste {
    public static void main(String[] args) {
        //Thread - é um objeto dessa classe no Java.
        //É um processo. A quantidade delas é o dobro dos núcleos de um sistema.
        //Daemon X User.
        //User - Encerra o programa quando essas threads são terminadas.
        //System.out.println(Thread.currentThread().getName());
        //Se chamarmos o run, não estaremos executando em múltiplas threads. Por isso, deve-se usar o start.

        //Utilizando threads:
//        MyThread myThread1 = new MyThread('1');
//        MyThread myThread2 = new MyThread('2');
//        MyThread myThread3 = new MyThread('3');
//        MyThread myThread4 = new MyThread('4');
        //Deve-se encapsular o RunnableThread, para que funcione.
        Thread myThread1 = new Thread(new RunnableThread('1'), "T1");
        Thread myThread2 = new Thread(new RunnableThread('2'), "T2");
        Thread myThread3 = new Thread(new RunnableThread('3'), "T3");
        Thread myThread4 = new Thread(new RunnableThread('4'), "T4");
        myThread4.setPriority(Thread.MAX_PRIORITY); //Pode ser MAX, MIN ou NORMAL. Ou um valor de 1 a 10.
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        //Não pode-se iniciar a thread duas vezes, ou lançará uma exceção.
        //O Scheduler é quem define qual thread será executada naquela vez. Ele deixa
        //cada uma das threads executar por um tempo; a thread main não executa no exemplo acima,
        //pois o método .run não foi chamado. Estados das Threads:
        //New - Criação do objeto.
        //Runnable - Chamada do método start; pronta para ser executada.
        //Running - Está sendo executada.
        //Waiting/Blocked - Está "esperando" ser executada. Volta para runnable.
        //No exemplo, as threads não estão sendo bloqueadas.
        //Dead - A thread terminou. Só se reinicia criando um novo objeto.
    }
}
