package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTeste10 {
    public static void main(String[] args) {
        //Gerando streams infinitos
        Stream.iterate(2, n -> n*2).
                limit(20)
                .forEach(System.out::println);

        //Fibonacci
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(15)
                .map(a -> a[0])
                .forEach(System.out::println);

        //Generate
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        Stream.generate(() -> tlr.nextInt(1, 1000)).limit(10)
                .forEach(System.out::println);
    }
}
