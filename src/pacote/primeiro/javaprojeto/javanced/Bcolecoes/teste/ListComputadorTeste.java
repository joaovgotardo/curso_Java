package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Computador;

import java.util.ArrayList;
import java.util.List;
public class ListComputadorTeste {
    public static void main(String[] args) {
        Computador c1 = new Computador("A313", "ASUS", 8000);
        Computador c2 = new Computador("B741", "Apple", 16000);
        Computador c3 = new Computador("C914", "Pichau", 4000);
        Computador c4 = new Computador("D410", "Positivo", 2000);
        List<Computador> lista = new ArrayList<>();
        lista.add(c1); lista.add(c2); lista.add(c3); lista.add(c4);
        for (Computador computador:lista) {
            System.out.println(computador);
        }
//        lista.clear(); //Para limpar os valores sem perder a variável;
        System.out.println(lista.contains(c3)); //Para verificar se aquela instância está na lista.
        Computador c5 = new Computador("D410", "Positivo", 2000);
        System.out.println(c5.equals(c4)); lista.add(c5);
        System.out.println(lista.indexOf(c5)); //Numa lista com dois objetos iguais, o indexOf retorna o primeiro
        //a aparecer nela. Retorna -1 se a lista não conter esse elemento.

    }
}
