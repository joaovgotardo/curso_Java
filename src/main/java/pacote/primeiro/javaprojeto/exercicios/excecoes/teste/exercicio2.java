package pacote.primeiro.javaprojeto.exercicios.excecoes.teste;

import java.util.Locale;
import java.util.Scanner;

//Nesta questão você deve identificar as partes problemáticas do código e reescrevê-lo
//utilizando tratamento de exceções. Ou seja, devem ser identificadas todas as exceções que
//podem ser levantadas e, para cada uma, deve ser dado o tratamento adequado que, nesse
//exercício, significa alertar o usuário quanto ao problema. Entretanto, nesse programa a leitura
//dos valores deve ser feita, mesmo que para isso o usuário tenha que tentar informar várias
//vezes os valores na mesma execução do programa.
public class exercicio2 {
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        try{
            System.out.println("Informe o primeiro valor: ");
            int x = t.nextInt();
            System.out.println("Informe o segundo valor: ");
            int y = t.nextInt();
            double r = (int)(x / y);
            //Locale é usado para que as casas decimais sejam impressas depois de um ponto e não de uma vírgula.
            System.out.printf(Locale.UK, "O resultado da soma é %.1f", r);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Impossível dividir por 0");
        }
    }
}
