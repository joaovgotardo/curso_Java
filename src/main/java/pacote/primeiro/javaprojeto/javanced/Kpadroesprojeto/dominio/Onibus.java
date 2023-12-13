package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Onibus {
    private final Set<String> assentosDisponiveis = new HashSet<>();
    private final String nome;

    public Onibus(String nome) {
        this.nome = nome;
    }

    {
        assentosDisponiveis.add("1");
        assentosDisponiveis.add("2");
    }

    public boolean comprarAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }

    public String getNome() {
        return nome;
    }
}
