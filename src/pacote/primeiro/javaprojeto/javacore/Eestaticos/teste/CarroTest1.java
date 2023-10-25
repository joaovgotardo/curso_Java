package pacote.primeiro.javaprojeto.javacore.Eestaticos.teste;

import pacote.primeiro.javaprojeto.javacore.Eestaticos.dominio.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Volkswagen", 200);
        Carro c2 = new Carro("BMW", 270);
        Carro c3 = new Carro("Audi", 250);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
