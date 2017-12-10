package com.domain.web;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Atores {

    public Atores(int aInt, String string, Date date, String string1) {
    }
    private int cd_ator;
    private String nm_ator;
    private Date dt_nascimento;
    private String ds_nacionalidade;
    
    public static Atores getAtores(String login, String password) throws SQLException{
        String SQL ="SELECT * FROM atores";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);
       
       
        ResultSet rs = s.executeQuery();
        Atores u = null;
        if(rs.next()){
            u = new Atores (rs.getInt("cd_ator")
                    ,  rs.getString("nm_ator")
                    ,  rs.getDate("dt_nascimento")
                    ,  rs.getString("ds_nacionalidade"));
        }
        rs.close();
        s.close();
        return u;
    }
    
    public static void setAtores(String nome, Date nascimento, String nacionalidade) throws SQLException {
        String SQL = "insert into atores (nm_ator, dt_nascimento, ds_nacionalidade) values ('"+nome+"',"+nascimento+", '"+nacionalidade+"')";
       PreparedStatement s = Database.getConnection().prepareStatement(SQL);
       s.executeQuery();
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
