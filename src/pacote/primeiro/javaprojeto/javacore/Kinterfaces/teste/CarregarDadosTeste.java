package pacote.primeiro.javaprojeto.javacore.Kinterfaces.teste;

import pacote.primeiro.javaprojeto.javacore.Kinterfaces.dominio.CarregarArquivo;
import pacote.primeiro.javaprojeto.javacore.Kinterfaces.dominio.CarregarBancoDados;
import pacote.primeiro.javaprojeto.javacore.Kinterfaces.dominio.CarregarDados;

public class CarregarDadosTeste {
    public static void main(String[] args) {
        CarregarBancoDados cbancod = new CarregarBancoDados();
        CarregarArquivo carquivo = new CarregarArquivo();
        cbancod.carregar(); carquivo.carregar();
        cbancod.remover(); carquivo.remover();

        CarregarDados.AvisoMinDados();
    }
}
