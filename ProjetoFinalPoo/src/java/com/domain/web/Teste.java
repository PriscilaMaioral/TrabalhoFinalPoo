/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.web;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author LuizV1
 */
public class Teste {
    public static void main(String[] args) throws SQLException {
        /*
        ArrayList<Atores> lista;
        
        lista = Atores.buscaAtor("", "brhue");
        
        
        
        for(Atores a : lista){
            System.out.println(a.getNm_ator());
        }*/
        
        ArrayList<Filmes> lista;
        lista = Filmes.listarTodosFilmes();
        
        for (Filmes f: lista) {
            System.out.println(f.getNm_filme());
            System.out.println(f.getDs_genero());
            System.out.println(f.getDt_lancamento());
            System.out.println(f.getQt_duracao());
            System.out.println(f.getNm_diretor());
            System.out.println(f.getNr_avaliacao());
            
            
        }
        
        System.out.println(Atores.buscaTESTE(1));
        
        //Atores.setCadastroAtores();
        
        /*
        
        Date data = new Date(2010,0,25);
        
        Filmes f = new Filmes(0, "Batman", data, 300, "Ação", "Nolan");
        
        f.cadastrarFilmes(f.getNm_filme(), f.getDt_lancamento(), f.getQt_duracao(), f.getDs_genero(), f.getNm_diretor());
        
        */
        /*
        Filmes f = new Filmes();
        f.removerFilme(1);
        */
        /*
        Atores a = new Atores();
        
        Atores.alterarAtor(1, "Luizão", data, "BRAZILSÃO");
        
        */
    }
    
}
