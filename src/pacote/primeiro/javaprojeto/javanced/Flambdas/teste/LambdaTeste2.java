package pacote.primeiro.javaprojeto.javanced.Flambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Sao Paulo", "Rio de Janeiro", "Porto Alegre");
        List<Boolean> saoPaulo = map(strings, s -> s.equals("São Paulo"));
        List<String> mapp = map(strings, s -> s.toLowerCase());
        System.out.println(saoPaulo);
        System.out.println(mapp);

        //O exemplo acima pode ser simplificado até uma referência de método.
        //        List<String> mapp = map(strings, String::toLowerCase);

    }
    //Function recebe dois generics - um do wrapper que será recebido, e outro do wrapper voltado.
    private static <T, R>List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T e:list){ //Para cada elemento de T na lista.
            R apply = function.apply(e); //Aplica essa função a cada elemento.
            result.add(apply);
        }
        return result;
    }
}
