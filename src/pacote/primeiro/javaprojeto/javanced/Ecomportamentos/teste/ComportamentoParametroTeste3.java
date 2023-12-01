package pacote.primeiro.javaprojeto.javanced.Ecomportamentos.teste;

import pacote.primeiro.javaprojeto.javanced.Ecomportamentos.dominio.Carro;
import pacote.primeiro.javaprojeto.javanced.Ecomportamentos.interfaces.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoParametroTeste3 {

    public static void main(String[] args) {
        List<Carro> list = List.of(new Carro("Mercedes", "azul", 2012),
                new Carro("Audi", "preto", 2018),
                new Carro("Fiat", "branco", 2002));
        
        List<Carro> carrosBrancos = filtro(list, carro -> carro.getCor().equals("branco"));
        List<Carro> carrosAnoAntigo = filtro(list, carro -> carro.getAno() < 2016);
        System.out.println(carrosBrancos);
        System.out.println(carrosAnoAntigo);
        //A vantagem do filtro ser ainda mais genérico, é que isso pode acontecer:
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(filtro(nums, pares -> pares*2 == 8));
    }
    //Essa classe pode ser ainda mais genérica, ainda assim funcionará da mesma maneira.
    private static <T> List<T> filtro(List<T> list, Predicate<T> predicate){
        List<T> objetosFiltrados = new ArrayList<>();
        for (T e:list) {
            if(predicate.test(e)){
                objetosFiltrados.add(e);
            }
        }
        return objetosFiltrados;
    }

}
