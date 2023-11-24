package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Iserializacao.dominio;

import java.io.Serializable;

public class Turma {
    private String nome;

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
