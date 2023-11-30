package pacote.primeiro.javaprojeto.javanced.Dclassesinternas.test;

class Animal{
    public void andar(){
        System.out.println("Animal andando.");
    }
}
public class ClassesAnonimasTeste {
    public static void main(String[] args) {
        //Classe anônima - Existe por um breve período, não podendo ser reutilizada. Útil para modificar
        //o comportamento brevemente.
        Animal animal = new Animal(){
            //Isso é uma subclasse anônima de animal:
            @Override
            public void andar(){
                System.out.println("Pessoa andando.");
            }
            //Nada mais pode ser criado aqui, a menos que exista também na classe Animal.
        };
        animal.andar();
    }
}
