package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void verificar() throws ErroLoginException, FileNotFoundException{
        System.out.println("Algo de errado aconteceu :(");
    }
}
