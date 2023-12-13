package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.OnibusSingletonEnum;
import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.OnibusSingletonLazy;

public class OnibusSingletonEnumTeste {
    public static void main(String[] args) {
        comprarAssento("1");
        comprarAssento("2");
        //A vantagem da criação por enumerações é sua simplicidade, ser thread-safe, além
        //de não ser possível usar reflection para alterações.
    }

    private static void comprarAssento(String assento){
        System.out.println(OnibusSingletonEnum.INSTANCIA);
        OnibusSingletonLazy onibus = OnibusSingletonLazy.INSTANCIA();
        System.out.println(onibus.comprarAssento(assento));
    }
}
