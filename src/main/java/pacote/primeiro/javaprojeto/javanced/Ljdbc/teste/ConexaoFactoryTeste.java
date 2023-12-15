package pacote.primeiro.javaprojeto.javanced.Ljdbc.teste;

import pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio.DiretorRepositorio;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.servico.DiretorServico;

public class ConexaoFactoryTeste {
    public static void main(String[] args) {
//        Diretor diretor = Diretor.DiretorBuilder.builder().nome("Andrei Tarkovski").build();
//        Diretor diretor2 = Diretor.DiretorBuilder.builder().nome("Akira Kurosawa").build();
        //Com lombok:
//        Diretor diretor = Diretor.builder().nome("Stanley Kubrick").build();
//        Diretor diretor2 = Diretor.builder().nome("Stanley Kubrick").build();
//        Diretor diretor3 = Diretor.builder().nome("Stanley Kubrick").build();

//        DiretorServico.deletar(4); //Deletando.
//        DiretorServico.deletar(5);
//        DiretorServico.deletar(6);

        Diretor diretor = Diretor.builder().id(1).nome("Ingmar Bergman").build();
        DiretorServico.atualizar(diretor);
    }
}
