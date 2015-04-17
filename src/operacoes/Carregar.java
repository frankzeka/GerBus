/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author frank
 */
public class Carregar {
    public Carregar (){}
        public Object deserializar(String path) throws Exception {
        FileInputStream inFile = new FileInputStream(path);
        ObjectInputStream d = new ObjectInputStream(inFile);
        Object objeto = d.readObject();
        d.close();
        return objeto;
    } 
}
