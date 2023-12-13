package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.Onibus;
import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.OnibusSingletonEager;

public class OnibusSingletonEagerTeste {
    public static void main(String[] args) {
        comprarAssento("1");
        comprarAssento("1"); //Agora, retorna-se false.
    }

    private static void comprarAssento(String assento){
        //A única forma de obter um objeto de onibus, retornando sempre o mesmo objeto.
        OnibusSingletonEager onibus = OnibusSingletonEager.INSTANCIA();
        System.out.println(onibus.comprarAssento(assento));
    }
}
