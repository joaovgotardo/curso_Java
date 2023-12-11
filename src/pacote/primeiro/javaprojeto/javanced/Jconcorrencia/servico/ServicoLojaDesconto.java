package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.servico;

import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Desconto;
import pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio.Orcamento;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ServicoLojaDesconto {
    public String precoSincrono(String loja){
        //Para retornar o preço síncrono no padrão estabelecido:
        double preco = geradorPreco();
        //Gera um valor
        Desconto.Perc desconto = Desconto.Perc.values()[
                ThreadLocalRandom.current().nextInt(Desconto.Perc.values().length)];
        //Para separa
        return String.format("%s:%.2f%s", loja, preco, desconto);
    }

    public String aplicarDesconto(Orcamento orcamento){
        delay();
        //Isso é usado para poupar código em um eventual if da opção 0%.
        double valorDesconto = orcamento.getPreco() * (100 - orcamento.
                getDesconto().getPorcentagem()) / 100;
        return String.format(Locale.US,"Preço original em '%s': R$ '%.2f'%nDesconto selecionado: '%s'. Preço final: 'R$%.2f'",
                orcamento.getNome(), orcamento.getPreco(), orcamento.getDesconto(), valorDesconto);

    }

    private double geradorPreco(){
        delay();
        return ThreadLocalRandom.current().nextDouble(1, 500);
    }

    private void delay(){
        try {
            //Na vida real, o delay ocorreria de forma diferente para cada loja.
            int milli = ThreadLocalRandom.current().nextInt(500, 3000);
            TimeUnit.SECONDS.sleep(milli); //Simulando atraso do banco
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
