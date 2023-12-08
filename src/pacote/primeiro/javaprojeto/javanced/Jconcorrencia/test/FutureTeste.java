package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.util.concurrent.*;

public class FutureTeste {
    public static void main(String[] args) {
        //Processamento síncrono - Uma thread executando do começo ao fim.
        //Processamento assíncrono - Multithread. As threads tem funções específicas. Por exemplo,
        //uma exibe a interface do usuário e outra faz uma pesquisa no banco de dados.
        //O future serve para criar uma nova thread enquanto o main está executando, e
        //executar um método, Runnable ou Callable.
        ExecutorService es = Executors.newSingleThreadExecutor();
        //Submete uma tarefa runnable para execução.
        Future<Double> altura = es.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 1.86D;
        });
    }
}
