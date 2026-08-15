/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentloginsystem.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DINUKA
 */
public class DBConnection {
    
    private static DBConnection dBconnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "SL20061020@dns");
        
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBconnection == null){
            dBconnection = new DBConnection();
        } 
        return dBconnection;
    }
    
    
    
}
