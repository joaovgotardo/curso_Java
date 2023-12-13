package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio;

//Isso é uma exceção customizada
public class ErroLoginException extends Exception{ //Quem aplicá-la terá que tratar a exceção.
    public ErroLoginException() {
        super("Por favor, digite o login novamente");
    }

    public ErroLoginException(String message) {
        super(message);
    }
}
