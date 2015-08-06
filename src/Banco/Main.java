/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco;

import java.io.IOException;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;

/**
 *
 * @author professor
 */
public class Main {
    
    
    public static void main(String[] ignored) throws Exception{        
        Prevayler prevayler = PrevaylerFactory.createPrevayler(new ListasdeAlunos(),"Banco");
        salvaBD(prevayler);        
    }
    
    static void salvaBD(Prevayler prevayler) throws Exception {
        iniciaGUI(prevayler);
        
        while (true){
            Thread.sleep(1000 * 20);
            prevayler.takeSnapshot();
            out("Banco Salvo as " + new java.util.Date() + "...");
        }
        
    }
    
    static void iniciaGUI(Prevayler prevayler){
        new Telas.TelaSistema(prevayler);
    }
    
    private static void out(String message) {
        System.out.println(message);
    }   

}        

