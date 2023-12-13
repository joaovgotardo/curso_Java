package pacote.primeiro.javaprojeto.javanced.Ecomportamentos.teste;

import pacote.primeiro.javaprojeto.javanced.Ecomportamentos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoParametroTeste {

    public static void main(String[] args) {
        List<Carro> list = List.of(new Carro("Mercedes", "azul", 2012),
                new Carro("Audi", "preto", 2018),
                new Carro("Fiat", "branco", 2002));
        System.out.println(filtroCor(list, "azul"));
        System.out.println(filtroAno(list, 2010));
    }

    //Para filtrar pelas cores:
    private static List<Carro> filtroCor(List<Carro> list, String cor){
        List<Carro> PretoList = new ArrayList<>();
        for (Carro car: list) {
            if(car.getCor().equals(cor)){
                PretoList.add(car);
            }
        }
        return PretoList;
    }

    //Funcionalidade por ano:
    private static List<Carro> filtroAno(List<Carro> list, int ano){
        List<Carro> AnoList = new ArrayList<>();
        for (Carro car: list) {
            if(car.getAno() <= ano){
                AnoList.add(car);
            }
        }
        return AnoList;
    }

}
