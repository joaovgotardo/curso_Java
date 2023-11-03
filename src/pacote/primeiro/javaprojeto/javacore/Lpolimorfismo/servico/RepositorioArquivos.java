package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando os arquivos");
    }
}
