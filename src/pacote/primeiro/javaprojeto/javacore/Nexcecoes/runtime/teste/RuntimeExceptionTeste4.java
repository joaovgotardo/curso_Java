package pacote.primeiro.javaprojeto.javacore.Nexcecoes.runtime.teste;

import java.awt.image.ImagingOpException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class RuntimeExceptionTeste4 {
    public static void main(String[] args) {
        //Para tratar múltiplas exceções, basta adicionar múltiplos catches. Ex:
        try{
            throw new ArithmeticException();
            //O catch buscará a exceção que melhor se adequa à situação.
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ocorreu IndexOutOfBoundsException");
        }catch (IllegalMonitorStateException e){
            System.out.println("Ocorreu IllegalMonitorStateException");
        }catch (ArithmeticException e){
            System.out.println("Ocorreu ArithmeticException");
        }//Para um eventual exception mais genérico, como RuntimeException, o ideal seria
        //que um catch do mesmo tipo. Um catch assim também funcionaria com todas as suas subclasses.
        //Não pode-se colocar um catch mais genérico antes do mais específico.

        try{
            jogarExcecoes();
        }catch(SQLException | FileAlreadyExistsException e){
            e.printStackTrace();
        }
        //Catches só podem ser feitos em diferentes niveis de herança.
    }
    //Exceções em si são tratadas separadamente, e as mesmas regras funcionam para ela.
    private static void jogarExcecoes() throws FileAlreadyExistsException, SQLException{
    }
}
