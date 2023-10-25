package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.a = 7; cal.b = 11;
        cal.soma(); cal.subtracao();
    }
}
