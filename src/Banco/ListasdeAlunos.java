/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import pojo.Aluno;

/**
 *
 * @author professor
 */
public class ListasdeAlunos implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList <Aluno> ListaAlunos = new ArrayList <Aluno>();
    
    public void adcionar(Aluno aluno){
        getListaAlunos().add(aluno);
    }

    public void remover(Aluno aluno){
        getListaAlunos().remove(aluno);
    }
    
    public Aluno get(int i){
        return ListaAlunos.get(i);
    }
    
    public int size(){
        return ListaAlunos.size();
    }
    
    public List<Aluno> getALL(){
        return ListaAlunos;
    }
    /**
     * @return the ListaAlunos
     */
    public ArrayList <Aluno> getListaAlunos() {
        return ListaAlunos;
    }

    /**
     * @param ListaAlunos the ListaAlunos to set
     */
    public void setListaAlunos(ArrayList <Aluno> ListaAlunos) {
        this.ListaAlunos = ListaAlunos;
    }

    
}
