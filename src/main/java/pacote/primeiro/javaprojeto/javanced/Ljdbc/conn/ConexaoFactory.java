package pacote.primeiro.javaprojeto.javanced.Ljdbc.conn;

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
        String username = "root"; //userusernamename
        String password = "";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
