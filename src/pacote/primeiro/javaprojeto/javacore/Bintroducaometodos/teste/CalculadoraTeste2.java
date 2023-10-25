package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] nums = {1, 2, 5, 7, 15};
        calculadora.somarray(nums);
        calculadora.somaVarArgs(2, 5, 9, 15, 25, 61); //com o varargs pode-se passar os argumentos diretamente
    }
}
