/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.VIEW;

import br.com.CrudJava.CTR.VendedorCTR;
import br.com.CrudJava.MODEL.SexoMODEL;
import br.com.CrudJava.MODEL.VendedorMODEL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leroy2
 */



public class PesquisarVendedorVIEW extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarVendedorVIEW
     */
    ResultSet rs;
    VendedorVIEW obj;
    List<VendedorMODEL> vendedorList = new ArrayList<>();
    public PesquisarVendedorVIEW() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_pesquisa = new javax.swing.JTextField();
        lbl_pesquisa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vendedor = new javax.swing.JTable();
        btn_Pesquisar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_pesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbl_pesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_pesquisa.setText("Pesquisar:");

        tbl_vendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vendedorMouseClicked(evt);
            }
        });
        tbl_vendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_vendedorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_vendedor);

        btn_Pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        btn_voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_pesquisa)
                                .addGap(147, 147, 147))
                            .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Pesquisar)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_voltar)
                                .addGap(66, 66, 66))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_pesquisa)
                    .addComponent(btn_voltar))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vendedorMouseClicked
        if(evt.getClickCount() == 1){

            int linha = tbl_vendedor.getSelectedRow();

            obj.txt_cod.setText(String.valueOf(tbl_vendedor.getValueAt(linha, 0)));
            obj.txt_nome.setText(String.valueOf(tbl_vendedor.getValueAt(linha, 1)));
            obj.txt_salario.setText(String.valueOf(tbl_vendedor.getValueAt(linha, 2)));
             obj.cmb_faixa.setSelectedItem(tbl_vendedor.getValueAt(linha, 3));
             obj.cmb_sexo.setSelectedItem(vendedorList.get(linha).getFk_sexo().getDescricao());
            this.dispose();

        }
    }//GEN-LAST:event_tbl_vendedorMouseClicked

    private void tbl_vendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_vendedorKeyPressed
        int linha = tbl_vendedor.getSelectedRow();

         obj.txt_cod.setText(String.valueOf(tbl_vendedor.getValueAt(linha, 0)));
            obj.txt_nome.setText(String.valueOf(tbl_vendedor.getValueAt(linha, 1)));
            obj.txt_salario.setText(String.valueOf(tbl_vendedor.getValueAt(linha, 2)));
             obj.cmb_faixa.setSelectedItem(tbl_vendedor.getValueAt(linha, 3));
            obj.cmb_sexo.setSelectedItem(vendedorList.get(linha).getFk_sexo().getDescricao());
        this.dispose();
    }//GEN-LAST:event_tbl_vendedorKeyPressed

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        BtnBuscar();
    }//GEN-LAST:event_btn_PesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisarVendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarVendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarVendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarVendedorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarVendedorVIEW().setVisible(true);
            }
        });
    }
 public void PreencheTabela(){
     
         try{
     
     
     String[] todos={"Código","Nome do Vendedor","Salario","Faixa de Comissão","Sexo"};
     
     String[][] linhas ={};
  
     DefaultTableModel tm = new DefaultTableModel(linhas, todos){
     
     public boolean isCellEditTable(int rowIndex, int mColIndex){return false;}
     
     };
         
             Vector<Vector> dados = new Vector<>();
             
             while(rs.next()){
          
          SexoMODEL sexoModel = new SexoMODEL();
          VendedorMODEL vendedorModel = new VendedorMODEL();
          
             Vector regVetor = new Vector();
             
             regVetor.add(rs.getInt("codigo_vendedor"));
             regVetor.add(rs.getString("nome_vendedor"));
             regVetor.add(rs.getDouble("salario_fixo"));
             regVetor.add(rs.getString("faixa_comissao"));
             regVetor.add(rs.getString("descricao_sexo"));
             dados.add(regVetor);
             tm.addRow(regVetor);
             
             
            sexoModel.setCod(rs.getInt("cod_sexo"));
            sexoModel.setDescricao(rs.getString("descricao_sexo"));
            
            vendedorModel.setFk_sexo(sexoModel);
            vendedorModel.setCodigo_vendedor(rs.getInt("codigo_vendedor"));
            vendedorModel.setNome_vendedor(rs.getString("nome_vendedor"));
            vendedorModel.setFaixa_comissao(rs.getString("faixa_comissao"));
            vendedorModel.setSalario_vendedor(rs.getDouble("salario_fixo"));
            
            vendedorList.add(vendedorModel);
         
             }
             tbl_vendedor.setModel(tm);
         
         }catch(Exception e){
    

            System.out.println(e.getMessage());
        
    }
     
     
     }
    
  
    
    public void BuscarVendedor(){
    
    VendedorCTR ctr =new VendedorCTR();
    
    ctr.SetNome_Vendedor(txt_pesquisa.getText());
    rs=ctr.BuscarVendedor();
    
    PreencheTabela();
    
    
    
    }
    
    public void BtnBuscar(){
    
    BuscarVendedor();
    
    if(tbl_vendedor.getRowCount()>0){
    tbl_vendedor.changeSelection(0, 0, false, false);
    
    }
    tbl_vendedor.grabFocus();
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_pesquisa;
    private javax.swing.JTable tbl_vendedor;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
