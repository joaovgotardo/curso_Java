package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.*;

class NumeroAleatorio implements Callable<String>{
    //Callable é como um Runnable, mas retorna um resultado.
    @Override
    public String call() throws Exception{
        //Preferível quando usar threads, pois é sincronizado.
        int n = ThreadLocalRandom.current().nextInt(1, 20);
        for (int i = 0; i < n; i++) {
            System.out.printf("%s executando%n", Thread.currentThread().getName());
        }
        return String.format("%s finalizou. Número aleatório: %d",
                Thread.currentThread().getName(), n);
    }
}
public class CallableTeste {
    public static void main(String[] args) {
        NumeroAleatorio na = new NumeroAleatorio();
        ExecutorService es = Executors.newFixedThreadPool(4);
        //Para criar um callable:
        Future<String> submit = es.submit(na);//Retorna um future (a resposta virá no futuro).
        try{
            String s = submit.get();//.get espera se necessário, então exibe o resultado.
            System.out.println(s);
        }catch(ExecutionException | InterruptedException e){
            e.printStackTrace();
        }
        es.shutdown();
    }
}
