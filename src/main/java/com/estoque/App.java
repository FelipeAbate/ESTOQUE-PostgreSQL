package com.estoque;

import java.sql.Connection;
import java.sql.DriverManager;
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

         DeleteSQL deleteId = new DeleteSQL();
         deleteId.delete_sql(61); 
        
         UpdateSQL modificarCamisetas = new UpdateSQL();
         modificarCamisetas.modificar("Onbongo", 58);

     }
}


/* 
          Como deletar varios: 

          funciona pq os valores a deletar são int
          já que o for é feito com int i
          Ex:

             for (int i = 21; i <= 52; i++){
             deleteId.delete_sql(i);
             }
         */