package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTeste16 {
    public static void main(String[] args) {
        //Threads: São como 'trabalhadores' do processador. Quanto mais existem, mais potente ele é.
        //Threads são paralelas: elas funcionam ao mesmo tempo.
        System.out.println(Runtime.getRuntime().availableProcessors());
        long n = 1_000_000;
        somatudo(n);
        System.out.println("---------");
        somaStream(n);
        System.out.println("---------");
        somaParallelStream(n);
        System.out.println("---------");
        somaLongStream(n);
        System.out.println("---------");
        somaParallelLongStream(n);
        //Stream Paralelos funcionam melhor com um alto número de threads. Com 2, como nesse caso,
        //o for ainda se saiu melhor.
    }

    //Com for:
    private static void somatudo(long n){
        long soma = 0L;
        long init = System.currentTimeMillis();
        for (int i = 1; i < n; i++) {
            soma += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
        System.out.println(soma);
    }
    //Com stream:
    private static void somaStream(long n){
        long init = System.currentTimeMillis();
        long soma = Stream.iterate(1L, i -> i+1).limit(n).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
        System.out.println(soma);
    }
    //Com Parallel Stream: Ele usará múltiplas threads. Contudo, nesse caso, o desempenho piorará.
    //Isso pois deve-se ter algo pré-definido.
    private static void somaParallelStream(long n){
        long init = System.currentTimeMillis();
        long soma = Stream.iterate(1L, i -> i+1).parallel().limit(n).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
        System.out.println(soma);
    }

    //Isso muda se usarmos o LongStream.
    private static void somaLongStream(long n){
        long init = System.currentTimeMillis();
        long soma = LongStream.rangeClosed(1L, n).reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
        System.out.println(soma);
    }

    private static void somaParallelLongStream(long n){
        long init = System.currentTimeMillis();
        long soma = LongStream.rangeClosed(1L, n).parallel().reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
        System.out.println(soma);
    }
}
