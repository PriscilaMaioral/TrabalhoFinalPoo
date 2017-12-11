/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LuizV1
 */
public class Conexao {

    

    
    public static Connection conectar() throws SQLException {
        Connection con = null;
        Statement s = null;
        ResultSet rs = null;
        try{
        String user = "root";
        String pass = "";
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appfilme", user, pass);
        
        /*
        s = con.createStatement();
        rs = s.executeQuery("select * from ator");
        
        while (rs.next()){
            System.out.println(rs.getString("nm_ator")+", "+rs.getString("dt_nascimento")+", "+rs.getString("ds_nacionalidade"));
        }
        s.close();
        */
        }catch (Exception ex) {
            System.out.println(ex);
        }
        
        return con;
        
        
        
    
    }
    
    


    
}
    

