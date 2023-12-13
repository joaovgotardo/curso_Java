package pacote.primeiro.javaprojeto.javanced.Ljdbc.repositorio;

import pacote.primeiro.javaprojeto.javanced.Ljdbc.conn.ConexaoFactory;
import pacote.primeiro.javaprojeto.javanced.Ljdbc.dominio.Diretor;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DiretorRepositorio {
    public static void salvar(Diretor diretor){
        String sql = String.format("INSERT INTO `filme_streaming`.`diretor` (`nome`) VALUES ('%s');",
                diretor.getNome()); //Recebe um sql.

        //Esse try with resources é feito pois o Connection é um closeable.
        try(Connection con = ConexaoFactory.getConnection();
            Statement smt = con.createStatement()){ //Cria um objeto para adicionar dados com o Statement.
            smt.executeUpdate(sql);
            //O update é usado para modificações dentro do banco, e pode ter um insert, update e um
            //delete. Ele retorna o número de linhas afetadas no banco.
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
