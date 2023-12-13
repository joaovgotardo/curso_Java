package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        //Para usar o binary search, a lista deve estar ordenada.
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 7)); //Retorna o índice desse número.
        //Se pedirmos o índice de um valor que não está na lista, ele retorna (- valor da inserção - 1);
        System.out.println(Collections.binarySearch(list, 6)); //Deveria estar na posição 3, retorna -4.
    }
}
