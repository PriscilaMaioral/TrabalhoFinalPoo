package com.domain.web;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;


public class Filmes {
    private int cd_filme;
    private String nm_filme;
    private String ds_genero;
    private int qt_duracao;
    private String nm_diretor;
    private Date dt_lancamento;
    private float nr_avaliacao;

    
    
    
    public static ArrayList<Filmes> listarTodosFilmes() throws SQLException{
        String SQL ="SELECT * FROM filme";
        PreparedStatement s;
        s = Conexao.conectar().prepareStatement(SQL);
       
        ArrayList<Filmes> lista = new ArrayList<>();
        
        ResultSet rs = s.executeQuery();
        Filmes u;
        while(rs.next()){
            u = new Filmes (rs.getInt("cd_filme")
                    , rs.getString("nm_filme")
                    , rs.getDate("dt_lancamento")
                    , rs.getInt("qt_duracao")
                    , rs.getString("ds_genero")
                    , rs.getString("nm_diretor"));
            u.setNr_avaliacao(Avaliacao.avaliacaoMediaFilme(rs.getInt("cd_filme")));
            lista.add(u);
        }
       
        
        
        
        
        rs.close();
        s.close();
        return lista;
    }
    
    public static Filmes buscarFilme(String nome, Date lancmin, Date lancmax, int durmin, int durmax, String genero, String diretor) throws SQLException{
        String SQL ="";
        
        
        if (!"".equals(nome) && !"".equals(genero) && !"".equals(diretor)) {
            SQL = "select * from filme where nm_filme = '"+nome+"' AND ds_genero = '"+genero+"' AND nm_diretor = '"+diretor+"'";
        }else if (!"".equals(nome) && !"".equals(genero) && !"".equals(diretor)) {
            SQL = "select * from filme where nm_filme = '"+nome+"' AND ds_genero = '"+genero+"' AND nm_diretor = '"+diretor+"'";
        }else if (!"".equals(nome) && !"".equals(genero)){
            SQL = "select * from filme where nm_filme = '"+nome+"' AND ds_genero = '"+genero+"'";
        }else if (!"".equals(nome)&&!"".equals(diretor)){
            SQL = "select * from filme where nm_filme = '"+nome+"' AND nm_diretor = '"+diretor+"'";
        }else if (!"".equals(genero) && !"".equals(diretor)){
            SQL = "select * from filme where AND ds_genero = '"+genero+"' AND nm_diretor = '"+diretor+"'";
        }else if (!"".equals(nome)){
            SQL = "select * from filme where nm_filme = '"+nome+"'";
        }else if (!"".equals(genero)){
             SQL = "select * from filme where ds_genero = '"+genero+"'";
        }else if (!"".equals(diretor)) {
            SQL = "select * from filme where nm_diretor = '"+diretor+"'";
        }else if (lancmin!=null && lancmax != null){
            SQL = "select * from filme where dt_lancamento >=" + lancmin + " and dt_lancamento <= "+lancmax;
        }else if (durmin > 0 && durmax > 0){
            SQL = "select * from filme where qt_dur >=" + durmin + " and qt_durmax <= "+durmax;
        }
        
        PreparedStatement s;
        s = Conexao.conectar().prepareStatement(SQL);
       
        ArrayList<Filmes> lista = new ArrayList<>();
        
        
        
        ResultSet rs = s.executeQuery();
        Filmes u = null;
        if(rs.next()){
            u = new Filmes (rs.getInt("cd_filme")
                    , rs.getString("nm_filme")
                    , rs.getDate("dt_lancamento")
                    , rs.getInt("qt_duracao")
                    , rs.getString("ds_diretor")
                    , rs.getString("nm_diretor"));
            lista.add(u);
        }
        
       
        rs.close();
        s.close();
        return u;
    }
    
    
    
   public void cadastrarFilmes(String nome, Date lancamento, int duracao, String genero, String diretor) throws SQLException {
       String SQL = "insert into filme (nm_filme, dt_lancamento, qt_duracao, ds_genero, nm_diretor) values (?,?,?,?,?)";
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL);
       s.setString(1, nome);
       s.setDate(2, lancamento);
       s.setInt(3, duracao);
       s.setString(4, genero);
       s.setString(5, diretor);
       s.executeUpdate();
       s.close();
       
   }
   
   public void alterarFilme(int cdFilme, String nome, Date lancamento, int duracao, String genero, String diretor) throws SQLException {
       String SQL = "update filme set nm_filme = ?, dt_lancamento=?, qt_duracao=?, ds_genero=?, nm_diretor=?) where cd_filme = "+cdFilme;
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL);
       s.setString(1, nome);
       s.setDate(2, lancamento);
       s.setInt(3, duracao);
       s.setString(4, genero);
       s.setString(5, diretor);
       s.executeUpdate();
       s.close();
       
   }
   
   public void removerFilme (int cdFilme) throws SQLException {
       String SQL = "delete from filme where cd_filme = ?";
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL);
       s.setInt(1, cdFilme);
       s.executeUpdate();
       s.close();
       
   }

    public Filmes() {
    }

    public Filmes(int cd_filme, String nm_filme, Date dt_lancamento, int qt_duracao, String ds_genero, String nm_diretor) {
        this.cd_filme = cd_filme;
        this.nm_filme = nm_filme;
        this.ds_genero = ds_genero;
        this.qt_duracao = qt_duracao;
        this.nm_diretor = nm_diretor;
        this.dt_lancamento = dt_lancamento;
        
    }
    
    public float getNr_avaliacao() {
        return nr_avaliacao;
    }

    public void setNr_avaliacao(float nr_avaliacao) {
        this.nr_avaliacao = nr_avaliacao;
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

    
}