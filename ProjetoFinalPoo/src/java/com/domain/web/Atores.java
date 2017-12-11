package com.domain.web;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Date;

public class Atores {

    public Atores(int cdAtor, String nmAtor, Date nasc, String nacionalidade) {
    cd_ator = cdAtor;
    nm_ator = nmAtor;
    dt_nascimento = nasc;
    ds_nacionalidade = nacionalidade;
    
    }

    public Atores() {
    }
    private int cd_ator;
    private String nm_ator;
    private Date dt_nascimento;
    private String ds_nacionalidade;
    
    public static ArrayList<Atores> listarTodosAtores() throws SQLException{
        String SQL ="SELECT * FROM ator";
        PreparedStatement s;
        s = Conexao.conectar().prepareStatement(SQL);
       
        ArrayList<Atores> list = new ArrayList<>();
        ResultSet rs = s.executeQuery();
        Atores u = null;
        while(rs.next()){
            u = new Atores (rs.getInt("cd_ator")
                    ,  rs.getString("nm_ator")
                    ,  rs.getDate("dt_nascimento")
                    ,  rs.getString("ds_nacionalidade"));
            list.add(u);
        }
        
        rs.close();
        s.close();
        return list;
    }
    
    public static ArrayList<Atores> buscaAtor(String ator, String nacionalidade) throws SQLException{
        String SQL ="";
        //Se todos combinam com a pesquisa
        if (!"".equals(ator) && !"".equals(nacionalidade)){
        SQL ="SELECT * FROM ator WHERE nm_ator = '"+ator+"' AND ds_nacionalidade = '"+nacionalidade+"'";
        //Apenas nome inserido
        }else if (!"".equals(ator)) {
        SQL ="SELECT * FROM ator WHERE nm_ator = '"+ator+"'";
        }else if  (!"".equals(nacionalidade)){
        SQL ="SELECT * FROM ator WHERE ds_nacionalidade ='"+nacionalidade+"'";
        }
        
        PreparedStatement s;
        s = Conexao.conectar().prepareStatement(SQL);
       
        ArrayList<Atores> list = new ArrayList<>();
        ResultSet rs = s.executeQuery();
        Atores u = null;
        while(rs.next()){
            u = new Atores (rs.getInt("cd_ator")
                    ,  rs.getString("nm_ator")
                    ,  rs.getDate("dt_nascimento")
                    ,  rs.getString("ds_nacionalidade"));
            list.add(u);
        }
        
        rs.close();
        s.close();
        return list;
        
    }

    public Atores(String nm_ator) {
        this.nm_ator = nm_ator;
    }
    
    public static void alterarAtor (int cdAtor, String ator, Date data, String nacionalidade) throws SQLException {
       String SQL = "update ator set nm_ator = ? , dt_nascimento = ?, ds_nacionalidade = ? where cd_ator = "+cdAtor;
       PreparedStatement s;
       s = Conexao.conectar().prepareStatement(SQL); 
       s.setString(1, ator);
       s.setDate(2, data);
       s.setString(3, nacionalidade);
       s.executeUpdate();
       s.close();
    }
    
    
    public static void cadastroAtor(String ator, Date data, String nacionalidade) throws SQLException {
       String SQL = "insert into ator (nm_ator, dt_nascimento, ds_nacionalidade) values (?,?,?)";
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL); 
       s.setString(1, ator);
       s.setDate(2,  data);
       s.setString(3, nacionalidade);
       s.executeUpdate();
       s.close();
       
    }
    
    public static void removerAtor(int cdAtor) throws SQLException{
       String SQL = "DELETE from ator where cd_ator = ?";
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL); 
       s.setInt(1, cdAtor);
       s.executeUpdate();
       s.close();
    }

    public int getCd_ator() {
        return cd_ator;
    }

    public void setCd_ator(int cd_ator) {
        this.cd_ator = cd_ator;
    }

    public String getNm_ator() {
        return nm_ator;
    }

    public void setNm_ator(String nm_ator) {
        this.nm_ator = nm_ator;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getDs_nacionalidade() {
        return ds_nacionalidade;
    }

    public void setDs_nacionalidade(String ds_nacionalidade) {
        this.ds_nacionalidade = ds_nacionalidade;
    }
    
}
