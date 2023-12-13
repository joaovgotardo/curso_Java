package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.Onibus;

public class OnibusTeste {
    public static void main(String[] args) {
        comprarAssento("1");
        comprarAssento("1"); //Um deve retornar falso, porém, os dois vão retornar true.
        //Isso pois, no bloco de inicialização, dois objetos são criados, e mesmo se tentarmos
        //algo para mostrar que é o mesmo objeto, continuará com o mesmo comportamento.
    }

    private static void comprarAssento(String assento){
        Onibus onibus = new Onibus("706-A425");
        System.out.println(onibus.comprarAssento(assento));
    }
}
