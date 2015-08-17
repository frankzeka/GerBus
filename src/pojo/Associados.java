/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;


import java.util.Date;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author professor
 */
public class Associados implements Serializable {
    //Versão da Classe, deve ser alterada a cada modificação.
    private static final long serialVersionUID=1L;
    private String Nome;
    private Date   data_nascimento; 
    private String Endereco;
    private String Cidade;
    private String Bairro;
    private int    Cep;
    private String Telefone;
    private int    RG;
    private int    CPF;
    private String Email;
    private boolean ativo;
    
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
     public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public Date getData_nascimento() {
        return data_nascimento;
    }

    public int getRG() {
        return RG;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public int getCep() {
        return Cep;
    }

    public String getTelefone() {
        return Telefone;
    }
    public String getEmail() {
        return Email;
    }

    public boolean isAtivo() {
        return ativo;
    }
    // </editor-fold>
    
     // <editor-fold defaultstate="collapsed" desc="Setters">    

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;        
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setNome(String Nome) {
        String oldNome = this.Nome;
        this.Nome = Nome;
        changeSupport.firePropertyChange("Nome", oldNome, Nome);
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAtivo(boolean ativo) {
        boolean oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("ativo", oldAtivo,ativo);
    }
    // </editor-fold>
    
}
