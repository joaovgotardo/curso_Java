package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste0 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.multiplica(7, 5); //Chama o método multiplica e dá valor aos seus parâmetros (argumentos)

        Calculadora div = new Calculadora();
        int divisao = div.divisao(27, 9); //Para métodos que especificam o seu tipo precisa-se criar uma variável
        System.out.println(divisao);
    }
}
