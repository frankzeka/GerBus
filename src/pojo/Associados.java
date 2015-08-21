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
    private String Cep;
    private String Telefone;
    private String RG;
    private String CPF;
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

    public String getRG() {
        return RG;
    }

    public String getCPF() {
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

    public String getCep() {
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
        Date DtNascVelho = this.data_nascimento;
        this.data_nascimento = data_nascimento;
        changeSupport.firePropertyChange("DtNasc", DtNascVelho, data_nascimento);        
    }

    public void setRG(String RG) {
        String RGVelho = this.RG;
        this.RG = RG;
        changeSupport.firePropertyChange("RG", RGVelho, RG);
    }

    public void setCPF(String CPF) {
        String CPFVelho = this.CPF;
        this.CPF = CPF;
        changeSupport.firePropertyChange("CPF", CPFVelho, CPF);
    }

    public void setNome(String Nome) {
        String oldNome = this.Nome;
        this.Nome = Nome;
        changeSupport.firePropertyChange("Nome", oldNome, Nome);
    }

    public void setEndereco(String Endereco) {
        String EnderecoVelho = this.Endereco;
        this.Endereco = Endereco;
        changeSupport.firePropertyChange("Endereco", EnderecoVelho, Endereco);
    }

    public void setCidade(String Cidade) {
        String CidadeVelha = this.Cidade;
        this.Cidade = Cidade;
        changeSupport.firePropertyChange("Cidade", CidadeVelha, Cidade);
    }

    public void setBairro(String Bairro) {
        String BairroVelho = this.Bairro;
        this.Bairro = Bairro;
        changeSupport.firePropertyChange("Bairro", BairroVelho, RG);
    }

    public void setCep(String Cep) {
        String CEPVelho = this.Cep;
        this.Cep = Cep;
        changeSupport.firePropertyChange("CEP", CEPVelho, Cep);
    }

    public void setTelefone(String Telefone) {
        String TelefoneVelho = this.Telefone;
        this.Telefone = Telefone;
        changeSupport.firePropertyChange("Telefone", TelefoneVelho, Telefone);
    }

    public void setEmail(String Email) {
        String EmailVelho = this.Email;
        this.Email = Email;
        changeSupport.firePropertyChange("Email", EmailVelho, Email);
    }

    public void setAtivo(boolean ativo) {
        boolean oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("Ativo", oldAtivo,ativo);
    }
    // </editor-fold>
    
    public static Associados Limpa(){
        Associados novo = new Associados();
        novo.setNome("");
        novo.setAtivo(true);
        novo.setBairro("");
        novo.setCPF("");
        novo.setCep("");
        novo.setCidade("");
        novo.setData_nascimento(null);
        novo.setEmail(null);
        novo.setEndereco(null);
        novo.setRG("");
        novo.setTelefone(null);
        return novo;
    }
    
}
