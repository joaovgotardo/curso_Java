package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio.Computador;

public class EqualsTeste {
    public static void main(String[] args) {
        Computador c1 = new Computador("A313", "ASUS", 4000);
        Computador c2 = new Computador("A313", "ASUS", 4000);
        System.out.println(c1.equals(c2));
        //O valor será false, pois os dois estão fazendo referência para dois objetos diferentes.
        //O conteúdo do objeto é o mesmo, mas eles são diferentes.
        Computador c3 = c1;
        System.out.println(c1.equals(c3));
        //Agora, será true. Contudo, se quisessemos que o primeiro caso fosse true, seria necessária
        //a sobrescrita do método equals do Object.
    }
}
