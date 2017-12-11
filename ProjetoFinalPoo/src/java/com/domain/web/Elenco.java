/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.web;

import static com.domain.web.Avaliacao.checarAvaliacaoRepetida;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author LuizV1
 */
public class Elenco {
    
    int cd_elenco;
    String nm_ator;
    String nm_filme;
    
    public static void criarElenco(int cdAtor, int cdFilme) throws SQLException{
        
        
        //if (!checarAvaliacaoRepetida(int cdUsuario, int cdFilme)){
        
        String SQL = "insert into elenco (cd_usuario, dt_avaliacao) values (?,?)";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
       s.setInt(1, cdAtor);
       s.setInt(2, cdFilme);
       s.executeUpdate();
       s.close();
    }
    
    public static void removerAtorDoElenco (int cdAtor, int cdFilme) throws SQLException {
        
    String SQL = "delete from elenco where cd_ator =? AND cd_filme = ?";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
       s.setInt(1, cdAtor);
       s.setInt(2, cdFilme);
       s.executeUpdate();
       s.close();
    
        
    
    }
    
    public static void removerElencoInteiro (int cdFilme) throws SQLException {
        
    String SQL = "delete from elenco where cd_filme = ?";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
       
       s.setInt(2, cdFilme);
       s.executeUpdate();
       s.close();
    
        
    
    }
    
    public static ArrayList<Atores> BuscarElenco (int cdFilme) throws SQLException {
        
    String SQL = "select a.nm_ator from ator a inner join elenco e on a.cd_ator=e.cd_ator where e.cd_filme ="+cdFilme;
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
        ArrayList<Atores> list = new ArrayList<>();
        ResultSet rs = s.executeQuery();
        
        Atores u = null;
        
        while(rs.next()){
            u = new Atores(rs.getString("nm_ator"));
            list.add(u);
        }
       
       rs.close();
       s.close();
    
        return list;
    
    }
    
    public static void AlterarElenco (int cdAtor, int cdFilme) throws SQLException {
        
    String SQL = "update elenco set cd_ator =?, cd_filme = ?";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
       s.setInt(1, cdAtor);
       s.setInt(2, cdFilme);
       s.executeUpdate();
       s.close();
    
        
    
    }
    
}
