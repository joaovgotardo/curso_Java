package pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    //Para esse método poder ter seus elementos sortidos, deve implementar o comparable.
    private Long id;
    private String nome;
    private int quantidade;

    public Manga(Long id, String nome) {
        //Pode-se evitar o valor nulo de um atributo através do Objects
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
    }

    public Manga(Long id, String nome, int quantidade) {
        this(id, nome);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    //Pode-se utilizar o próprio IDE para gerar um equals e um hashCode da classe.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(Manga o) {
        //Negativo se this > o
        //Se this == o, return 0
        //Positivo se o > this
        //Isso é necessário para poder usar o sort.
//        if(this.id < o.getId()){
//            return -1;
//        }else if (this.id.equals(o.getId())){
//            return 0;
//        }else{
//            return 1;
//        }
        //Contudo, pode-se delegar ao compareTo dos wrappers essa responsabilidade.
        //Agora, é String quem implementa esse método.
        return this.nome.compareTo(o.getNome());
        //Isso não pode ser feito com tipos primitivos, a menos que ele seja transformado em wrapper antes.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
