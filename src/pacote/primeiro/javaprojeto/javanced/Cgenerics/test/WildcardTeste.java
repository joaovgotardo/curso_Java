package pacote.primeiro.javaprojeto.javanced.Cgenerics.test;

abstract class Brasil{
    public abstract void estado();
}

class RioGrandeSul extends Brasil{
    @Override
    public void estado() {
        System.out.println("RS é um estado do Brasil");
    }
}

class SCatarina extends Brasil{
    @Override
    public void estado() {
        System.out.println("SC é um estado do Brasil");
    }
}

public class WildcardTeste {
    public static void main(String[] args) {
        RioGrandeSul[] rgs = {new RioGrandeSul(), new RioGrandeSul()};
        SCatarina[] sc = {new SCatarina(), new SCatarina()};
        estadoImprime(rgs);
        estadoImprime(sc);
        Brasil[] br = {new RioGrandeSul(), new SCatarina()};
        estadoImprime(br);
    }
    private static void estadoImprime(Brasil[] estados){
        for (Brasil estado : estados) {
            System.out.println(estado);
        }
        //Se tentar adicionar SC a estados, haverá ArrayStoreException; pode-se fazer
        //o polimorfismo da classe Brasil, para adicionar dois do mesmo tipo.
        //Com arrays, isso funciona normalmente, porém, com listas, isso fica mais complexo.
    }
}
