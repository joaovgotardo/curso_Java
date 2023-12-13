package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

import java.util.Scanner;

public class ScannerTeste2 {
    public static void main(String[] args) {
        //Tokens são como uma lista de palavras e delimitadores o que os separam.
        String texto = "Berserk,Vagabond,Vinland Saga,25.7,25015";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(","); //Para usar outro delimitador.
        //O scanner funciona como dois ponteiros: um verifica se um valor existe,
        //e o outro "anda".
        while (scanner.hasNext()){
            System.out.println(scanner.next());
            if(scanner.hasNextInt()){
                int in = 25;
                in += scanner.nextInt();
                System.out.println(in);
            }else if(scanner.hasNextDouble()){
                double d = scanner.nextDouble();
                System.out.println(d);
            }
        }
    }
}
