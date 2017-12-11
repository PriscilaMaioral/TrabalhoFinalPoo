package com.domain.web;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    public static ArrayList<Atores> getTodosAutores() throws SQLException{
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
    
    public static void setCadastroAtores() throws SQLException {
       String SQL = "insert into ator (nm_ator, ds_nacionalidade) values ('luiz2','brhue')";
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL); 
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
