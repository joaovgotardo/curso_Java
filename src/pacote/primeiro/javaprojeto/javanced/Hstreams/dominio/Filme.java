package pacote.primeiro.javaprojeto.javanced.Hstreams.dominio;


import java.util.Objects;

public class Filme {
    private String titulo;
    private Integer duracao; //em minutos
    private Genero genero;

    public Filme(String titulo, Integer duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public Filme(String titulo, Integer duracao, Genero genero){
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", genero=" + genero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(titulo, filme.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }
}
