/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import java.io.Serializable;

/**
 *
 * @author professor
 */
public class Transacao implements Serializable {
    //Versão da Classe, deve ser alterada a cada modificação.
    private static final long serialVersionUID=1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    private String operacao;
    private double valor;
    private String CodigoFiscal;
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * @return the operacao
     */
    public String getOperacao() {
        return operacao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
    
    /**
     * @return the CodigoFiscal
     */
    public String getCodigoFiscal() {
        return CodigoFiscal;
    }   
    
    /**
     * @param operacao the operacao to set
     */
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param CodigoFiscal the CodigoFiscal to set
     */
    public void setCodigoFiscal(String CodigoFiscal) {
        this.CodigoFiscal = CodigoFiscal;
    }    
    // </editor-fold>
    
}
