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
    private int tipo_pessoa;
    private int Cod_pessoa;
    private String operacao;
    private double valor;
    private String CodigoFiscal;
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * @return the tipo_pessoa
     */
    public int getTipo_pessoa() {
        return tipo_pessoa;
    }

    /**
     * @return the Cod_pessoa
     */
    public int getCod_pessoa() {
        return Cod_pessoa;
    }
    
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
        /**
     * @param tipo_pessoa the tipo_pessoa to set
     */
    public void setTipo_pessoa(int tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

    /**
     * @param Cod_pessoa the Cod_pessoa to set
     */
    public void setCod_pessoa(int Cod_pessoa) {
        this.Cod_pessoa = Cod_pessoa;
    }
    
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
