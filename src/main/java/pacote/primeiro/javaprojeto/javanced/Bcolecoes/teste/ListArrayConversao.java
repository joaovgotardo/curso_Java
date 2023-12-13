package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListArrayConversao {
    public static void main(String[] args) {
        //Por uma questão de performance, o LinkedList é melhor para remoções frequentes que o ArrayList.
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        //Conversão para um array:
        Integer[] array = list.toArray(new Integer[0]);
        //0 é passado pois através dele o Java sabe o tamanho do array que precisará criar.
        //Ele também tem um desempenho melhor que outras opções.
        System.out.println(Arrays.toString(array));

        //De array para list:
        Integer[] numeros = {0, 1, 2, 3};
        List<Integer> integerList = Arrays.asList(numeros);
        //Deve-se tomar cuidado ao trocar o valor de um array com o set por exemplo, pois isso
        //modificaria o valor tanto no List quanto no array.
        System.out.println(integerList);
        //Contudo, esse list não pode mais ser alterado. Para poder alterá-lo:
        List<Integer> alterList = new ArrayList<>(Arrays.asList(numeros));
        alterList.add(6);
        System.out.println(alterList);

        //Também pode-se criar diretamente.
        List<Integer> integerList1 = Arrays.asList(2, 4, 7, 9);
        System.out.println(integerList1);
    }
}
