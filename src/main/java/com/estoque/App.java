package com.estoque;

import java.sql.Connection;
import java.sql.DriverManager;   // Gerenciador de Driver
import java.sql.SQLException;


public class App {

     public static void main (String[] args) {
         try {
             Connection conexcao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/produtos",
                     "postgres", "senha123");
             if (conexcao != null) {
                 System.out.println("\n\n Banco de dados conectado com sucesso!");
                 
             } else {
                 System.out.println("Conexão falhou!");
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
        
         InsertSQL insertInCamisetas = new InsertSQL();
         insertInCamisetas.insert_sql();

     }
}
