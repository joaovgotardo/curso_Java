package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Fregex.test;

public class ScannerTeste {
    public static void main(String[] args) {
        //Tokens são como uma lista de palavras e delimitadores o que os separam.
        String texto = "Berserk, Vagabond, Vinland Saga, true, 25015";
        String[] split = texto.split(",");
        for (String nome:split) {
            System.out.println(nome.trim());
        }
        //Scanner tem mais ferramentas para fazer esse tipo de trabalho.
    }
}
