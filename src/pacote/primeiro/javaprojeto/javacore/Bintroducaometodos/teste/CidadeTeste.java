package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.teste;

import pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio.Cidade;

public class CidadeTeste {
    public static void main(String[] args) {
        Cidade cidade01 = new Cidade();
        Cidade cidade02 = new Cidade();
        //ImprimeCidade imprime = new ImprimeCidade();

        cidade01.nome = "São Paulo";
        cidade01.populacao = 12500000;
        cidade01.estado = "SP";

        cidade02.nome = "Rio de Janeiro";
        cidade02.populacao = 6300000;
        cidade02.estado = "RJ";

        cidade01.impressao();
        cidade02.impressao();
        //imprime.imprime(cidade01);
        //imprime.imprime(cidade02);
    }
}
