package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.time.LocalDateTime;
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
            TimeUnit.SECONDS.sleep(5);
            return 1.86D;
        });
        horario();
        try{
            Double v = altura.get(4, TimeUnit.SECONDS);
            //É ideal usar o try-catch para tratar esse get.
            //Aqui, v retornará uma exceção se o get não for impresso nesse tempo.
            System.out.println("Altura: " + v);
        }catch (InterruptedException | ExecutionException | TimeoutException e){
            e.printStackTrace();
        }finally { //Shutdown foi posto aqui para parar sua execução. Se ocorresse uma
            //exceção, ele não seria alcançado fora do finally.
            es.shutdown();
        }
    }
    private static void horario(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(LocalDateTime.now());

        //Parallel Streams - Usa dois núcleos para dois processos concomitantes.
        //P. Assíncrona - Um núcleo, com processos múltiplos e não permitir sua ociosidade.
    };
}
