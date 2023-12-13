package pacote.primeiro.javaprojeto.introducao;

public class N06Arrays {
    public static void main(String[] args) {
        int[] array = null; //Array é uma variavel de referencia, e pode ser nula. Isso não pode ser feito com primitivos
        int[] array2 = new int[3]; //Isso significa que o array alocou 3 espaços para valores inteiros na memória
        array2[0] = 7; array2[1] = 9; array2[2] = 17;
        //Através do for pode-se imprimir múltiplos valores mais facilmente
        for (int i = 0; i < array2.length ; i++) { //length retorna o tamanho do array2
            System.out.println(array2[i]);
        }
        //Arrays podem ser criados de maneira mais simples, por exemplo:
        String[] array3 = {"A", "B", "C", "D"};
        //E impressos de forma mais simples com o foreach:
        for(String i:array3){
            System.out.println(i);
        }
    }
}
