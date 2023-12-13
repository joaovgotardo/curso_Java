package pacote.primeiro.javaprojeto.javacore.Nexcecoes.runtime.teste;

public class RuntimeExceptionTeste2 {
    public static void main(String[] args) {
        //Isso resulta em um runtimeException.
        //O try-catch pode ser posto dentro do main;
        try {
            dividir(1, 0);
        }catch (RuntimeException e){  //Pode-se usar o Arithmetic também.
            e.printStackTrace();
        }
        System.out.println("Finalizado.");
    }
    //É obrigatório tratar a exceção abaixo se ela não for runtime. Não é muito comum declarar isso se ela for.
    public static int dividir(int a, int b){
        //Exceções do tipo runtime não precisam ter declaração.
        if (b == 0){
            //Lança uma nova exceção, sem precisar do try/catch.
            throw new IllegalArgumentException("É impossível dividir por zero.");
        }
        //Contudo, se o catch acontecer, não haverá retorno,
        // o que é um problema se a classe não for void. O problema é resolvido com o throw.
        return a/b;
    }
}
