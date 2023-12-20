package pacote.primeiro.javaprojeto.javanced.Mcrud.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/filme_streaming";
        String username = "root";
        String password = "Extra1234!";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
