package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    public boolean autenticar(String nome, String senha) {
        String sql = "SELECT id FROM usuario WHERE nome = ? AND senha = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nome);
            pst.setString(2, senha);
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // se encontrar, login válido
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
