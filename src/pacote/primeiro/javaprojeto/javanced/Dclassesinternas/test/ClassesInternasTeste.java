package pacote.primeiro.javaprojeto.javanced.Dclassesinternas.test;

public class ClassesInternasTeste {
    private String nome = "John";

    //Como se fosse um método; pode declarar atributos e ter acesso aos objetos externos.
    class Interna {
        public void imprimeNome(){
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        //Classes internas são como classes dentro de outra classe.
        //Não pode-se chamar a classe interna pois ela não é estática.
        ClassesInternasTeste cit = new ClassesInternasTeste();
        Interna interna = cit.new Interna();//Assim é adicionada uma instância da classe interna.
        interna.imprimeNome();
        //Outro modo de criar:
        Interna citi = new ClassesInternasTeste().new Interna();
        citi.imprimeNome();
    }
}
