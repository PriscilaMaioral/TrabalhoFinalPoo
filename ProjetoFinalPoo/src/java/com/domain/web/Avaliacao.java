/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.web;

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
public class Avaliacao {
    
    private int cd_avaliacao;
    private int nr_avaliacao;
    private Date dt_avaliacao;
    private String nomeUsuario;
    private String nomeFilme;
    private String ds_comentario;

    public Avaliacao() {
    }
    
    
    
    public static ArrayList<Avaliacao> listarTodasAvaliacao() throws SQLException{
        String SQL ="a.cd_avaliacao, u.nm_usuario, f.nm_filme, a.dt_avaliacao, a.nr_avaliacao, a.ds_comentario from avaliacao a "
                + "inner join usuario u on a.cd_usuario=u.cd_usuario inner join filme f on a.cd_filme=f.cd_filme";
        PreparedStatement s;
        s = Conexao.conectar().prepareStatement(SQL);
       
        ArrayList<Avaliacao> list = new ArrayList<>();
        ResultSet rs = s.executeQuery();
        Avaliacao u = null;
        while(rs.next()){
            u = new Avaliacao (rs.getInt("cd_avaliacao")
                    ,  rs.getString("nm_usuario")
                    ,  rs.getString("nm_filme")
                    ,  rs.getDate("dt_avaliacao")
                    ,  rs.getInt("nr_avaliacao")
                    ,  rs.getString("ds_comentario"));
            list.add(u);
        }
        
        rs.close();
        s.close();
        return list;
    }
    
    public static Avaliacao buscarAvaliacao(int cdUsuario, int cdFilme) throws SQLException{
        String SQL ="a.cd_avaliacao, u.nm_usuario, f.nm_filme, a.dt_avaliacao, a.nr_avaliacao, a.ds_comentario from avaliacao a "
                + "inner join usuario u on a.cd_usuario=u.cd_usuario "
                + "inner join filme f on a.cd_filme=f.cd_filme where "
                + "cd_usuario = "+cdUsuario+" AND cd_filme = "+cdFilme;
        PreparedStatement s;
        s = Conexao.conectar().prepareStatement(SQL);
       
        
        ResultSet rs = s.executeQuery();
        Avaliacao u = null;
        while(rs.next()){
            u = new Avaliacao (rs.getInt("cd_avaliacao")
                    ,  rs.getString("nm_usuario")
                    ,  rs.getString("nm_filme")
                    ,  rs.getDate("dt_avaliacao")
                    ,  rs.getInt("nr_avaliacao")
                    ,  rs.getString("ds_comentario"));
            
        }
        
        rs.close();
        s.close();
        return u;
    }
    
    
    
    public static void criarAvaliacao(int avaliacao, int cdUsuario, int cdFilme, String comentario) throws SQLException{
        
        
        if (!checarAvaliacaoRepetida(cdUsuario, cdFilme)){
        
        String SQL = "insert into avaliacao (nr_avaliacao, dt_avaliacao, cd_usuario, cd_filme, ds_comentario) values (?,?,?,?,?)";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
       s.setInt(1, avaliacao);
       s.setDate(2, new Date(Calendar.getInstance().getTimeInMillis()));
       s.setInt(3, cdUsuario);
       s.setInt(4, cdFilme);
       s.setString(5, comentario);
       s.executeUpdate();
       s.close();
    } else {
            String msg = "Usuário já fez uma avaliação para esse filme!";
        }
        
    }
    public static boolean checarAvaliacaoRepetida (int cdUsuario, int cdFilme) throws SQLException {
        boolean flag = false;
        String SQL = "select * from avaliacao where cd_usuario = ? and cd_filme = ?)";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
        ResultSet rs = s.executeQuery(SQL);
        s.setInt(1, cdUsuario);
        s.setInt(2, cdFilme);
        if (rs.next()){
            flag = true;
        }else if (!rs.next()){
            flag = false;
        }
        s.close();
        return flag;
    }
    
    public static void removerAvaliacao (int cdUsuario, int cdFilme) throws SQLException {
        String SQL = "delete from avaliacao where cd_usuario = ? and cd_filme = ?)";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
        s.setInt(1, cdUsuario);
        s.setInt(2, cdFilme);
        s.executeUpdate();
        s.close();
    }
    
    public static void alterarAvaliacao (int Avaliacao, int cdUsuario, int cdFilme) throws SQLException {
        String SQL = "update avaliacao set dt_avaliacao = ? , nr_avaliacao = ? where cd_usuario = ? and cd_filme = ?)";
       PreparedStatement s; 
        s = Conexao.conectar().prepareStatement(SQL);
        s.setDate(1, new Date(Calendar.getInstance().getTimeInMillis()));
        s.setInt(2, Avaliacao);
        s.setInt(3, cdUsuario);
        s.setInt(4, cdFilme);
        
        s.executeUpdate();
        s.close();
    }
    
   

    public Avaliacao(int cd_avaliacao,String nomeUsuario, String nomeFilme, Date dt_avaliacao, int nr_avaliacao, String ds_comentario) {
        this.cd_avaliacao = cd_avaliacao;
        this.nr_avaliacao = nr_avaliacao;
        this.dt_avaliacao = dt_avaliacao;
        this.nomeUsuario = nomeUsuario;
        this.nomeFilme = nomeFilme;
        this.ds_comentario = ds_comentario;
    }

    public int getCd_avaliacao() {
        return cd_avaliacao;
    }

    public void setCd_avaliacao(int cd_avaliacao) {
        this.cd_avaliacao = cd_avaliacao;
    }

    public int getNr_avaliacao() {
        return nr_avaliacao;
    }

    public void setNr_avaliacao(int nr_avaliacao) {
        if (nr_avaliacao >=0 && nr_avaliacao <=10) {
        this.nr_avaliacao = nr_avaliacao;
        } else this.nr_avaliacao = 0;
    }

    public Date getdt_Avaliacao() {
        return dt_avaliacao;
    }

    public void setdt_Avaliacao(Date dt_avaliacao) {
        
        this.dt_avaliacao = dt_avaliacao;
        
    }

    public String getDs_comentario() {
        return ds_comentario;
    }

    public void setDs_comentario(String ds_comentario) {
        this.ds_comentario = ds_comentario;
    }
    
    
}
