package com.domain.web;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Filmes {
    private int cd_filme;
    private String nm_filme;
    private String ds_genero;
    private int qt_duracao;
    private String nm_diretor;
    private Date dt_lancamento;
    private int cd_elenco; 
    
    public static Filmes getFilmes(int cd_filme, String nm_filme) throws SQLException{
        String SQL ="SELECT * FROM filmes";
        PreparedStatement s = Database.getConnection().prepareStatement(SQL);
       
       
        ResultSet rs = s.executeQuery();
        Filmes u = null;
        if(rs.next()){
            u = new Filmes (rs.getInt("cd_filme")
                    , rs.getString("nm_filme")
                    , rs.getString("ds_genero")
                    , rs.getInt("qt_duracao")
                    , rs.getString("nm_diretor")
                    , rs.getDate("dt_lancamento")
                    , rs.getInt("cd_elenco"));
        }
        rs.close();
        s.close();
        return u;
    }

    public Filmes(int cd_filme, String nm_filme, String ds_genero, int qt_duracao, String nm_diretor, Date dt_lancamento, int cd_elenco) {
        this.cd_filme = cd_filme;
        this.nm_filme = nm_filme;
        this.ds_genero = ds_genero;
        this.qt_duracao = qt_duracao;
        this.nm_diretor = nm_diretor;
        this.dt_lancamento = dt_lancamento;
        this.cd_elenco = cd_elenco;
    }

    public int getCd_filme() {
        return cd_filme;
    }

    public void setCd_filme(int cd_filme) {
        this.cd_filme = cd_filme;
    }

    public String getNm_filme() {
        return nm_filme;
    }

    public void setNm_filme(String nm_filme) {
        this.nm_filme = nm_filme;
    }

    public String getDs_genero() {
        return ds_genero;
    }

    public void setDs_genero(String ds_genero) {
        this.ds_genero = ds_genero;
    }

    public int getQt_duracao() {
        return qt_duracao;
    }

    public void setQt_duracao(int qt_duracao) {
        this.qt_duracao = qt_duracao;
    }

    public String getNm_diretor() {
        return nm_diretor;
    }

    public void setNm_diretor(String nm_diretor) {
        this.nm_diretor = nm_diretor;
    }

    public Date getDt_lancamento() {
        return dt_lancamento;
    }

    public void setDt_lancamento(Date dt_lancamento) {
        this.dt_lancamento = dt_lancamento;
    }

    public int getCd_elenco() {
        return cd_elenco;
    }

    public void setCd_elenco(int cd_elenco) {
        this.cd_elenco = cd_elenco;
    }
}