/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.VIEW;

import br.com.CrudJava.CTR.EstadoCTR;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class PesquisarEstadoVIEW extends javax.swing.JFrame {

    ResultSet rs;
    String cod_estado;
    public EstadoVIEW obj;
    
    
    
    public PesquisarEstadoVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        tbl_estado.setDefaultEditor(Object.class,null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_pesquisa = new javax.swing.JLabel();
        btn_Pesquisar = new javax.swing.JButton();
        txt_pesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_estado = new javax.swing.JTable();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_pesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_pesquisa.setText("Pesquisar:");

        btn_Pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });

        txt_pesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tbl_estado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_estadoMouseClicked(evt);
            }
        });
        tbl_estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_estadoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_estado);

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
                        .addGap(0, 15, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
        BtnBuscar();
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     txt_pesquisa.grabFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
      
        this.dispose();
       
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void tbl_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_estadoMouseClicked
      if(evt.getClickCount() == 1){
      
      int linha = tbl_estado.getSelectedRow();
      
      obj.txt_cod.setText(String.valueOf(tbl_estado.getValueAt(linha, 0)));
      obj.txt_estado.setText(String.valueOf(tbl_estado.getValueAt(linha, 1)));
      obj.txt_sigla.setText(String.valueOf(tbl_estado.getValueAt(linha, 2)));


        this.dispose();
      
      
          
      }
    }//GEN-LAST:event_tbl_estadoMouseClicked

    private void tbl_estadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_estadoKeyPressed
         int linha = tbl_estado.getSelectedRow();
      
      obj.txt_cod.setText(String.valueOf(tbl_estado.getValueAt(linha, 0)));
      obj.txt_estado.setText(String.valueOf(tbl_estado.getValueAt(linha, 1)));
      obj.txt_sigla.setText(String.valueOf(tbl_estado.getValueAt(linha, 2)));
     
        this.dispose();
      
      
    }//GEN-LAST:event_tbl_estadoKeyPressed

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
            java.util.logging.Logger.getLogger(PesquisarEstadoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarEstadoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarEstadoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarEstadoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarEstadoVIEW().setVisible(true);
            }
        });
    }
    public void PreencheTabela(){
     
         try{
     
     
     String[] todos={"Código","Nome do Estado","Sigla"};
     
     String[][] linhas ={};
     
     DefaultTableModel tm = new DefaultTableModel(linhas, todos){

         
         public boolean isCellEditTable(int rowIndex, int mColIndex){return false;}
     
     };
     
             Vector<Vector> dados = new Vector<>();
             
             while(rs.next()){
             
             Vector regVetor = new Vector();
             
             regVetor.add(rs.getInt("cod_estado"));
             regVetor.add(rs.getString("nome_estado"));
             regVetor.add(rs.getString("sigla_estado"));
             dados.add(regVetor);
             tm.addRow(regVetor);
             
             }
             tbl_estado.setModel(tm);
         
         }catch(Exception e){
    

            System.out.println(e.getMessage());
        
    }
     
     
     }
    
    public void SelecionaValor(){
    
    cod_estado=String.valueOf(tbl_estado.getValueAt(tbl_estado.getSelectedRow(),0));
    this.dispose();
    
    }
    
    public void BuscarEstado(){
    
    EstadoCTR ctr =new EstadoCTR();
    
    ctr.SetNome(txt_pesquisa.getText());
    rs=ctr.BuscarEstado();
    
    PreencheTabela();
    
    
    
    }
    
    public void BtnBuscar(){
    
    BuscarEstado();
    
    if(tbl_estado.getRowCount()>0){
    tbl_estado.changeSelection(0, 0, false, false);
    
    }
    tbl_estado.grabFocus();
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_pesquisa;
    private javax.swing.JTable tbl_estado;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}