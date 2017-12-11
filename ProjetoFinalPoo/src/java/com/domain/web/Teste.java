/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.web;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LuizV1
 */
public class Teste {
    public static void main(String[] args) throws SQLException {
        
        ArrayList<Atores> lista;

        lista = Atores.getTodosAutores();
        
        
        
        for(Atores a : lista){
            System.out.println(a.getNm_ator());
        }
        
        Atores.setCadastroAtores();
    }
    
}
