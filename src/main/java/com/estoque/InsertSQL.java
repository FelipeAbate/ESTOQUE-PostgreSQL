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
             PreparedStatement valores = conexcao.prepareStatement(inserirSQL)) {
        // Declaração preparada \\

            // Defina os valores para cada parâmetro
            valores.setString(1, "tommy");
            valores.setString(2, "M");
            valores.setInt(3, 25);

            //executeUpdate() Executa a instrução SQL de inserção e  
            //retorna o número de linhas afetadas.
            int linhasAfetadas = valores.executeUpdate();

            // Verifique se a inserção foi bem-sucedida
            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
