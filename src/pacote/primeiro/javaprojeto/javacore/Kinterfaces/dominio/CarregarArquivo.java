package pacote.primeiro.javaprojeto.javacore.Kinterfaces.dominio;

public class CarregarArquivo implements CarregarDados, RemoverDados{
    // Ordem de restrição: private > default > protected > public;
    //Subclasses podem sobrescrever suas classes-pai usando modificadores de acesso menos restritivos
    //ou de igual restrição. Uma classe-pai (ou interface), usando default, não pode ser sobrescrita com private.
    @Override
    public void carregar(){
        System.out.println("Carregar dados do arquivo");
    }
    //Percebe-se que a interface CarregarDados não pode ser concreta (isto é, não abstrata); apenas suas
    //subclasses implementam o método.
    @Override
    public void remover(){
        System.out.println("Remover dados do arquivo");
    }
}
