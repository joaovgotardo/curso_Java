package pacote.primeiro.javaprojeto.javanced.Cgenerics.servico;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavel {
    List<Carro> carros = new ArrayList<>(List.of
            (new Carro("Volkswagen"), new Carro("Audi")));

    public Carro compraCarro(){
        Carro car = carros.remove(0);
        System.out.println("Carro comprado: " + car);
        System.out.println("Carros disponíveis: " + carros);
        return car;
    }

    public void vendeCarro(Carro car){
        System.out.println("Carro vendido: " + car);
        carros.add(car);
        System.out.println("Carros disponíveis: " + carros);
    }
}
