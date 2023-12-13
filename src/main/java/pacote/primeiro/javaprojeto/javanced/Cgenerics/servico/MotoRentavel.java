package pacote.primeiro.javaprojeto.javanced.Cgenerics.servico;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Moto;

import java.util.ArrayList;
import java.util.List;

//Essa classe é praticamente a mesma de CarroRentavel. Para evitar essa repetição, existe a
//Classe Genérica.
public class MotoRentavel {
    List<Moto> motos = new ArrayList<>(List.of
            (new Moto("Honda"), new Moto("Harley Davidson")));

    public Moto compraMoto(){
        Moto moto = motos.remove(0);
        System.out.println("Moto comprado: " + moto);
        System.out.println("motos disponíveis: " + motos);
        return moto;
    }

    public void vendeMoto(Moto moto){
        System.out.println("Moto vendido: " + moto);
        motos.add(moto);
        System.out.println("motos disponíveis: " + motos);
    }
}
