/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Banco.Banco;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Associados;
import pojo.Caixa;
import pojo.Carne;
import pojo.PJuridica;
import pojo.Transacao;

/**
 *
 * @author frank
 */
public class TelaRelatorioCaixa extends javax.swing.JFrame {
    private ArrayList<Associados> FicharioAssociado = new ArrayList<>();
    private ArrayList<PJuridica> FicharioPJuridica = new ArrayList<>();
    private ArrayList<Carne> FicharioCarne = new ArrayList<>();
    private ArrayList<Caixa> FicharioCaixa = new ArrayList<>();
    private ArrayList<Transacao> transacoes = new ArrayList<>();
    private Associados associado = new Associados();
    private PJuridica pjuridica = new PJuridica();
    private Transacao transacao = new Transacao();
    private DateFormat data = DateFormat.getDateInstance();
    private Caixa caixa = new Caixa();
    private Date data_hj = new Date();
    DefaultTableModel dtm;
    
    private Banco banco = new Banco();
    /**
     * Creates new form TelaRelatorioCaixa
     */
    public TelaRelatorioCaixa() {
        FicharioAssociado = (ArrayList<Associados>) banco.Carregar("associados.db");
        if (FicharioAssociado==null){
            JOptionPane.showMessageDialog(rootPane, "Não tem associados cadastrados!");
            this.dispose();
        }
        FicharioPJuridica = (ArrayList<PJuridica>) banco.Carregar("pjuridica.db");
        if (FicharioPJuridica==null){
            JOptionPane.showMessageDialog(rootPane, "Não tem Pessoas Juridicas cadastradas!");
            this.dispose();
        }        
        FicharioCarne = (ArrayList<Carne>) banco.Carregar("carnes.db");
        if (FicharioCarne==null){
            JOptionPane.showMessageDialog(rootPane, "Não tem carnes registrados!");
            this.dispose();
        }
        FicharioCaixa = (ArrayList<Caixa>) banco.Carregar("caixa.db");
        if (FicharioCaixa==null){
            JOptionPane.showMessageDialog(rootPane, "Não há caixas registrados!");
            this.dispose();
        }
        
        //Centraliza a janela
        setLocationRelativeTo(getParent());        
        initComponents();
        dtm = (DefaultTableModel) Tabela.getModel();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelData = new com.toedter.calendar.JDateChooser();
        gerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        gerar.setText("Gerar");
        gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Codigo Fiscal", "Pessoa", "Valor"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(SelData, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gerar)
                    .addComponent(SelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarActionPerformed
        // TODO add your handling code here:
        boolean encontrou = false;//pra indicar se achou ou não 
        int total = FicharioCaixa.size();//pra contar as fichas
        JOptionPane.showMessageDialog(rootPane, total);
      
        int TotalPJ = FicharioPJuridica.size();
        int TotalAssociado = FicharioAssociado.size();
        for (int x=0; x<total;x++){
            caixa = FicharioCaixa.get(x);
            JOptionPane.showMessageDialog(rootPane, caixa.getData());
            JOptionPane.showMessageDialog(rootPane, SelData.getDate());
            
            if (data.format(caixa.getData()).equals(data.format(SelData.getDate()))){
                encontrou = true;
                break;//Para a busca
            }
            
        }
        //Se encontrou o caixa pega as transacoes do dia
        if (encontrou){
            transacoes = caixa.getTransacoes();
            total = transacoes.size();            
            for (int x=0; x<total; x++){
                transacao = transacoes.get(x);
                //verifica se é pagamento e só busca na pessoa juridica
                if(transacao.getTipo_pessoa() == 1){                    
                        pjuridica = FicharioPJuridica.get(transacao.getTipo_pessoa());                       
                        Object linha[] = {data.format(caixa.getData()), transacao.getCodigoFiscal(), pjuridica.getRazaoSocial(), transacao.getValor()};
                        dtm.addRow(linha);                            
                }else{
                    associado = FicharioAssociado.get(transacao.getCod_pessoa());
                    Object linha[] = {data.format(caixa.getData()), transacao.getCodigoFiscal(), associado.getNome(), transacao.getValor()};
                    dtm.addRow(linha);  
                }
            }
        }
    }//GEN-LAST:event_gerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser SelData;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton gerar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
