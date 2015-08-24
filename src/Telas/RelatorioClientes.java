/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.Associados;


/**
 *
 * @author info48
 */
public class RelatorioClientes {
    private ArrayList<Associados> FicharioAssociados = new ArrayList<>();
    private Associados ficha = new Associados();
    public void executa() throws Exception {
        

                Document doc = null;
	        OutputStream os = null;             
        
		
        try {
            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
			
            //cria a stream de saída
            os = new FileOutputStream("cliente.pdf");
			
            //associa a stream de saída ao 
            PdfWriter.getInstance(doc, os);
			
            //abre o documento
            doc.open();

            //adiciona o texto ao PDF
            Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
            Paragraph p = new Paragraph("Relatório Clientes", f);
            p.setAlignment(Element.ALIGN_CENTER);
            doc.add(p);
           //Prepara os Dados
            int total = FicharioAssociados.size();           
           PdfPTable table = new PdfPTable(4);
           PdfPCell header = new PdfPCell(new Paragraph("Lista de Clientes"));
           header.setColspan(4);
           table.addCell(header);
           table.addCell("Nome");
           table.addCell("Endereço");
           table.addCell("Telefone");
           table.addCell("Email");
           for (int x=0; x<total;x++){
               ficha = FicharioAssociados.get(x);
               table.addCell(ficha.getNome());
               table.addCell(ficha.getEndereco());
               table.addCell(ficha.getTelefone());
               table.addCell(ficha.getEmail());
           }
           doc.add(table); 

        } finally {
            if (doc != null) {
                //fechamento do documento
                doc.close();
            }
            if (os != null) {
               //fechamento da stream de saída
               os.close();
            }
            
            // abrindo o arquivo pelo sistema
             
            try {
                File pdf = new File("cliente.pdf");
                Desktop.getDesktop().open(pdf);
            } catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
            }  
        }
  
	    
            }
}
            
    
