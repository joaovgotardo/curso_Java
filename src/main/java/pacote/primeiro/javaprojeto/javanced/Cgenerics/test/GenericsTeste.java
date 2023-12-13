package pacote.primeiro.javaprojeto.javanced.Cgenerics.test;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste {
    public static void main(String[] args) {
        List list = new ArrayList();
        //Antigamente, list era fracamente tipado, o que ocasionava problemas. Como uma forma de
        //tipar, em tempo de compilação, foi criado o Generics.
        List<Consumidor> list0 = new ArrayList<>();
        //Esse conceito é chamado de Type Erasure.
        add(list0, new Consumidor("Consumidor"));
        //O uso do Generics é importante, pois ele faz a validação na compilação. Os dados serão
        //adicionados na memória, mas ele não é executado se o Generics não for feito.
    }

    private static void add(List<Consumidor> lista, Consumidor cons){
        lista.add(cons);
    }
}
