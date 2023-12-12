package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class OnibusSingletonLazy {
    //No Lazy, não é final
    public static OnibusSingletonLazy INSTANCIA;

    private final Set<String> assentosDisponiveis = new HashSet<>();

    private final String nome;

    public OnibusSingletonLazy(String nome) {
        this.nome = nome;
    }

    {
        assentosDisponiveis.add("1");
        assentosDisponiveis.add("2");
    }

    public static OnibusSingletonLazy INSTANCIA() {
        if(INSTANCIA == null){
            //Isso é feito para evitar duas instâncias iguais para a lazy initialization
            synchronized (OnibusSingletonLazy.class){
                if(INSTANCIA == null) {
                    INSTANCIA = new OnibusSingletonLazy("747-F22");
                }
            }
        }
        return INSTANCIA;
    }

    public boolean comprarAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }

    public String getNome() {
        return nome;
    }


}
