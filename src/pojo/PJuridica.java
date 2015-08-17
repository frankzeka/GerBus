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
public class PJuridica implements Serializable{
    private static final long serialVersionUID=1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    private int CNPJ;
    private String RazaoSocial;
    private String Endereco;
    private String Cidade;
    private String Bairro;
    private int    Cep;
    private String Telefone;

    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * @return the CNPJ
     */
    public int getCNPJ() {
        return CNPJ;
    }

    /**
     * @return the RazaoSocial
     */
    public String getRazaoSocial() {
        return RazaoSocial;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @return the Cep
     */
    public int getCep() {
        return Cep;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @param RazaoSocial the RazaoSocial to set
     */
    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @param Cep the Cep to set
     */
    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
   // </editor-fold>
    
}
