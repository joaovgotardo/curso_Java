package pacote.primeiro.javaprojeto.javacore.Nexcecoes.error.teste;

//Uma stack é como uma pilha de chamadas. Por exemplo, o método main chama
//um outro método, que chama outro e assim por diante.
//Contudo, se for usado um método recursivo, que se chama indefinidamente, pode
//ocorrer o StackOverflow, ou seja, a saída da stack.
public class StackOverflowTeste {
    //Se esse programa for executado, ele chamará recursivo() indefinidamente.
    //A única solução é modificar o código.
    public static void main(String[] args) {
        recursivo();
    }
    public static void recursivo(){
        recursivo();
    }
}
