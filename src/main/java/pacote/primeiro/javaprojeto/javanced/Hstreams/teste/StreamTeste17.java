package pacote.primeiro.javaprojeto.javanced.Hstreams.teste;

public class StreamTeste17 {
    public static void main(String[] args) {
        // Benchmark (Testar o desempenho)
        // Boxing e Unboxing (Pode afetar a performance)
        // Limit e FindFirst não devem ser usados paralelamente. FindAny é.
        // Custo total da computação: Se o processamento for muito alto, Parallel é recomendado.
        // Se forem poucos dados, não vale a pena.
        // Certas coleções são boas para usar (ArrayList), outras não (LinkedList)
        // Streams com tamanho indefinido são piores para paralelizar
        // Processamento do Merge:
            //Se a tarefa não é divisível, faz sequencialmente
            //Se sim, divide, chama o método, espera sua completude, e combina o resultado
    }
}
