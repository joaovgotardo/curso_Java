package pacote.primeiro.javaprojeto.javanced.Cgenerics.test;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Moto;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        createArrayWObject(new Moto("Kawasaki"));
    }
    //Para criar um método genérico:
    private static <T> void createArrayWObject(T t){ //Criar com <> antes do void, para o compilador
        List<T> list = List.of(t);
        System.out.println(list);
    }
    //Pode-se usar também o <T extends ...> para obrigar que a instância tenha alguma característica.
    //Por exemplo, Comparable.
}
class DoisAtributos<T, E, X>{
    private T t; //Pode-se usar quantos generics for preciso.
    private E e;
    private X x;
}
