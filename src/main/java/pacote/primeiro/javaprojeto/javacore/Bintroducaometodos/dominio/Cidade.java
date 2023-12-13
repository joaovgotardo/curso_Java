package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio;

public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public void impressao(){
        System.out.println(this.nome);
        System.out.println(this.populacao);
        System.out.println(this.estado);
    }
}
