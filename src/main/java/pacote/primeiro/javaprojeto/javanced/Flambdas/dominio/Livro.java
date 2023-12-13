package pacote.primeiro.javaprojeto.javanced.Flambdas.dominio;

public class Livro {
    private String nome;
    private int paginas;
    //Refatorar: shift f6

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }
}
