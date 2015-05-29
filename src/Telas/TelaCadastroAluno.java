/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import componentes.MeuCampoCheckBox;
import componentes.MeuCampoComboBox;
import componentes.MeuCampoData;
import componentes.MeuCampoInteiro;
import componentes.MeuCampoTexto;
import componentes.MeuJButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import pojo.Aluno;

/**
 *
 * @author frank
 */
public class TelaCadastroAluno extends TelaCadastro {
    public static TelaCadastroAluno tela;
    public Aluno aluno = new Aluno();
    public String [] [] situacao = new String[] [] { {"Solteiro","Solteiro"},{"Casado","Casado"}} ;
    //public EstadoDao estadoDao = new EstadoDao(estado);
    public MeuCampoInteiro campoCodigo = new MeuCampoInteiro(5, false, false, true, "Código");
    public MeuCampoTexto campoNome = new MeuCampoTexto(30, true, true, "Nome");
    public MeuCampoTexto campoEndereco = new MeuCampoTexto(30, true, true, "Endereco");
    public MeuCampoTexto campoCidade = new MeuCampoTexto(30, true, true, "Cidade");
    public MeuCampoTexto campoBairro = new MeuCampoTexto(20, true, true, "Bairro");
    public MeuCampoTexto campoCEP = new MeuCampoTexto(8, true, true, "CEP");
    public MeuCampoTexto campoRG = new MeuCampoTexto(10, true, true, "RG");
    public MeuCampoTexto campoCPF = new MeuCampoTexto(10, true, true, "CPF");
    public MeuCampoTexto campoTelefone  = new MeuCampoTexto(10,true,true, "Telefone");
    public MeuCampoTexto campoCelular  = new MeuCampoTexto(10,true,true, "Celular");
    public MeuCampoTexto campoEmail  = new MeuCampoTexto(30,true,true, "e-mail");
    public MeuJButton jbPesquisaCEP = new MeuJButton("Pesquisa CEP");
    public MeuCampoCheckBox campoAtivo = new MeuCampoCheckBox("Ativo");
    public MeuCampoData campoData = new MeuCampoData(6, false, "Data de nascimento", false);
    public MeuCampoComboBox EstadoCivil = new MeuCampoComboBox(situacao, true, true,"Estado Civil");
        public static TelaCadastro getTela() {  //Estático para poder ser chamado de outras classes sem a necessidade de ter criado um objeto anteriormente.
        if (tela == null) {   //Tela não está aberta, pode criar uma nova tela
            tela = new TelaCadastroAluno();
            tela.addInternalFrameListener(new InternalFrameAdapter() { //Adiciona um listener para verificar quando a tela for fechada, fazendo assim a remoção da mesma junto ao JDesktopPane da TelaSistema e setando a variável tela = null para permitir que a tela possa ser aberta novamente em outro momento. Basicamente o mesmo controle efetuado pela tela de pesquisa, porém de uma forma um pouco diferente.
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    TelaSistema.jdp.remove(tela);
                    tela = null;
                }
            });            TelaSistema.jdp.add(tela);
        }
        //Depois do teste acima, independentemente dela já existir ou não, ela é selecionada e movida para frente
        TelaSistema.jdp.setSelectedFrame(tela);
        TelaSistema.jdp.moveToFront(tela);
        return tela;
    }
    
    public TelaCadastroAluno() {
        super("Cadastro de Alunos");
        adicionaCampo(1, 1, 1, 1, campoCodigo, ESQUERDA);
        adicionaCampo(2, 1, 1, 2, campoNome, ESQUERDA);
        adicionaCampo(2, 4, 1, 1, campoData, ESQUERDA);
        adicionaCampo(3, 1, 1, 2, campoEndereco, ESQUERDA);
        adicionaCampo(3, 4, 1, 2, campoBairro, ESQUERDA);
        adicionaCampo(4, 1, 1, 2, campoCidade, ESQUERDA);
        adicionaCampo(4, 4, 1, 2, campoCEP, ESQUERDA);
        adicionaCampo(4, 6, 1, 2, EstadoCivil, ESQUERDA);
        adicionaCampo(5, 1, 1, 2, campoRG, ESQUERDA);
        adicionaCampo(5, 4, 1, 2, campoCPF, ESQUERDA);
        adicionaCampo(6, 1, 1, 2, campoTelefone, ESQUERDA);
        adicionaCampo(6, 4, 1, 2, campoCelular, ESQUERDA);
        adicionaCampo(7, 1, 1, 2, campoEmail, ESQUERDA);
        adicionaCampo(7, 4, 1, 1, campoAtivo, ESQUERDA);
        insereBotao(jbPesquisaCEP);
        
        pack();
        habilitarCampos(false);
    }
}
