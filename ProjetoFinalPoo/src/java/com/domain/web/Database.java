package com.domain.web;
import java.sql.DriverManager;
import java.sql.Connection;

public class Database {
    
    
    
    
    private static Connection connection;
    private static Exception connectionException;
    
    public static Connection getConnection(){
        if(connection == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/appfilme";
                connection = DriverManager.getConnection(url, "root","");
                connectionException = null;
                System.out.print("conectou");
            }catch(Exception ex){
                connection = null;
                connectionException = ex;
            }
        }
        
        return connection;
    }
    
    public static Exception getConnectionException(){
        return connectionException;
    }
}