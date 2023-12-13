package pacote.primeiro.javaprojeto.javacore.Hmodificadorfinal.teste;

import pacote.primeiro.javaprojeto.javacore.Hmodificadorfinal.dominio.Primitivos;

public class PrimitivosTeste {
    public static void main(String[] args) {
        Primitivos carro = new Primitivos("Audi");
        carro.REFERENCIA.setNome("Nome um");
        carro.REFERENCIA.setNome("Nome dois");
        //A referência pode ser mudada quantas vezes for necessário, porém, carro não pode referenciar outra.

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.REFERENCIA);
    }
}
