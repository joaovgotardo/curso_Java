package pacote.primeiro.javaprojeto.javacore.Kinterfaces.dominio;

//Uma interface não é mais uma classe; tem um papel semelhante à classe abstrata;
public interface CarregarDados {
    //Por padrão, os métodos são abstratos e públicos
    //São como contratos a serem implementados.
    void carregar();

    //Desde o Java 8, podem também ser implementados métodos concretos nas interfaces;
    //Antes, todas as classes relacionadas a uma interface eram obrigadas a implementar todos os seus métodos;
    //Surgiu como uma solução para atualizar a linguagem, sem que isso interfira em códigos existentes.
    default void prerequisitos(){
        System.out.println("Carregando pré-requisitos");
    }
    //Esse método não tem implementação obrigatória.
    double MIN_SZ_DADOS = 0.00006;
    //Por padrão, os atributos são constantes e estáticos.

    //Por padrão, métodos estáticos são públicos.
    static void AvisoMinDados(){
        System.out.println("Pacote inferior ao limite");
    }
    //Métodos estáticos não são sobrescritos.
}
