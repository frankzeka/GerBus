/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import static Telas.TelaCadastroAluno.tela;
import componentes.MeuCampoData;
import componentes.MeuCampoTexto;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author Frank
 */
public class TelaGeraCarne extends TelaCadastro {
    public static TelaGeraCarne tela;
    public MeuCampoTexto campoNome = new MeuCampoTexto(30, true, true, "Nome");
    public MeuCampoData campoDataInicio = new MeuCampoData(6, false, "Data Início", false);
    public MeuCampoData campoDataFim = new MeuCampoData(6, false, "Data Fim", false);

    public TelaGeraCarne() {
        super("Geração de Carnes");
        adicionaCampo(1, 1, 1, 2, campoNome, ESQUERDA);
        adicionaCampo(2, 1, 1, 2, campoDataInicio, ESQUERDA);
        adicionaCampo(2, 4, 1, 2, campoDataFim, ESQUERDA);
        
        pack();
        habilitarCampos(false);
    }
    
    public static TelaCadastro getTela() {  //Estático para poder ser chamado de outras classes sem a necessidade de ter criado um objeto anteriormente.
        if (tela == null) {   //Tela não está aberta, pode criar uma nova tela
            tela = new TelaGeraCarne();
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
