/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Aluno;

/**
 *
 * @author professor
 */
public class AlunoDao {
    private final Aluno aluno;
    
    public AlunoDao(Aluno aluno){
        this.aluno = aluno;
    }
    public boolean inserir(Aluno aluno) {
        ArrayList<Aluno> fichario = new ArrayList<>();
        fichario.add(aluno);
        try {
            FileOutputStream arquivo = new FileOutputStream("aluno.db");
            ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);            
            fluxo.writeObject(fichario);            
            fluxo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return false;
    }
}
