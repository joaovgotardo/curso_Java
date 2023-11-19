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
    }
}
