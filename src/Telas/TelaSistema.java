/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class TelaSistema extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaSistema() {
        initComponents();
        
       this.setExtendedState(MAXIMIZED_BOTH);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelprincipal = new javax.swing.JPanel();
        cadastro = new javax.swing.JButton();
        Venda = new javax.swing.JButton();
        relatorios = new javax.swing.JButton();
        painelcadastro = new javax.swing.JPanel();
        CadastroAssociado = new javax.swing.JButton();
        CadastroFuncionario = new javax.swing.JButton();
        painelrelatorio = new javax.swing.JPanel();
        relatorioestoque = new javax.swing.JButton();
        relatorioclientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelprincipal.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        painelprincipal.setLayout(new java.awt.GridLayout(4, 0));

        cadastro.setText("cadastros");
        cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroMouseClicked(evt);
            }
        });
        painelprincipal.add(cadastro);

        Venda.setText("Movimentação");
        Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendaMouseClicked(evt);
            }
        });
        painelprincipal.add(Venda);

        relatorios.setText("relatorios");
        relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatoriosMouseClicked(evt);
            }
        });
        relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosActionPerformed(evt);
            }
        });
        painelprincipal.add(relatorios);

        painelcadastro.setBorder(new javax.swing.border.MatteBorder(null));
        painelcadastro.setLayout(new java.awt.GridLayout(4, 0));

        CadastroAssociado.setText("Cadastro Associado");
        CadastroAssociado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroAssociadoMouseClicked(evt);
            }
        });
        painelcadastro.add(CadastroAssociado);

        CadastroFuncionario.setText("Cadastro Pessoa Juridica");
        CadastroFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroFuncionarioMouseClicked(evt);
            }
        });
        painelcadastro.add(CadastroFuncionario);

        painelrelatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelrelatorio.setLayout(new java.awt.GridLayout(1, 0));

        relatorioestoque.setText(" relatorio estoque");
        relatorioestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioestoqueActionPerformed(evt);
            }
        });
        painelrelatorio.add(relatorioestoque);

        relatorioclientes.setText("relatorio clientes");
        relatorioclientes.setAlignmentX(0.6F);
        relatorioclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioclientesActionPerformed(evt);
            }
        });
        painelrelatorio.add(relatorioclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelcadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelrelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, Short.MAX_VALUE)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelrelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painelcadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(271, 271, 271))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroAssociadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroAssociadoMouseClicked
        // TODO add your handling code here:
        new TelaCadastroAssociados().setVisible(true);
        
    }//GEN-LAST:event_CadastroAssociadoMouseClicked

    private void CadastroFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroFuncionarioMouseClicked
        // TODO add your handling code here:
       

    }//GEN-LAST:event_CadastroFuncionarioMouseClicked

    private void VendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_VendaMouseClicked

    private void relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosActionPerformed
        // TODO add your handling code here:
        if (painelcadastro.isVisible()){
            painelcadastro.setVisible(false);
        }
    }//GEN-LAST:event_relatoriosActionPerformed

    private void cadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroMouseClicked
        // TODO add your handling code here:
         painelcadastro.setVisible(true);
         if (painelrelatorio.isVisible()){
            painelrelatorio.setVisible(false);
        }
    }//GEN-LAST:event_cadastroMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      painelcadastro.setVisible(false);
     painelrelatorio.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatoriosMouseClicked
        // TODO add your handling code here:
         painelrelatorio.setVisible(true);
    }//GEN-LAST:event_relatoriosMouseClicked

    private void relatorioestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioestoqueActionPerformed

    }//GEN-LAST:event_relatorioestoqueActionPerformed

    private void relatorioclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioclientesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_relatorioclientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>   

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaSistema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroAssociado;
    private javax.swing.JButton CadastroFuncionario;
    private javax.swing.JButton Venda;
    private javax.swing.JButton cadastro;
    private javax.swing.JPanel painelcadastro;
    private javax.swing.JPanel painelprincipal;
    private javax.swing.JPanel painelrelatorio;
    private javax.swing.JButton relatorioclientes;
    private javax.swing.JButton relatorioestoque;
    private javax.swing.JButton relatorios;
    // End of variables declaration//GEN-END:variables
}
