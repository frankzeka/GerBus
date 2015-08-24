/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

import Banco.Banco;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Associados;
import pojo.Carne;
import pojo.Mensalidades;
import pojo.PJuridica;
import pojo.Transacao;

/**
 *
 * @author professor
 */
public class TelaRecebimentos extends javax.swing.JDialog{
    private ArrayList<Associados> FicharioAssociado = new ArrayList<>();
    private Associados FichaAssociado = new Associados();
    private ArrayList<PJuridica> FicharioPJuridica = new ArrayList<>();
    private PJuridica FichaPJuridica = new PJuridica();
    private ArrayList<Carne> FicharioCarnes = new ArrayList<>();
    private Carne carne = new Carne();
    private Transacao transacao = new Transacao();
    private Mensalidades mensalidade = new Mensalidades();
    private ArrayList<Mensalidades> Parcelas;
    private int encontrado =-1;
    private int pessoa;

    
    private Banco banco = new Banco();

    /**
     * Creates new form TelaRecebimentos
     */
    public TelaRecebimentos(java.awt.Frame parent, boolean modal, ArrayList FicharioAssociado, ArrayList FicharioPJuridica, ArrayList FicharioCarnes) {
       //Passa a janela pai
        super(parent,modal);
        //Centraliza a janela
        setLocationRelativeTo(null);
        //Carrega os dados na memória
        this.FicharioAssociado = FicharioAssociado;
        this.FicharioPJuridica = FicharioPJuridica;
        this.FicharioCarnes = FicharioCarnes;
  
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoPessoa = new javax.swing.JComboBox();
        Pessoa = new javax.swing.JTextField();
        Busca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Física", "Jurídica" }));
        TipoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Pessoa"));

        Pessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        Busca.setText("Busca");
        Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Data", "Valor"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pessoa)
                                .addGap(18, 18, 18)
                                .addComponent(Busca, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaActionPerformed
        // TODO add your handling code here:        
        if (TipoPessoa.getSelectedIndex() == 0 ){
            TelaPesquisa tela = new TelaPesquisa(new javax.swing.JFrame(), true, FicharioAssociado);
            tela.setVisible(true);
            encontrado=tela.retorna(); //pega o associado encontrado
            if (encontrado != -1){
                FichaAssociado = FicharioAssociado.get(encontrado);
                Pessoa.setText(FichaAssociado.getNome());
                transacao.setCodigoFiscal(FichaAssociado.getCPF()); 
                carne = BuscaCarne(FicharioCarnes,FichaAssociado.getCPF() );
                CarregaParcelas(carne);
                pessoa=1;
            }
            
        }else{
            TelaPesquisa tela = new TelaPesquisa(new javax.swing.JFrame(), true, FicharioPJuridica);
            tela.setVisible(true);
            encontrado=tela.retorna();
            if (encontrado != -1){
                FichaPJuridica = FicharioPJuridica.get(encontrado);
                Pessoa.setText(FichaPJuridica.getRazaoSocial());
                transacao.setCodigoFiscal(FichaPJuridica.getCNPJ());
                pessoa=2;
            }
            
        }        
    }//GEN-LAST:event_BuscaActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        // TODO add your handling code here:
        transacao.setOperacao("C");
        if (pessoa==1){
            mensalidade = Parcelas.get(Tabela.getSelectedRow());            
            transacao.setValor(mensalidade.getValor());
        }else{
            
            
        }   
    }//GEN-LAST:event_FinalizarActionPerformed

   public Transacao retorna(){
        return transacao;        
    }
   
   public Carne BuscaCarne(ArrayList<Carne> FicharioCarne, String CPF){
        boolean encontrou = false;//pra indicar se achou ou não
        int total = FicharioCarne.size();//pra contar as fichas
        for (int x=0; x<total;x++){ //for
            carne =  FicharioCarne.get(x);
            if(carne.getCpf().matches(CPF)){
                return carne;
            }else{
                carne=null;
            }
        }
        return carne;
   }
   
   public void CarregaParcelas(Carne carne){
       Parcelas = carne.getParcelas();
       int total = Parcelas.size();//pra contar as fichas
       DefaultTableModel dtm = (DefaultTableModel) Tabela.getModel();
       for (int x=0; x<total;x++){ //for
           mensalidade = Parcelas.get(x);
           Object linha [] = {"Mensalidade",mensalidade.getData_Pagamento(),mensalidade.getValor()};
           dtm.addRow(linha); 
       }
   }
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
            java.util.logging.Logger.getLogger(TelaRecebimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRecebimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busca;
    private javax.swing.JButton Finalizar;
    private javax.swing.JTextField Pessoa;
    private javax.swing.JTable Tabela;
    private javax.swing.JComboBox TipoPessoa;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}