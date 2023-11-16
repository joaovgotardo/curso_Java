package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivos\\teste2.txt");
        //Copia um arquivo do root do projeto. É necessário usar \\, pois \ é reservado.
        //são usados try e catch para tratamento de exceções
        //É recomendado usar um tipo específico da classe exception, para tratamentos mais específicos.

        //O try vai tentar criar um arquivo, e o catch captura a exceção e a trata.
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado: " + isCriado);
        }catch (IOException e){ //Esse bloco não pode ficar em branco.
            e.printStackTrace();
            //Não é recomendado criar regras de negócio no catch.
            //Em caso de exceção, toda a stack da exceção será impressa.
        }
        //Essa exception é como uma camada de segurança;
    }
}
