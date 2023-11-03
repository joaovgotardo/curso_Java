package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.teste;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.repositorio.Repositorio;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico.RepositorioArquivos;

public class RepositorioTeste {
    public static void main(String[] args) {
        //Na programação orientada à interface, pode-se colocar a interface para polimorfismo de classes
        //que a implementam. Qualquer das classes podem substitui-la.
        Repositorio r1 = new RepositorioArquivos();
        r1.salvar();
    }
}
