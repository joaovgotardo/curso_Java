package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste2 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    //Um contra do try/catch é impedir que uma pessoa que execute o main trate a exceção.
    //Através do throws IOException, quem quiser chamar um novo arquivo deverá tratar a exceção.

    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivos\\teste2.txt");
         boolean isCriado = file.createNewFile();
         System.out.println("Arquivo Criado: " + isCriado);
    }

    //Com um método privado, é mais vantajoso usar try-catch.
    //Com um público, o throws é recomendado; especialmente em exceptions não runtime.
}
