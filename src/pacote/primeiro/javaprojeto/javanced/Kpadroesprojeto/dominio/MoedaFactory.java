package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

public class MoedaFactory {
    //Padrão factory - Criado para desacoplar a lógica de negócio da criação de builders.
    public static Moeda novaMoeda(Pais pais){
        //Será criada uma moeda com base no país passado.
        switch(pais){
            case BRASIL: return new Real();
            case UNITED_KINGDOM: return new USDollar();
            case UNITED_STATES: return new SterlingPound();
            default: throw new IllegalArgumentException("Não disponível.");
        }
    }

}
