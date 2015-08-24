/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author professor
 */
public class Caixa implements Serializable {
    //Versão da Classe, deve ser alterada a cada modificação.
    private static final long serialVersionUID=1L;

    private int codigo;
    private Date Data;
    private ArrayList<Transacao> transacoes;
        

    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    
    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    /**
     * @return the Data
     */
    public Date getData() {
        return Data;
    }

    /**
     * @return the transacoes
     */
    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">     
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Date Data) {
        this.Data = Data;
    }

    /**
     * @param transacoes the transacoes to set
     */
    public void setTransacoes(ArrayList<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    // </editor-fold>
    
}
