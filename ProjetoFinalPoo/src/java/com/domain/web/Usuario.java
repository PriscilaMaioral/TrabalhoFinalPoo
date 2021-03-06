package com.domain.web;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario {
    private int cd_usuario;
    private String nm_usuario;
    private String nm_login;
    private Date dt_nascimento;
    private String passwordHash;
    
    public static ArrayList<Usuario> listarTodosUsuario() throws SQLException{
        String SQL ="SELECT * FROM usuario";
        PreparedStatement s = Conexao.conectar().prepareStatement(SQL);
        /*s.setString(1, login);
        s.setString(2, password.hashCode()+"");*/
        ArrayList<Usuario> lista = new ArrayList<>();
        ResultSet rs = s.executeQuery();
        Usuario u = null;
        if(rs.next()){
            u = new Usuario(rs.getInt("cd_usuario")
                    , rs.getString("nm_usuario")
                    , rs.getString("nm_login")
                    , rs.getDate("dt_nascimento")
                    , rs.getString("pass_hash"));
            lista.add(u);
                   
        }
        rs.close();
        s.close();
        return lista;
    }
    
    public static void setUsuario(String nome, String login, Date nascimento, String senha ) throws SQLException{
       String SQL = "insert into users (nm_usuario, nm_login, dt_nascimento, pass_hash) values ('"+nome+"','"+login+"', "+nascimento+",'"+senha+"')";
       PreparedStatement s = Conexao.conectar().prepareStatement(SQL);
       s.executeQuery();
       s.close();
    }

    public Usuario(int cd_usuario, String nm_usuario, String nm_login, Date dt_nascimento, String string2) {
        this.cd_usuario = cd_usuario;
        this.nm_usuario = nm_usuario;
        this.nm_login = nm_login;
        this.dt_nascimento = dt_nascimento;
    }
    

    public int getCd_usuario() {
        return cd_usuario;
    }

    public void setCd_usuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getNm_login() {
        return nm_login;
    }

    public void setNm_login(String nm_login) {
        this.nm_login = nm_login;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
