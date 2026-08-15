/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentloginsystem.pos.controller;

import com.studentloginsystem.model.Student;
import com.studentloginsystem.pos.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DINUKA
 */
public class StudentController {
    public static boolean signIn(Student std) throws SQLException, ClassNotFoundException{
        String sql = "insert into student values (?,?,?,?,?,?)";
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        PreparedStatement pdst = connection.prepareStatement(sql);
        pdst = connection.prepareStatement(sql);
        pdst.setString(1, std.getfName());
        pdst.setString(2, std.getlName());
        pdst.setString(3, std.getEmail());
        pdst.setString(4, std.getContact());
        pdst.setString(5, ""+std.getId());
        pdst.setString(6, std.getPwd());
        
        int result = pdst.executeUpdate();
        
        return result>0;
        
    }

    public static Student logIn(int stdID) throws ClassNotFoundException, SQLException {
        
        String sql = "select * from student where id=?";
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        PreparedStatement pdst = connection.prepareStatement(sql);
        pdst.setString(1, stdID+"");
        
        ResultSet resultSet = pdst.executeQuery();
        
        if(resultSet.next()){
            Student std = new Student(resultSet.getString("fname"), resultSet.getString("lname"), resultSet.getString("email"), resultSet.getString("contact"), Integer.parseInt(resultSet.getString("id")), resultSet.getString("pwd"));
            return std;
        }else{
            return null;
        }
    }
}
