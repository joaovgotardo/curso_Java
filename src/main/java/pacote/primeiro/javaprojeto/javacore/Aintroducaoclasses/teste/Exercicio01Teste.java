package pacote.primeiro.javaprojeto.javacore.Aintroducaoclasses.teste;

import pacote.primeiro.javaprojeto.javacore.Aintroducaoclasses.dominio.Exercicio01Carro;

public class Exercicio01Teste {
    public static void main(String[] args) {
        Exercicio01Carro carroA = new Exercicio01Carro();
        Exercicio01Carro carroB = new Exercicio01Carro();
        carroA.marca = "Chevrolet";
        carroA.modelo = "Celta";
        carroA.ano = 2006;

        carroB.marca = "Volkswagen";
        carroB.modelo = "Gol";
        carroB.ano = 2011;

        System.out.println("Marca: " + carroA.marca + "\nModelo: " + carroA.modelo + "\nAno: " +
                carroA.ano);
        System.out.println("Marca: " + carroB.marca + "\nModelo: " + carroB.modelo + "\nAno: " +
                carroB.ano);
    }
}
