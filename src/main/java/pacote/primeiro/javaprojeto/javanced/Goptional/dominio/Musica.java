package pacote.primeiro.javaprojeto.javanced.Goptional.dominio;

public class Musica {
    private Integer id;
    private String nome;
    private String artista;
    private int duracao; //em segundos

    public Musica(Integer id, String nome, String artista, int duracao) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
