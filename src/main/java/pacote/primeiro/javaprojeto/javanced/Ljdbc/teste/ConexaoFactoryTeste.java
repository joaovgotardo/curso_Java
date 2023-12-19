package pacote.primeiro.javaprojeto.javanced.Ljdbc.teste;

import lombok.extern.log4j.Log4j2;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio.DiretorRepositorio;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.servico.DiretorServico;

import java.util.List;

@Log4j2
public class ConexaoFactoryTeste {
    public static void main(String[] args) {
//        Diretor diretor = Diretor.DiretorBuilder.builder().nome("Andrei Tarkovski").build();
//        Diretor diretor2 = Diretor.DiretorBuilder.builder().nome("Akira Kurosawa").build();
        //Com lombok:
//        Diretor diretor = Diretor.builder().nome("Stanley Kubrick").build();
//        Diretor diretor2 = Diretor.builder().nome("Stanley Kubrick").build();
//        Diretor diretor3 = Diretor.builder().nome("Stanley Kubrick").build();
//
//        DiretorServico.deletar(4); //Deletando.
//        DiretorServico.deletar(5);
//        DiretorServico.deletar(6);
//
        Diretor diretor = Diretor.builder().id(1).nome("Ingmar Bergman").build();
//        DiretorServico.atualizar(diretor);

//        List<Diretor> diretors = DiretorServico.buscarTodos();
//        log.info(diretors);

//        DiretorServico.buscaPorNome("Ingmar");

//        DiretorServico.mostrarMetadadosDiretor();

        DiretorServico.mostrarMetadadosDriver();

        DiretorServico.mostrarTipoScroll();

        DiretorServico.buscaPorNomeParaLowercase("Akira");

        DiretorServico.buscaPorNomeInserir("Christopher Nolan");

        DiretorServico.buscaPorNomeDeletar("Christopher Nolan");

        DiretorServico.buscaPorNomePreparedSt("Stanley Kubrick");
        //Poderia-se ter feito o seguinte:
        //DiretorServico.buscaPorNomePreparedSt("Stanley Kubrick or X'='X");, que retornaria
        //todos os dados dentro do banco. O PreparedStatement ajuda a corrigir isso. Ele não
        //retorna mais tudo, pois não retorna aspas simples.

        DiretorServico.atualizarPreparedStatement(diretor);
    }
}
