package pacote.primeiro.javaprojeto.introducao;

public class N03Operadores {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 7;
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/(double)n2);
        //O operador de resto de uma divisão é %
        //Os operadores lógicos são < > <= >= == != exemplo
        boolean is714 = 7 > 14;
        System.out.println(is714);

        //Os operadores lógicos são && - em que os dois valores comparados devem ser true
        //e || - em que um dos valores deve ser true
        // e ! - em que o valor não é true
        int valor = 4;
        int outro = 7;
        boolean is4715e = valor > 12 && outro < 15;
        boolean is4747o = valor != 4 || outro == 7;
        System.out.println(is4715e);
        System.out.println(is4747o);

        //operadores de atribuição podem ser usados para modificar o valor de uma variável
        int primeiro = 7;
        primeiro += 4; //Primeiro = 11
        int segundo = 13;
        segundo -= primeiro; //Segundo = 2
        System.out.println("A segunda variável é: "+ segundo);
        int terceiro = primeiro*segundo;
        terceiro %= 5;
        System.out.println("O resto do valor do terceiro por 5 é"+ terceiro);
        // A ordem do incremento pode mudar a impressão da variável, exemplo:
        System.out.println(terceiro++); //Imprime como 2
        System.out.println(terceiro); //Imprime como 3
    }
}
