/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.VIEW;

import br.com.CrudJava.CTR.SexoCTR;
import br.com.CrudJava.CTR.VendedorCTR;
import br.com.CrudJava.MODEL.SexoMODEL;
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
public class VendedorVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Vendedor
     */
    String opcao;
     List<SexoMODEL> sexoList = new ArrayList<>();
    public VendedorVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        CarregaComboSexo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cod = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_faixa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmb_sexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_cod.setText("Codigo");

        txt_cod.setEditable(false);

        lbl_nome.setText("Nome");

        txt_nome.setEditable(false);

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
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

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Salario ");

        txt_salario.setEditable(false);

        jLabel2.setText("Faixa Comissão");

        cmb_faixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        cmb_faixa.setEnabled(false);

        jLabel3.setText("Sexo");

        cmb_sexo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btn_novo)
                                .addGap(10, 10, 10)
                                .addComponent(btn_salvar)
                                .addGap(10, 10, 10)
                                .addComponent(btn_alterar)
                                .addGap(10, 10, 10)
                                .addComponent(btn_excluir))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_faixa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_voltar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nome)
                                .addGap(13, 13, 13)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_cod)
                                .addGap(10, 10, 10)
                                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_cod))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmb_faixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_novo)
                    .addComponent(btn_salvar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btn_voltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed

        txt_cod.setEditable(false);
        txt_nome.setEditable(true);
        txt_salario.setEditable(true);
        cmb_faixa.setEnabled(true);txt_cod.setEditable(false);   
        cmb_sexo.setEnabled(true);
        
        btn_alterar.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_novo.setEnabled(false);
        btn_salvar.setEnabled(true);
        jButton1.setEnabled(false);
        limpaCampos();
        opcao = "cadastrar";
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        opcao();
        limpaCampos();
        btn_novo.setEnabled(true);
        btn_excluir.setEnabled(true);
        btn_alterar.setEnabled(true);
        btn_salvar.setEnabled(false);
        jButton1.setEnabled(true);

        txt_cod.setEditable(false);
        txt_nome.setEditable(false);
        txt_salario.setEditable(false);
        cmb_faixa.setEnabled(false);
        cmb_sexo.setEnabled(false);
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        txt_cod.setEditable(false);
        txt_nome.setEditable(true);
        txt_salario.setEditable(true);
        cmb_faixa.setEnabled(true);
        cmb_sexo.setEnabled(true);
        
        btn_novo.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn_alterar.setEnabled(false);
        btn_salvar.setEnabled(true);
        jButton1.setEnabled(false);
        opcao="alterar";
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed

        String[] options = new String[]{"Sim","Não"};

        Object ret = JOptionPane.showOptionDialog(null,"Tem certeza que deseja excluir o(a) vendedor(a): "+txt_nome.getText()+" ?","Aviso!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

        if(ret.equals(JOptionPane.YES_OPTION)){ExcluirVendedor();}
        limpaCampos();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PesquisarVendedorVIEW view =new PesquisarVendedorVIEW();
        view.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendedorVIEW().setVisible(true);
            }
        });
    }
  
    public void limpaCampos(){
    
     txt_cod.setText("");
     txt_nome.setText("");
     txt_salario.setText("");
     cmb_faixa.setSelectedItem(null);
     cmb_sexo.setSelectedItem(null);

        
    }
    
    public void opcao(){
    
    switch(opcao){
    
        case "alterar":
            
            AlterarVendedor();
            opcao = "";
            break;
            
        case "cadastrar":
            
            CadastrarVendedor();
               opcao = "";
            break;
    
    } 
    
    }
    
    
 
     
      public void AlterarVendedor(){
          
   VendedorCTR vendedorCtr = new VendedorCTR();
   SexoMODEL sexoModel = new SexoMODEL();
   
 Integer cod = Integer.parseInt(txt_cod.getText());
 
 sexoModel.setCod(sexoList.get(cmb_sexo.getSelectedIndex()).getCod());
 
   vendedorCtr.SetFaixa_Comissao(cmb_faixa.getSelectedItem().toString());
   vendedorCtr.SetNome_Vendedor(txt_nome.getText());
   vendedorCtr.SetSalario_Vendedor(Double.parseDouble(txt_salario.getText()));
   vendedorCtr.SetFk_Sexo(sexoModel);
   vendedorCtr.AlterarVendedor(cod);
   
    }
    
      public void CadastrarVendedor(){
          
     VendedorCTR vendedorCtr = new VendedorCTR();
     SexoMODEL sexoModel = new SexoMODEL();

    sexoModel.setCod(sexoList.get(cmb_sexo.getSelectedIndex()).getCod());
     
   vendedorCtr.SetFaixa_Comissao(cmb_faixa.getSelectedItem().toString());
   vendedorCtr.SetNome_Vendedor(txt_nome.getText());
   vendedorCtr.SetSalario_Vendedor(Double.parseDouble(txt_salario.getText()));
   vendedorCtr.SetFk_Sexo(sexoModel);
    
    vendedorCtr.InserirVendedor();
    
    
    }
     public void ExcluirVendedor(){
         
      VendedorCTR vendedorCtr = new VendedorCTR();
    
       Integer cod = Integer.parseInt(txt_cod.getText());
       
     vendedorCtr.DeletarVendedor(cod);

     }
      public void CarregaComboSexo(){
         
      
        
      cmb_sexo.removeAllItems();
     ResultSet rs_sexo;
     SexoCTR sexoCtr = new SexoCTR();
    rs_sexo = sexoCtr.ListaSexo();
    
        try {
          
            while(rs_sexo.next()){
            SexoMODEL sexoModel = new SexoMODEL();
            
            sexoModel.setCod(rs_sexo.getInt("cod_sexo"));
            sexoModel.setDescricao(rs_sexo.getString("descricao_sexo"));
           
            
            sexoList.add(sexoModel);
      
               cmb_sexo.addItem(sexoModel.getDescricao());
          
            }
                
                } catch (SQLException ex) {
                    
            Logger.getLogger(ClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
       
                }
     
       }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_voltar;
    public static javax.swing.JComboBox<String> cmb_faixa;
    public static javax.swing.JComboBox<String> cmb_sexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_nome;
    public static javax.swing.JTextField txt_cod;
    public static javax.swing.JTextField txt_nome;
    public static javax.swing.JTextField txt_salario;
    // End of variables declaration//GEN-END:variables
}
