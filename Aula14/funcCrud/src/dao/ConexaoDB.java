/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yago
 */
public class ConexaoDB {
    public Connection getConnecction()throws SQLException{
        Connection con = DriverManager.getConnection (
                "jdbc:postgresql://localhost:5432/fei", "postgres", "postgres");
        return con;
    }
    
}
