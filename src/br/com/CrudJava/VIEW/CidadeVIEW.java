/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.VIEW;

import br.com.CrudJava.CTR.CidadeCTR;
import br.com.CrudJava.CTR.EstadoCTR;
import br.com.CrudJava.MODEL.EstadoMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class CidadeVIEW extends javax.swing.JFrame {

    private String opcao;
     ResultSet rs_estado;
 
   List<EstadoMODEL> estadoList = new ArrayList<>();
 
    public CidadeVIEW() {
        initComponents();
         setLocationRelativeTo(null);
         
         CarregaCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbl_cod = new javax.swing.JLabel();
        lbl_cidade = new javax.swing.JLabel();
        lbl_sigla = new javax.swing.JLabel();
        btn_novo = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        txt_cod = new javax.swing.JTextField();
        btn_voltar = new javax.swing.JButton();
        txt_cidade = new javax.swing.JTextField();
        txt_estado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_cod.setText("Cod:");

        lbl_cidade.setText("Cidade:");

        lbl_sigla.setText("Estado");

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        txt_cod.setEditable(false);

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        txt_cidade.setEditable(false);

        txt_estado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cod))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cidade)
                            .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_voltar))))
                            .addComponent(lbl_sigla))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_alterar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_excluir)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cod)
                    .addComponent(lbl_cidade)
                    .addComponent(lbl_sigla))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_voltar)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_salvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
PesquisarCidadeVIEW view  = new PesquisarCidadeVIEW();
view.setVisible(true);
this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed

        txt_cod.setEditable(false);
        txt_cidade.setEditable(true);
        txt_estado.setEnabled(true);

        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_novo.setEnabled(false);
        btn_salvar.setEnabled(true);
        jButton1.setEnabled(false);
        limpaCampos();
        opcao = "cadastrar";
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        txt_cod.setEditable(false);
        txt_cidade.setEditable(true);
        txt_estado.setEnabled(true);

        btn_novo.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_salvar.setEnabled(true);
        jButton1.setEnabled(false);
        opcao="alterar";
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed

        String[] options = new String[]{"Sim","Não"};

        Object ret = JOptionPane.showOptionDialog(null,"Tem certeza que deseja excluir a cidade: "+txt_cidade.getText()+" ?","Aviso!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

        if(ret.equals(JOptionPane.YES_OPTION)){ExcluirCidade();}
    
        limpaCampos();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        opcao();
        limpaCampos();
        btn_novo.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_salvar.setEnabled(false);
        jButton1.setEnabled(true);

        txt_cod.setEditable(false);
        txt_cidade.setEditable(false);
        txt_estado.setEnabled(false);
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      

        this.dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(CidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeVIEW().setVisible(true);
            }
        });
    }
  
    public void limpaCampos(){
    
    txt_cod.setText("");
    txt_cidade.setText("");
    txt_estado.setSelectedItem(null);
        
    }
    
    public void opcao(){
    
    switch(opcao){
    
        case "alterar":
            
            alterarCidade();
            opcao = "";
            break;
            
        case "cadastrar":
            
            CadastrarCidade();
               opcao = "";
            break;
    
    } 
    
    }
    
    
 
     
      public void alterarCidade(){
          
     EstadoMODEL estado = new EstadoMODEL();
    CidadeCTR ctr = new CidadeCTR();
    
     Integer cod = Integer.parseInt(txt_cod.getText());
     ctr.SetNomeCidade(txt_cidade.getText());
     estado.setCod(estadoList.get(txt_estado.getSelectedIndex()).getCod());
     ctr.SetEstado(estado);
    
    ctr.AlterarCidade(cod);
 
    }
    
      public void CadastrarCidade(){
          
     EstadoMODEL estado = new EstadoMODEL();
          CidadeCTR ctr = new CidadeCTR();
          
     ctr.SetNomeCidade(txt_cidade.getText());
     estado.setCod(estadoList.get(txt_estado.getSelectedIndex()).getCod());
    ctr.SetEstado(estado);
    
    
    ctr.InserirCidade();
    
    
    }
     public void ExcluirCidade(){
      CidadeCTR ctr = new CidadeCTR();
       Integer cod = Integer.parseInt(txt_cod.getText());
       
     ctr.ExcluirCidade(cod);

     }
     
     public void CarregaCombo(){
         
      
        
      txt_estado.removeAllItems();
    
     EstadoCTR estadoCtr = new EstadoCTR();
    rs_estado = estadoCtr.ListaEstado();
    
        try {
          
            while(rs_estado.next()){
            EstadoMODEL estadoModel = new EstadoMODEL();
            
            estadoModel.setCod(rs_estado.getInt("cod_estado"));
            estadoModel.setNome(rs_estado.getString("nome_estado"));
            estadoModel.setSigla(rs_estado.getString("sigla_estado"));
            
            estadoList.add(estadoModel);
      
               txt_estado.addItem(estadoModel.getSigla());
          
            }
                
                } catch (SQLException ex) {
                    
            Logger.getLogger(CidadeVIEW.class.getName()).log(Level.SEVERE, null, ex);
       
                }
        
     
     }
     public void selecionaEstado(int cod){
     
        try {
            int i =0;
            while(rs_estado.next()){
                
                if(rs_estado.getInt("fk_estado")==cod){txt_estado.setSelectedIndex(i);}
                i++;
            }  } catch (SQLException ex) {
            Logger.getLogger(CidadeVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_sigla;
    public static javax.swing.JTextField txt_cidade;
    public static javax.swing.JTextField txt_cod;
    public static javax.swing.JComboBox<String> txt_estado;
    // End of variables declaration//GEN-END:variables
}
