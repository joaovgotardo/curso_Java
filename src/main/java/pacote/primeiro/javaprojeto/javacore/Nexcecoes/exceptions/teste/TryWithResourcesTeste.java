package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.teste;

import pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio.Leitor1;
import pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTeste {
    public static void main(String[] args) {
        lerArquivo3();
    }

    //O código abaixo acaba por ficar complexo e esteticamente desagradável, por isso, existe o try with resources.
    public static void lerArquivo(){
        Reader reader = null;
        try {
            //FileReader lança uma exceção, resolvida com try-catch.
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null){
                    reader.close(); //Contudo, close também lança uma exceção.
                    //Ele não será executado já que reader é nulo.
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //Devido à prolixidade do código anterior, existe o try with resources.
    public static void lerArquivo2(){
        //A declaração e instância da classe são feitas entre os () do try.
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){
        //Agora, as exceções feitas pelo finally são feitas pelo try with resources,
            //economizando código.
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo3(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
        //Se as classes implementarem o Closeable, elas podem ser declaradas juntas dentro
            //do try.
        }catch(IOException e){
        }
    }
    //Devido à uma maior facilidade no uso junto a bancos de dados, os parâmetros são chamados
    //na ordem inversa que foram declarados.
}
