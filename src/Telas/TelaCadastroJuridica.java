/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import static Telas.TelaCadastroAluno.tela;
import componentes.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author Frank
 */
public class TelaCadastroJuridica extends TelaCadastro{
    public static TelaCadastroJuridica tela;
    public MeuCampoTexto campoNF = new MeuCampoTexto(30, true, true, "Nome Fantasia");
    public MeuCampoTexto campoRS = new MeuCampoTexto(30, true, true, "Razão Social");
    public MeuCampoFormatado campoCNPJ = new MeuCampoFormatado(14, true, "CNPJ", true);
    
    public TelaCadastroJuridica(){
        super("Cadastro de Pessoa Juridica");
        adicionaCampo(1, 1, 1, 2, campoNF, ESQUERDA);
        adicionaCampo(2, 1, 1, 2, campoRS, ESQUERDA);
        adicionaCampo(3, 1, 1, 2, campoCNPJ, ESQUERDA);
        
        pack();
        habilitarCampos(false);
    }
    
    public static TelaCadastro getTela() {  //Estático para poder ser chamado de outras classes sem a necessidade de ter criado um objeto anteriormente.
        if (tela == null) {   //Tela não está aberta, pode criar uma nova tela
            tela = new TelaCadastroJuridica();
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
    
}
