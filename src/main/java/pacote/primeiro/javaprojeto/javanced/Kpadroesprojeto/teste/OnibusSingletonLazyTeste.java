package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.OnibusSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class OnibusSingletonLazyTeste {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        comprarAssento("1");
        comprarAssento("1");
        //Usando o reflection, pode-se pegar atributos privados de outras classes.
        Constructor<OnibusSingletonLazy> declaredConstructor = OnibusSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        OnibusSingletonLazy onibusSingletonLazy = declaredConstructor.newInstance("747-F22");
        System.out.println(onibusSingletonLazy);
        //Isso retornaria dois objetos diferentes no singleton. Esse problema pode ser resolvido
        //através da criação de enumerações.
    }

    private static void comprarAssento(String assento){
        //A única forma de obter um objeto de onibus, retornando sempre o mesmo objeto.
        OnibusSingletonLazy onibus = OnibusSingletonLazy.INSTANCIA();
        System.out.println(onibus.comprarAssento(assento));
    }
}
