package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste9 {
    public static void main(String[] args) {
        //Range - Final exclusivo | RangeInclusive - Final .
        //Múltiplos de 3:
        IntStream.rangeClosed(1, 50).filter(n -> n % 3 == 0).forEach(System.out::println);

        //Strings
        Stream.of("A", "B", "C", "D", "E", "F").map(String::toLowerCase)
                .forEach(System.out::println);

        double[] array = {2.5,4.6,3.6,1.8,5.1515};
        //Retorna o mesmo tipo
        double sum = Arrays.stream(array).sum();
        System.out.println(sum);

        //Também pode-se usar com arquivos:
        try(Stream <String> linhas = Files.lines(Paths.get("file2.txt"))){
            linhas.filter(l -> l.contains("arquivo")).forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
