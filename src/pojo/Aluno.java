/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;


import java.util.Date;

/**
 *
 * @author professor
 */
public class Aluno extends Pessoa {
    //Versão da Classe, deve ser alterada a cada modificação.
    private static final long serialVersionUID=1L;
    private String estado_civil;
    private Date   data_nascimento;
    private int    RG;
    private int    CPF; 
    private String Nome;
    private String Endereco;
    private String Cidade;
    private String Bairro;
    private int    Cep;
    private String Telefone;
    private String Celular;
    private String Email;
    private boolean ativo;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
   

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the data_nascimento
     */
    public Date getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the RG
     */
    public int getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(int RG) {
        this.RG = RG;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
}
