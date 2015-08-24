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
 * @author aluno3
 */
public class Carne implements Serializable {
    //Versão da Classe, deve ser alterada a cada modificação.
    private static final long serialVersionUID=1L; 
    private int Ano_Referencia;
    private String cpf;
    private Date inicio;
    private int N_parcelas;
    //Grava as parcelas no carne (Código da parcela)
    private ArrayList<Mensalidades> Parcelas = new ArrayList<>();

    // <editor-fold defaultstate="collapsed" desc="Getters">
        /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    /**
     * @return the Ano_Referencia
     */
    public int getAno_Referencia() {
        return Ano_Referencia;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the inicio
     */
    public Date getInicio() {
        return inicio;
    }

    /**
     * @return the N_parcelas
     */
    public int getN_parcelas() {
        return N_parcelas;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * @param Ano_Referencia the Ano_Referencia to set
     */
    public void setAno_Referencia(int Ano_Referencia) {
        this.Ano_Referencia = Ano_Referencia;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    /**
     * @param N_parcelas the N_parcelas to set
     */
    public void setN_parcelas(int N_parcelas) {
        this.N_parcelas = N_parcelas;
    }
    // </editor-fold>

    /**
     * @return the Mensalidades
     */
    public ArrayList<Mensalidades> getParcelas() {
        return Parcelas;
    }

    /**
     * @param Parcelas the Mensalidades to set
     */
    public void setParcelas(ArrayList<Mensalidades> Parcelas) {
        this.Parcelas = Parcelas;
    }
    
}
