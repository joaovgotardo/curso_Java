package pacote.primeiro.javaprojeto.javacore.Nexcecoes.runtime.teste;

public class RuntimeExceptionTeste {
    public static void main(String[] args) {
        //Checked - Uma exceção que é diretamente filha da classe Exception.
        //Se essas exceções não forem tratadas, o código nem ao menos compilará.
        //Isso inclui exceções como as do SQL, por exemplo.

        //Unchecked - Uma exceção que é filha de RuntimeException, neta de Exception.
        //Geralmente isso ocorre devido a algum problema de código, com uma trativa
        //precisando ser feita, por exemplo.
        //Isso inclui NulPointer, ClassCast, OutofBounds, por ex.
        Object object = null;
        System.out.println(object.toString());
        //Isso termina num nulpointer, pois o objeto não existe.
        double[] array = {2.5, 5.6};
        System.out.println(array[2]);
        //isso resulta em um outofbounds, a posição 2 do array não existe.
    }
}
