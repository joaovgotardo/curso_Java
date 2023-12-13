package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Awrapper.test;

import java.util.List;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper - objeto que encapsula tipos primitivos, e os transforma em objetos;
        //byte, int, short, long, double, float, char, boolean
        int a = 15;
        double b = 2.5;
        char c = 'A';

        //Para transformar em wrapper, basta trocar a primeira letra da variável por maiuscula.
        Integer d = 15;
        Long g = 25L; //O polimorfismo existe aqui, pois integer e long não são classes
        //relacionadas, apenas são classes irmãs em Number.
        Double e = 2.5;
        Character f = 'A';

        //Wrappers são muito úteis em coleções, já que essas não trabalham com primitivos;
        List<Integer> list;
        //Também são úteis em threads e pelo uso de métodos, o que não é possível com primitivos.
        //Wrappers devem ser usados apenas se necessários.

        //Autoboxing - O Java transforma de primitivo a wrapper.
        Integer i = 25;
        Long l = 1551L;
        Double dd = 2415.4;
        Float ff = 5.515F;

        int iad = i; //Unboxing - Conversão de primitivo/wrapper.
        Integer int2 = Integer.parseInt("4"); //Também pode-se converter uma string para um inteiro.

        System.out.println(Character.isDigit('7')); //Há também vários métodos para char.
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.toLowerCase('B'));

    }
}
