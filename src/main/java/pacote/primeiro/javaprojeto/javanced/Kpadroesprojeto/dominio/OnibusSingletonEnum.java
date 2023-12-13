package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum OnibusSingletonEnum {
    //Criação do objeto usando enumeração.
    INSTANCIA;
    private final Set<String> assentosDisponiveis;

    OnibusSingletonEnum() {
        this.assentosDisponiveis = new HashSet<>();
        this.assentosDisponiveis.add("1");
        this.assentosDisponiveis.add("2");
    }
}
