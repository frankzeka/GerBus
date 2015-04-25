/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author frank
 */
public class Salvar {
    public Salvar(){
        
    }
     public void salva(String caminho, Object objeto) throws Exception {
            //Abre um arquivo para salvar em disco
            FileOutputStream arquivo = new FileOutputStream(caminho);
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
            fluxo.writeObject(objeto);
            fluxo.close();
    }    
}
