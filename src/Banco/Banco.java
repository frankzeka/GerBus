/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class Banco {
    
    public Boolean Salva(ArrayList fichario, String caminho){
        try {
            FileOutputStream arquivo = new FileOutputStream(caminho);
            try {
                ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
                fluxo.writeObject(fichario);
                fluxo.close();
                return true;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro de Gravação.");
                return false;
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
            return false;
        }
    }
    
    public Object Carregar (String caminho){      
        
        FileInputStream inFile;
        try {
            //verifica se existe o arquivo 
            inFile = new FileInputStream(caminho);
            try {
                //tenta abrir o arquivo
                ObjectInputStream fluxo = new ObjectInputStream(inFile);
                try {
                    //Carrega o objeto para a memória
                    Object objeto = fluxo.readObject();
                    //fecha o arquivo
                    fluxo.close();
                    //retorna os dados pra tela
                    return objeto;
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao carregar os dados");
                } 
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro de Leitura");
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
        }
       return null;       
    } 
    
}
