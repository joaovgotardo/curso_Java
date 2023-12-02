package pacote.primeiro.javaprojeto.javanced.Goptional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste {
    public static void main(String[] args) {
        //O intuito do Optional é tentar evitar a ocorrência de NulPointerExceptions.
        Optional<String> o = Optional.of("ABCDEFGHIJKLMN");
        //O optional exige que não seja nulo. Porém, pode-se usar o ofNullable, retorna empty.
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        Optional<String> pereira = Optional.ofNullable(nomes("Pereira"));
        //Isso evita o nulPointer, mas ele retornará empty. É preciso outro processo para retornar.
        String vazio = pereira.orElse("VAZIO");
        System.out.println(vazio);
        //O orElse é como uma estrutura de condição - ele retornará vazio se não encontrar "Pereira".

        //Para pegar um caracter, por exemplo, é preciso usar o ifPresent. Ele exigirá um
        //Consumer, porém, ele retorna void. Por isso, é preciso usar um lambda, com um MethodReference
        //não sendo utilizável nesse caso.
        pereira.ifPresent(s -> System.out.println(s.charAt(2)));
    }

    //A Oracle recomenda trocar String por Optional<>; ofNullable passaria pela estrutura de
    //condição dessa classe, e o instanciamento seria feito apenas chamando a classe.

    private static String nomes(String nome){
        List<String> list = List.of("Alemão", "Pereira");
        int i = list.indexOf(nome);
        if (i != -1){
            return list.get(i);
        }
        //Antes, o retorno era feito com nulo.
        return null;
    }

    //Não é indicado criar nem atributos, nem parâmetros com Optional, pois ele não é serializável.
}
