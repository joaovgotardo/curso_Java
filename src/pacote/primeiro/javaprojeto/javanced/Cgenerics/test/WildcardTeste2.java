package pacote.primeiro.javaprojeto.javanced.Cgenerics.test;

import java.util.List;

public class WildcardTeste2 {
    public static void main(String[] args) {
        List<RioGrandeSul> rgs = List.of(new RioGrandeSul(), new RioGrandeSul());
        List<SCatarina> sc = List.of(new SCatarina(), new SCatarina());
        //Se tentar adicionar uma das listas acima a estados, ocorre um erro, pois o Java
        //não sabe qual o tipo da lista que está sendo passada.
    }
    //Para usar o Wildcard, que permite isso, ?
    //Porém, ela ficará como apenas leitura. Não pode ser adicionado nada.
    private static void estadoImprime(List<? extends Brasil> estados){
        for (Brasil estado : estados) {
            System.out.println(estado);
        }
    }
    //Isso significa que o Wildcard permite tanto a classe Brasil, quanto sua superclasse.
    private static void estadoImprimeBrasil(List<? super Brasil> estados){
        //Por isso, só Brasil e suas supers poderiam ser adicionados. Porém, a partir do polimorfismo,
        //isso inclui também suas subclasses indiretamente.
        Brasil rgs = new RioGrandeSul();
        Brasil sc = new SCatarina();
        estados.add(rgs);
        estados.add(sc);
    }
}
