package pacote.primeiro.javaprojeto.javanced.Cgenerics.test;

import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Carro;
import pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio.Moto;
import pacote.primeiro.javaprojeto.javanced.Cgenerics.servico.CarroRentavel;
import pacote.primeiro.javaprojeto.javanced.Cgenerics.servico.MotoRentavel;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        CarroRentavel carroRentavel = new CarroRentavel();
        Carro car = carroRentavel.compraCarro();
        System.out.println("-----------");
        carroRentavel.vendeCarro(car);

        MotoRentavel motoRentavel = new MotoRentavel();
        Moto moto = motoRentavel.compraMoto();
        System.out.println("-----------");
        motoRentavel.vendeMoto(moto);
    }
}
