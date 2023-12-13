package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.*;

public class DataTransferObjectTeste {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("455-2008");
        Pais pais = Pais.UNITED_KINGDOM;
        Moeda moeda = MoedaFactory.novaMoeda(pais);
        //Deve-se usar build no final para ser Pessoa e não PessoaBuilder.
        Pessoa nome = Pessoa.PessoaBuilder.builder().nome("Howard").sobrenome("Lawson").build();
        RelatorioDto build = RelatorioDto.RelatorioDtoBuilder.builder()
                .onibusNome(onibus.getNome())
                .pais(pais)
                .moeda(moeda)
                .pessoaName(nome.getNome())
                .build();
        System.out.println(build);
    }
}
