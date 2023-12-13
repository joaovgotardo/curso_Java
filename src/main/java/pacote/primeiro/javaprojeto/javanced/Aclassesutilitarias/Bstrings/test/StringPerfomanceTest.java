package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Bstrings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long ti = System.currentTimeMillis();
//        teste(20000); //Pode-se usar _ para melhor visualização
        teste2(500_000);
        long tf = System.currentTimeMillis();
        System.out.println(tf - ti); //Para ver o tempo gasto para execução.
        //A performance das Strings vai demorando mais de acordo com seu tamanho;
        //1000ch: Com String: 21ms. Com Stringbuilder: 4ms.
        //20000ch: Com String: +3000ms. Com Stringbuilder: 18ms.
        //100000ch: String: Não terminado. Stringbuilder: 137ms.

        long ti2 = System.currentTimeMillis();
        teste3(500_000);
        long tf2 = System.currentTimeMillis();
        System.out.println(tf2 - ti2);
        //String - Feita para representar coisas do mundo real, e é preferível por ser mais simples.
        //As outras duas são ideais apenas para sistemas realmente grandes.
    }

    private static void teste(int tamanho){
        String inicio = "";
        for (int i = 0; i < tamanho; i++) {
            inicio += i;
        }
    }

    private static void teste2(int tamanho){
        StringBuilder sbi = new StringBuilder("");
        for (int i = 0; i < tamanho; i++) {
            sbi.append(i); //O append é usado para stringbuilder.
        }
    }

    //O Stringbuffer é feito especialmente para ambientes com múltiplas ocorrências ao mesmo tempo.
    private static void teste3(int tamanho){
        StringBuffer sbf = new StringBuffer("");
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i); //O append é usado para stringbuilder.
        }
    }
}
