package pacote.primeiro.javaprojeto.javanced.Dclassesinternas.test;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Moto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasTeste2 {
    public static void main(String[] args) {
        //list.of - Imutável | ArrayList - Mutável
        List<Moto> moto = new ArrayList<>();
        moto.add(new Moto("Yamaha"));
        moto.add(new Moto("Hornet"));
        moto.add(new Moto("Harley Davidson"));
        //Classes anônimas também podem ajudar a sortir listas, criando um comparator.
        moto.sort(new Comparator<Moto>() {
            @Override
            public int compare(Moto o1, Moto o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(moto);

        //Pode-se simplificar a classe anônima acima com um lambda.
//        moto.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        //E mais ainda com esse método do Comparator.
//        moto.sort(Comparator.comparing(Moto::getNome));
    }
}
