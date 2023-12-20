package pacote.primeiro.javaprojeto.javanced.Ljdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    //JDBC - Java Database Conectivity
    //java.sql = Connection, Statement, ResultSet, DriverManager
    //É preciso instalar o maven, que é um gerenciador de dependência.
    public static Connection getConnection(){ //Pois não receberá outros atributos.
        //Criando conexão.
        String url = "jdbc:mysql://localhost:3306/filme_streaming"; //jdbc:vendor
        //Possibilita a conexão através do Driver Manager.
        String username = "root";
        String password = "Extra1234!";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static JdbcRowSet getRowSet() throws SQLException {
        //Conexão de RowSet.
        String url = "jdbc:mysql://localhost:3306/filme_streaming";
        String username = "root";
        String password = "Extra1234!";
        //Sendo RowSet JavaBin:
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
        //Não é necessário prover url, usuário e senha através de uma conexão CachedRowSet,
        //pois ela está desconectada deo banco.
        return RowSetProvider.newFactory().createCachedRowSet();
    }
}
