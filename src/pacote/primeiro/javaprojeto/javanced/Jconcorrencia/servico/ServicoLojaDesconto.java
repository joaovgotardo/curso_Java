package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ServicoLojaDesconto {
    //Um pega preço de forma síncrona, outro de forma assíncrona.
    private final ExecutorService es = Executors.newCachedThreadPool(); //Permite a criação de threads quanto necessário.

    //Apenas a maneira síncrona está disponível nesse caso.
    public double precoSincrono(String loja){
        System.out.printf("Preços sendo pegos para %s (forma síncrona)", loja);
        return geradorPreco();
    }

    private double geradorPreco(){
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500);
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(1); //Simulando atraso do banco
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
