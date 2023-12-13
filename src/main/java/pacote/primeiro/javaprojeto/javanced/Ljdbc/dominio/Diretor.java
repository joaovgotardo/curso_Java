package pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio;

import java.util.Objects;

public class Diretor {
    private Integer id;
    private String nome;

    public static final class DiretorBuilder {
        private Integer id;
        private String nome;

        private DiretorBuilder() {
        }

        public static DiretorBuilder builder() {
            return new DiretorBuilder();
        }

        public DiretorBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public DiretorBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Diretor build() {
            Diretor diretor = new Diretor();
            diretor.id = this.id;
            diretor.nome = this.nome;
            return diretor;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diretor diretor = (Diretor) o;
        return Objects.equals(id, diretor.id) && Objects.equals(nome, diretor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
