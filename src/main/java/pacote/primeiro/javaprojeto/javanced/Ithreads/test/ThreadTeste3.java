package pacote.primeiro.javaprojeto.javanced.Ithreads.test;

import pacote.primeiro.javaprojeto.javanced.Ithreads.dominio.Conta;

//Implementa para que possa criar uma thread.
public class ThreadTeste3 implements Runnable{
    private Conta conta = new Conta();
    public static void main(String[] args) {
        ThreadTeste3 tt3 = new ThreadTeste3();
        Thread mario = new Thread(tt3, "Mario");
        Thread luigi = new Thread(tt3, "Luigi");
        //As duas threads vão acessar o mesmo objeto, na Conta.
        luigi.start();
        mario.start();
        //As duas threads são concorrentes. Isso resulta em um problema, que não seguirá a lógica
        // que foi posta nos métodos. A verificação de saldo fará com que os dois continuem
        //sacando.
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            Saldo(20); //Vai sacar de dez em dez.
            if(conta.getSaldo() < 0){
                System.out.println("Não pode continuar.");
            }
        }
    }

    //Para resolver o problema que aconteceu, precisa-se que a thread que estiver executando
    //o método abaixo, seja uma só.
    //Esse método agora é sincronizado, e somente uma thread pode acessá-lo em uma vez.
    private synchronized void Saldo(int quantia){
        //Se quiséssemos fazer synchronized(conta){}, esse objeto teria de ser final.
        //O resultado seria diferente, e dessa forma, cada thread agora executaria uma
        //por vez, pois a outra estaria em espera, fora do synchronized.
        if(conta.getSaldo() >= quantia){
            System.out.println("Saque de " + Thread.currentThread().getName());
            conta.saque(quantia);
            System.out.println("Saldo atual " + Thread.currentThread().getName() + ": "
                +conta.getSaldo());
        //Mesmo se o sleep for implementado, o synchronized mantém seu comportamento.
        }else{
            System.out.println(Thread.currentThread().getName() + " está sem saldo.");
        }
    }
    //Também pode-se sincronizar métodos estáticos. A diferença é que a classe seria sincronizada,
    //e não o atributo, como no exemplo acima.
    
    //Todos esses processos são a execução atômica: geralmente em um objeto, ou em um método,
    //limitando o número de threads em ação.
}
