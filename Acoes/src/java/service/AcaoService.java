/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import model.Acao;

/**
 *
 * @author Alexandre.Torres
 */
public class AcaoService {
    
    public static HashMap<String, Acao> getAcoes(){
        
        HashMap<String, Acao> acoes = new HashMap<>();               
        
        acoes.put( "PETR4", new Acao("PETR4", 14.60, 16.02, 15.03, 15.91));
        acoes.put( "BOLO3", new Acao("BOLO3", 1.60, 1.3, 2.03, 1.91));
        acoes.put( "CACO5", new Acao("CACO5", 23.5, 25.62, 19.30, 20.33));
        acoes.put( "PATO4", new Acao("PATO4", 23.5, 25.62, 19.30, 20.33));
        
        return acoes;
    }
    
}
