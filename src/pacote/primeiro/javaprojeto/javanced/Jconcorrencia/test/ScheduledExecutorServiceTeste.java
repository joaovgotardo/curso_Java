package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTeste {
    public static void main(String[] args) {
        deerer();
    }
    private static final ScheduledExecutorService ses = Executors.
            newScheduledThreadPool(2);

    private static void deerer(){
        Runnable r = () -> {
            System.out.println(LocalTime.now() + " DEER");
            try {
                TimeUnit.SECONDS.sleep(6); //Fará o fixedTimeDelay esperar mais o tempo do sleep.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        //Vai criar um delay para a execução desse código. Executa uma vez.
        ses.schedule(r, 3, TimeUnit.SECONDS);
        //Cria um delay para a execução do código, executando de forma indefinida.
        ScheduledFuture<?> swfd = ses.scheduleWithFixedDelay(
                r, 1, 3, TimeUnit.SECONDS);
        //Para parar esse código, outro scheduler deve ser criado.
        ses.schedule(()-> {
            System.out.println("DEAD");
            swfd.cancel(true); //Vai parar de executar qualquer código
            //em andamento. Se false, não.
            ses.shutdown(); //Termina o programa.
        }, 19, TimeUnit.SECONDS); //Após 15 segundos, vai parar.

        //O WithFixedRate fará o mesmo do FixedDelay, independente do sleep.
        //Quando a thread acorda, o Delay começa. Quando a thread a acorda, Rate já está contando.
    }
}
