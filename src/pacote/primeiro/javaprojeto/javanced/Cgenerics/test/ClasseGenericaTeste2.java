package pacote.primeiro.javaprojeto.javanced.Cgenerics.test;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Carro;
import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Moto;
import pacote.primeiro.javaprojeto.javanced.Cgenerics.servico.Rentavel;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste2 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("Volkswagen"), new Carro("Audi")));
        List<Moto> motos = new ArrayList<>(List.of(new Moto("Honda"), new Moto("Harley Davidson")));
        //Para escolher o tipo de objeto a se trabalhar:
        Rentavel<Carro> rentavel = new Rentavel<>(carros);
        //A instância de rentável substituirá <T> pelo objeto a ser utilizado, e pedirá uma lista desse
        //objeto como parâmetro.
        Carro car = rentavel.compraVeiculo();
        System.out.println("-----");
        rentavel.vendeVeiculo(car);
        //Para uma moto, o código é praticamente o mesmo.
        Rentavel<Moto> rentavel2 = new Rentavel<>(motos);
        Moto moto = rentavel2.compraVeiculo();
        System.out.println("-----");
        rentavel2.vendeVeiculo(moto);
    }
}
