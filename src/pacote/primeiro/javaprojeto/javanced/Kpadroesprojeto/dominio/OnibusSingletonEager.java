package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class OnibusSingletonEager {
    //Eager - Como o atributo é estático, o objeto será criado.
    public static final OnibusSingletonEager INSTANCIA = new OnibusSingletonEager("747-F22");

    private final Set<String> assentosDisponiveis = new HashSet<>();

    private final String nome;

    public OnibusSingletonEager(String nome) {
        this.nome = nome;
    }

    {
        assentosDisponiveis.add("1");
        assentosDisponiveis.add("2");
    }

    public static OnibusSingletonEager INSTANCIA() {
        return INSTANCIA;
    }

    public boolean comprarAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }

    public String getNome() {
        return nome;
    }


}
