package com.domain.web;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DatabaseCreatorListener implements ServletContextListener {
    private void createAtoresTable(Statement s){
        try{
            s.execute(  "CREATE TABLE atores(\n" +
                        "    cd_ator INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 1, INCREMENT BY 1)\n" +
                        "    , nm_ator varchar(200) not null\n" +
                        "    , dt_nascimento date\n" +
                        "    , ds_nacionalidade varchar (200)\n" +
                        ")");
            System.out.println("Criada tabela Ator.");
        }catch(Exception ex2){
            System.out.println("Ero ao criar a Ator: "+ex2.getMessage());
        }
    }
    
    
    
    private void createUsuarioTable(Statement s){
        try{
            s.execute(  "CREATE TABLE usuario(\n" +
                        "    cd_usuario INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 1, INCREMENT BY 1)\n" +
                        "    , nm_usuario varchar(200) not null\n" +
                        "    , dt_nascimento date\n" +
                        "    , nm_login varchar(50)  not null\n" +
                        "    , pass_hash varchar(200) not null\n" +
                        ")");
            System.out.println("Criada tabela users.");
            s.execute("INSERT INTO users VALUES("
                + "default"
                + ", 'Administrador do Sistema'"
                + ", 'admin'"
                + ", '"+"1234".hashCode()+"'"
                + ")");
            System.out.println("Usuário admin criado com a senha '1234'.");
        }catch(Exception ex2){
            System.out.println("Erro ao criar a tabela usuarios: "+ex2.getMessage());
        }
    }
    private void createFilmesTable(Statement s){
        try{
            s.execute(  "CREATE TABLE filmes(\n" +
                        "    cd_filme  INTEGER NOT NULL GENERATED ALWAYS \n" +
                        "        AS IDENTITY (START WITH 1, INCREMENT BY 1)\n" +
                        "    , nm_filme varchar(200) not null\n" +
                        "    , ds_genero varchar(50) not null\n" +
                        "    , qt_duracao INTEGER (5) not null\n" +
                        "    , nm_diretor varchar(200) not null\n" +
                        "    , dt_lancamento date\n" +
                        "    , cd_elenco INTEGER(10)\n" +
                        ")");
            System.out.println("Criada tabela filmes.");
        }catch(Exception ex2){
            System.out.println("Erro ao criar a tabela filmes: "+ex2.getMessage());
        }
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String url = "jdbc:derby:c:/derby/WebParkingDb;create=true";
            Connection c =DriverManager.getConnection(url);
            Statement s = c.createStatement();
            System.out.println(new Date());
            System.out.println("Iniciando a criação do BD.");
            createAtoresTable(s);
            createUsuarioTable(s);
            createFilmesTable(s);
            s.close();
            c.close();
            DriverManager.getConnection
            ("jdbc:derby:c:/derby/WebParkingDb;shutdown=true");
        }catch(Exception ex){
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}