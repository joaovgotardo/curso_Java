package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {
    public static void main(String[] args) {
        //Coleções: Grupos de dados. Ordered ou Sorted
        //Complexidade Big-O: o quanto cada estrutura de dados é boa para realizar uma determinada
        //ação
        //https://www.cl.cam.ac.uk/teaching/1819/OOProg/complexity.pdf
        //Lista - Uma coleção ordenada. A primeira versão de List era fracamente tipada:
        List lsit = new ArrayList();
        lsit.add("Olá");
        lsit.add(25);

        //Um novo nome não pode ser adicionado pelo foreach, pois isso retornaria uma exceção.
        for (Object obj:lsit) {
            System.out.println(obj);
        }

        //Depois, ela foi modificada.
        List<String> list = new ArrayList<>(16); //Pode-se passar um capacidade também.
        list.add("Descartes");
        list.add("Spinoza");

        for(String li:list){
            System.out.println(li);
        } //Com fori:
        list.add("Leibniz"); //Pode-se adicionar outros valores livremente.

        //Para adicionar outro nome, deve-se usar o fori. Contudo, isso acabaria por ser um loop
        //infinito, já que a lista sempre aumentaria de tamanho e nada seria feito para que nome
        //parasse de ser adicionado.
        int size = list.size(); //Size é criado para evitar esse erro.
        for (int i = 0; i < size; i++) { //Usa size ao invés de length
            list.add("Hume");
            System.out.println(list.get(i)); //Usa get ao invés de []
        }
        System.out.println(list); //"Hume" será adicionado três vezes, que é o tamanho atual
        //da lista, antes de ele ter sido adicionado.

        //Para tipos primitivos, deve-se usar seu Wrapper.
        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(17);

        //Para remover, usa o .remove. Pode-se passar tanto índice quanto objeto.
        list.remove("Hume"); //Não vai remover, pois precisa ser equals.
    }
}
