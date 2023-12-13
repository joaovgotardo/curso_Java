package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calculadora.alteranum(n1, n2);
    }
}
