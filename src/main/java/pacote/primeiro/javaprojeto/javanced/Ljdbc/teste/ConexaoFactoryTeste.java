package pacote.primeiro.javaprojeto.javanced.Ljdbc.teste;

import pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio.DiretorRepositorio;

public class ConexaoFactoryTeste {
    public static void main(String[] args) {
        Diretor diretor = Diretor.DiretorBuilder.builder().nome("Andrei Tarkovski").build();
        Diretor diretor2 = Diretor.DiretorBuilder.builder().nome("Akira Kurosawa").build();
        DiretorRepositorio.salvar(diretor); //Adicionará o SQL de DiretorRepositorio ao banco.
        DiretorRepositorio.salvar(diretor2);
    }
}
