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

    public static void verificarId(Integer id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("Id inválido.");
        }
    }
}
