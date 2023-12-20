package pacote.primeiro.javaprojeto.javanced.Ljdbc.servico;

import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio.DiretorRepositorio;

import java.util.List;

public class DiretorServico {
    //Adiciona mais uma camada, se eventuais mudanças em outras partes do código ocorrerem.
    public static void salvar(Diretor diretor){
        DiretorRepositorio.salvar(diretor);
    }

    public static void deletar(Integer id){
        verificarId(id);
        DiretorRepositorio.deletar(id);
    }

    public static void atualizar(Diretor diretor){
        verificarId(diretor.getId());
        DiretorRepositorio.atualizar(diretor);
    }

    public static List<Diretor> buscarTodos(){
        return DiretorRepositorio.buscarTodos();
    }

    public static List<Diretor> buscaPorNome(String nome){
        return DiretorRepositorio.buscaPorNome(nome);
    }

    public static void mostrarMetadadosDiretor(){
        DiretorRepositorio.mostrarMetadadosDiretor();
    }

    public static void mostrarMetadadosDriver(){
        DiretorRepositorio.mostrarMetadadosDriver();
    }

    public static void mostrarTipoScroll(){
        DiretorRepositorio.mostrarTipoScroll();
    }

    public static List<Diretor> buscaPorNomeParaLowercase(String nome){
        return DiretorRepositorio.buscaPorNomeParaLowercase(nome);
    }

    public static List<Diretor> buscaPorNomeInserir(String nome){
        return DiretorRepositorio.buscaPorNomeInserir(nome);
    }

    public static void buscaPorNomeDeletar(String nome){
        DiretorRepositorio.buscaPorNomeDeletar(nome);
    }

    public static List<Diretor> buscaPorNomePreparedSt (String nome){
        return DiretorRepositorio.buscaPorNomePreparedSt(nome);
    }

    public static void atualizarPreparedStatement(Diretor diretor){
        DiretorRepositorio.atualizarPreparedStatement(diretor);
    }

    public static List<Diretor> buscaPorNomeCallableSt (String nome){
        return DiretorRepositorio.buscaPorNomeCallableSt(nome);
    }

    public static List<Diretor> buscaPorNomeRowSet(String nome){
        return DiretorRepositorio.buscaPorNomeJdbcRowSet(nome);
    }

    public static void atualizarRowSet(Diretor diretor){
        DiretorRepositorio.atualizarRowSet(diretor);
    }

    public static void atualizarCachedRowSet(Diretor diretor){
        DiretorRepositorio.atualizarCacheRowSet(diretor);
    }

    public static void salvarTransacao(List<Diretor> diretores){
        DiretorRepositorio.salvarTransacao(diretores);
    }

    public static void verificarId(Integer id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("Id inválido.");
        }
    }
}
