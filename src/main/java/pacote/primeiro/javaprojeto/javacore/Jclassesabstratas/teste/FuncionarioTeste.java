package pacote.primeiro.javaprojeto.javacore.Jclassesabstratas.teste;

import pacote.primeiro.javaprojeto.javacore.Jclassesabstratas.dominio.BackEndDev;
import pacote.primeiro.javaprojeto.javacore.Jclassesabstratas.dominio.CEO;

public class FuncionarioTeste {
    public static void main(String[] args) {
        BackEndDev backenddev = new BackEndDev("Sergio", 3500);
        CEO ceo = new CEO("Alberto", 25000);
        System.out.println(ceo);
        System.out.println(backenddev);
        backenddev.cidade();
    }
}
