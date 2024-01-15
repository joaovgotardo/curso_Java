package pacote.primeiro.javaprojeto.exercicios.excecoes.teste;

//O código abaixo lança uma exceção (propositalmente) e interrompe sua execução.
//Utilizando o tratamento de exceções, corrija a classe com o objetivo de não parar sua
//execução.
//OBS:: A Exception lançada é ArrayIndexOutOfBoundsException.

public class exercicio1 {
    public static void main(String[] args) {
        System.out.println("Começo");
        metodo1();
        System.out.println("Término");
    }

    static void metodo1(){
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    static void metodo2(){
        System.out.println("Início do metodo2");
        int[] array = new int[10];
        //for (int i = 0; i < 15; i++) //Como era.
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do método 2");
    }
}
