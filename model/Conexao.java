package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao() throws SQLException {
        // Ajuste usuário e senha aqui
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/academia", "root", "");
    }
}