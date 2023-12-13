package pacote.primeiro.javaprojeto.javacore.Gheranca.teste;

import pacote.primeiro.javaprojeto.javacore.Gheranca.dominio.Sobrescrita;

public class SobrescritaTeste {
    public static void main(String[] args) {
        Sobrescrita filme = new Sobrescrita("Buffalo '66");
        System.out.println(filme);
        //Se for impresso sem o método toString sobrescrito, voltará a posição da memória do objeto;
        //Se estiver sobrescrito, retornará normalmente.
    }
}
