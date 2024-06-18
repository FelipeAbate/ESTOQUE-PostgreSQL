package com.estoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSQL {

    public void insert_sql (){
     String inserirSQL = "INSERT INTO camisetas (marca, tamanho, quant) VALUES (?, ?, ?)";

        try (Connection conexcao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/produtos",
        "postgres", "senha123");
             PreparedStatement pstm = conexcao.prepareStatement(inserirSQL)) {

            pstm.setString(1, "Adidas");
            pstm.setString(2, "P");
            pstm.setInt(3, 47);
            int linhasAfetadas = pstm.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
