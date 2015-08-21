/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
public class Mensalidades implements Serializable{
    private static final long serialVersionUID=1L;
    private Date Data_Pagamento;
    private double valor;
    
    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @return the Data_Pagamento
     */
    public Date getData_Pagamento() {
        return Data_Pagamento;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param Data_Pagamento the Data_Pagamento to set
     */
    public void setData_Pagamento(Date Data_Pagamento) {
        this.Data_Pagamento = Data_Pagamento;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
