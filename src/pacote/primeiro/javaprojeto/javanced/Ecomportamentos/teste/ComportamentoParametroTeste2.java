package pacote.primeiro.javaprojeto.javanced.Ecomportamentos.teste;

import org.w3c.dom.ls.LSOutput;
import pacote.primeiro.javaprojeto.javanced.Ecomportamentos.dominio.Carro;
import pacote.primeiro.javaprojeto.javanced.Ecomportamentos.interfaces.Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoParametroTeste2 {

    public static void main(String[] args) {
        List<Carro> list = List.of(new Carro("Mercedes", "azul", 2012),
                new Carro("Audi", "preto", 2018),
                new Carro("Fiat", "branco", 2002));
        //Criando uma classe anônima, podemos utilizar o "esqueleto" feito na classe filtro,
        //utilizando um parâmetro à escolha.
//        List<Carro> carrosPretos = filtro(list, new Teste() {
//            @Override
//            public boolean testando(Carro carro) {
//                return carro.getCor().equals("preto");
//            }
//        });
//        System.out.println(carrosPretos);

        //Essa classe anônima pode ser substituída por um lambda:
        List<Carro> carrosPretos = filtro(list, carro -> carro.getCor().equals("preto"));
            //list, carro representam os dois argumentos passados pela classe filtro
            //carro.get... é a condição que foi requisitada.
        System.out.println(carrosPretos);

        List<Carro> carrosBrancos = filtro(list, carro -> carro.getCor().equals("branco"));
        List<Carro> carrosAnoAntigo = filtro(list, carro -> carro.getAno() < 2016);
        System.out.println(carrosBrancos);
        System.out.println(carrosAnoAntigo);

    }
    //Parametrização dos comportamentos:
    private static List<Carro> filtro(List<Carro> list, Predicate<Carro> predicate){
        //A interface Teste implementará o padrão que for desejado filtrar.
        //teste é como um pattern que pode ser substituído depois.

        //A interface Teste não precisava ter sido criada, pois já existe um Generics do Java,
        //Predicate, que tem essa função.
        List<Carro> filtroCarro = new ArrayList<>();
        for (Carro carro:list) {
            if(predicate.test(carro)){
                filtroCarro.add(carro);
            }
        }
        return filtroCarro;
    }
}
