package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.Moeda;
import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.MoedaFactory;
import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.Pais;

public class MoedaFactoryTeste {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.novaMoeda(Pais.UNITED_STATES);
        System.out.println(moeda.getMoeda());
        //Ajuda a manter o baixo acoplamento do código, auxiliando na manutenção.
        //Revisão de acoplamento: O quanto um método/classe depende de outro para funcionar.

        //Singleton - Às vezes, uma classe só pode ter um objeto.
    }
}
