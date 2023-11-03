package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.repositorio.Repositorio;

public class RepositorioBanco implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
