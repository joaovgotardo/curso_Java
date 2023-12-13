package pacote.primeiro.javaprojeto.javacore.Gheranca.dominio;

public class Sobrescrita {
    private String nome;

    //O toString é uma sobrescrita pois ele já está na classe-pai, Object

    @Override
    public String toString(){
        return "Filme: " + this.nome;
    }

    public Sobrescrita(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
