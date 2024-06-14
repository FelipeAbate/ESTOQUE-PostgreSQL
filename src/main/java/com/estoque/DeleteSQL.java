package com.estoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteSQL {

    public void delete_sql(int id) {

        String delete = "DELETE FROM camisetas WHERE id = ?";
        
        try (Connection conexcao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/produtos",
        "postgres", "senha123");
             PreparedStatement valores = conexcao.prepareStatement(delete)) {
                    
             valores.setInt(1, id); // 1 e a coluna na table
             int linhasAfetadas = valores.executeUpdate();

             if (linhasAfetadas > 0) {
                System.out.println("Um registro foi deletado com sucesso!");
            } else {
                System.out.println("Nenhum registro encontrado com o ID fornecido.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao deletar dados: " + e.getMessage());
        }
        
    }
}

