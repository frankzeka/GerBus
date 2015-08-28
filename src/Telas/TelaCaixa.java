/*
 * To change this template, choose Tools | Templates
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
public class TelaCaixa extends javax.swing.JFrame {
    private ArrayList<Associados> FicharioAssociado = new ArrayList<>();
    private ArrayList<PJuridica> FicharioPJuridica = new ArrayList<>();
    private ArrayList<Carne> FicharioCarne = new ArrayList<>();
    private ArrayList<Caixa> FicharioCaixa = new ArrayList<>();
    private ArrayList<Transacao> transacoes = new ArrayList<>();
    private DateFormat data = DateFormat.getDateInstance();
    private Caixa caixa = new Caixa();
    private Date data_hj = new Date();
    DefaultTableModel dtm;
    
    private Banco banco = new Banco();

    /**
     * Creates new form TelaCaixa
     */
    public TelaCaixa() {
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
            FicharioCarne= new ArrayList<Carne>();
        }
        FicharioCaixa = (ArrayList<Caixa>) banco.Carregar("caixa.db");
        if (FicharioCaixa==null){
            FicharioCaixa= new ArrayList<Caixa>();
        }

        initComponents();
        dtm = (DefaultTableModel) TabelaCaixa.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Data = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCaixa = new javax.swing.JTable();
        Pagamentos = new javax.swing.JButton();
        FecharCaixa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Recebimentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Data.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Data.setText("Caixa");

        TabelaCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pessoa", "Código Fiscal", "Valor"
            }
        ));
        jScrollPane1.setViewportView(TabelaCaixa);

        Pagamentos.setText("Novo Pagamento");
        Pagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentosActionPerformed(evt);
            }
        });

        FecharCaixa.setText("Fechar Caixa");
        FecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharCaixaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Recebimentos:"));

        Recebimentos.setText(" Associado");
        Recebimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebimentosActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(Recebimentos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(Recebimentos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(Data))
                    .add(layout.createSequentialGroup()
                        .add(132, 132, 132)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(0, 52, Short.MAX_VALUE)
                                .add(Pagamentos)
                                .add(113, 113, 113)
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(260, 260, 260)
                        .add(FecharCaixa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(Data)
                        .add(18, 18, 18)
                        .add(Pagamentos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 222, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 51, Short.MAX_VALUE)
                .add(FecharCaixa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Data.setText("Caixa "+data.format(data_hj));
    }//GEN-LAST:event_formWindowOpened

    private void PagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentosActionPerformed
        // TODO add your handling code here:
        TelaPagamentos tela = new TelaPagamentos(new javax.swing.JFrame(), true, FicharioPJuridica);
        tela.setVisible(true);
        Transacao retorno = new Transacao();
        PJuridica retornoPJ = new PJuridica();
        retornoPJ = tela.retornaPJ();
        retorno = tela.retorna(); 
        transacoes.add(retorno);
        Object linha[] = {retornoPJ.getRazaoSocial(), retorno.getCodigoFiscal(), retorno.getValor()};
        dtm.addRow(linha);
        tela=null;
    }//GEN-LAST:event_PagamentosActionPerformed

    private void RecebimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebimentosActionPerformed
        // TODO add your handling code here:
        TelaRecebimentos tela = new TelaRecebimentos(this, true, FicharioAssociado, FicharioCarne);
        tela.setVisible(true);
        Transacao retorno = new Transacao();
        Associados retornoAssociado = new Associados();
        retorno = tela.retorna();
        retornoAssociado = tela.retornaAssociado();
        transacoes.add(retorno);
        Object linha[] = {retornoAssociado.getNome(), retorno.getCodigoFiscal(), retorno.getValor()};
        dtm.addRow(linha);        
        tela=null;
    }//GEN-LAST:event_RecebimentosActionPerformed

    private void FecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharCaixaActionPerformed
        // TODO add your handling code here:
        caixa.setData(data_hj);
        caixa.setTransacoes(transacoes);
        FicharioCaixa.add(caixa);
        banco.Salva(FicharioCaixa, "caixa.db");
        this.dispose();       
    }//GEN-LAST:event_FecharCaixaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCaixa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JButton FecharCaixa;
    private javax.swing.JButton Pagamentos;
    private javax.swing.JButton Recebimentos;
    private javax.swing.JTable TabelaCaixa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
