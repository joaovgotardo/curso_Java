package pacote.primeiro.javaprojeto.javanced.Dclassesinternas.test;

public class ClassesInternasTeste2 {
    private String nome = "Gunter";

    //Pode-se criar classes dentro do método (Classes locais)
    void print(){
        String sobrenome = "Bjornesen";
        //Atributos aqui precisam ser final. Qualquer tentativa de modificação resulta em erro.
        //Quando o método acaba, o atributo deixa de existir. O mesmo vale para parâmetros.
        class LocalClasse{
            //Ainda há o acesso dos atributos externos.
            //Podem-se usar modificadores: abstract e final.
            public void imprimeLocal(){
                System.out.println(nome + " " + sobrenome);
            }
            //Para usar essa classe, é preciso inicializar diretamente no método.
        }
        LocalClasse localClasse = new LocalClasse();
        localClasse.imprimeLocal();
    }
    public static void main(String[] args) {
        ClassesInternasTeste2 cit2 = new ClassesInternasTeste2();
        cit2.print();
    }
}
