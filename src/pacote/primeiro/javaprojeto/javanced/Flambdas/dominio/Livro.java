package pacote.primeiro.javaprojeto.javanced.Flambdas.dominio;

public class Livro {
    private String nome;
    private Double preco;

    public Livro(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
