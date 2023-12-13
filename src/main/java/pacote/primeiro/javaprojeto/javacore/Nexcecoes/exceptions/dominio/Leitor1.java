package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    //Como é uma subclasse, implementa seus métodos.
    @Override
    public void close() throws IOException {
        System.out.println("Esse é o leitor 1");
    }
}
