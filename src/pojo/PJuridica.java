/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author professor
 */
public class PJuridica implements Serializable{
    private static final long serialVersionUID=1L;
    private String CNPJ;
    private String RazaoSocial;
    private String Endereco;
    private String Cidade;
    private String Bairro;
    private String  Cep;
    private String Telefone;
    
    // <editor-fold defaultstate="collapsed" desc="Escuta mudancas">
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * @return the CNPJ
     */
      public static long getSerialVersionUID() {
        return serialVersionUID;
    }
      
    public String getCNPJ() {
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
    public String getCep() {
        return Cep;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }
    
    /**
     * @return the serialVersionUID
     */
  
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        String CNPJVelho = this.CNPJ;
        this.CNPJ = CNPJ;
        changeSupport.firePropertyChange("CNPJ", CNPJVelho, CNPJ);
    }

    /**
     * @param RazaoSocial the RazaoSocial to set
     */
    public void setRazaoSocial(String RazaoSocial) {
        String RazaoSocialVelho = this.RazaoSocial;
        this.RazaoSocial = RazaoSocial;
        changeSupport.firePropertyChange("RazaoSocial", RazaoSocialVelho, RazaoSocial);
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        String EnderecoVelho = this.Endereco;
        this.Endereco = Endereco;
        changeSupport.firePropertyChange("Endereco", EnderecoVelho, Endereco);
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
       String CidadeVelho = this.Cidade;
        this.Cidade = Cidade;
        changeSupport.firePropertyChange("Cidade", CidadeVelho, Cidade);
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        String BairroVelho = this.Bairro;
        this.Bairro = Bairro;
        changeSupport.firePropertyChange("Bairro", BairroVelho, Bairro);
    }

    /**
     * @param Cep the Cep to set
     */
    public void setCep(String Cep) {
        String CepVelho = this.Cep;
        this.Cep = Cep;
        changeSupport.firePropertyChange("Cep", CepVelho, Cep);
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        String TelefoneVelho = this.Telefone;
        this.Telefone = Telefone;
        changeSupport.firePropertyChange("Telefone", TelefoneVelho, Telefone);
    }
   // </editor-fold>
    
    public static PJuridica Limpa(){
        PJuridica novo = new PJuridica();
        novo.setCNPJ("");
        novo.setRazaoSocial("");
        novo.setBairro("");
        novo.setCep("");
        novo.setCidade("");
        novo.setEndereco(null);
        novo.setTelefone(null);
        return novo;
    }
}
