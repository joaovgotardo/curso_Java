package pacote.primeiro.javaprojeto.javanced.Dclassesinternas.test;

public class ClassesInternasTeste3 { //Top-level
    //Classe aninhada estática
    private String nome;
    static class Aninhada{
        //Só pode acessar atributos estáticos da classe externa.
        void print(){
            System.out.println(new ClassesInternasTeste3().nome);
        }
        //se for criado dentro da classe, pode ser acessado normalmente.
    }
    public static void main(String[] args) {
        Aninhada nested = new Aninhada();
        nested.print();
    }
}
