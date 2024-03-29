/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.CrudJava.VIEW;

import br.com.CrudJava.CTR.ItemPedidoCTR;
import br.com.CrudJava.CTR.PedidoCTR;
import br.com.CrudJava.MODEL.ClienteMODEL;
import br.com.CrudJava.MODEL.VendedorMODEL;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class PedidoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form PedidoVIEW
     */
    ResultSet rs;
    public static int cod_cliente=0;
    public static int cod_vendedor=0;
    
    
    public PedidoVIEW() {
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

        jLabel1 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_prazo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();
        btn_cliente = new javax.swing.JButton();
        btn_vendedor = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_vendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Cliente");

        jLabel2.setText("Prazo de Entrega");

        tbl_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_item);

        btn_cliente.setText("buscar cliente");
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_vendedor.setText("buscar vendedor");
        btn_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendedorActionPerformed(evt);
            }
        });

        jButton3.setText("finalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Vendedor");

        btn_iniciar.setText("Iniciar Pedido");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        btn_add.setText("Adicionar Itens");
        btn_add.setEnabled(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_prazo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btn_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add)
                .addGap(18, 18, 18)
                .addComponent(btn_iniciar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cliente)
                    .addComponent(btn_vendedor)
                    .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_prazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar)
                    .addComponent(btn_add))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
     if(!txt_prazo.getText().equals("")&& cod_cliente!=0 && cod_vendedor!=0){
      ItemPedidoCTR ctr2 = new ItemPedidoCTR();
      PedidoCTR ctr = new PedidoCTR();
      VendedorMODEL vendedor = new VendedorMODEL();
      ClienteMODEL cliente = new ClienteMODEL();
      
      vendedor.setCodigo_vendedor(cod_vendedor);
      cliente.setCodigo_cliente(cod_cliente);
      
      ctr.SetFkcliente(cliente);
      ctr.SetFkvendedor(vendedor);
      ctr.SetPrazo_Entrega(Integer.parseInt(txt_prazo.getText()));
      ctr.CadastrarPedido();
      
      btn_iniciar.setEnabled(false);
      btn_add.setEnabled(true);
      txt_cliente.setEditable(false);
      txt_prazo.setEditable(false);
      txt_vendedor.setEditable(false);
     BtnBuscar();
    
     }else{JOptionPane.showMessageDialog(null,"Preencha todas as informações necessárias");}
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
     PedidoClienteVIEW clienteView = new PedidoClienteVIEW();
     
     clienteView.setVisible(true);
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendedorActionPerformed
         PedidoVendedorVIEW vendedorView = new PedidoVendedorVIEW();
     
     vendedorView.setVisible(true);
    }//GEN-LAST:event_btn_vendedorActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       ItemPedidoVIEW view = new ItemPedidoVIEW();
       
       view.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       BtnBuscar();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoVIEW().setVisible(true);
            }
        });
    }
public void PreencheTabela(){
     
         try{
     
     
     String[] todos={"Código","Descrição do Produto","Unidade","Valor","Quantidade","Sub-Total"};
     
     String[][] linhas ={};
  
     DefaultTableModel tm = new DefaultTableModel(linhas, todos){
     
     public boolean isCellEditTable(int rowIndex, int mColIndex){return false;}
     
     };
         
             Vector<Vector> dados = new Vector<>();
             
             while(rs.next()){
             
            
            
             Vector regVetor = new Vector();
             
             regVetor.add(rs.getInt("codigo_produto"));
             regVetor.add(rs.getString("descricao_produto"));
             regVetor.add(rs.getString("unidade"));
             regVetor.add(rs.getString("val_unit"));
             regVetor.add(rs.getInt("quantidade"));
             regVetor.add(rs.getInt("quantidade")*rs.getDouble("val_unit"));
             dados.add(regVetor);
             tm.addRow(regVetor);
  
             }
             tbl_item.setModel(tm);
         
         }catch(Exception e){
    

            System.out.println(e.getMessage());
        
    }
     
     
     }
    
  
    
    public void BuscarProduto(){
    PedidoCTR ped = new PedidoCTR();
    ItemPedidoCTR ctr =new ItemPedidoCTR();
    
    
    rs=ctr.BuscarItemPedido(ped.BuscarNumPedido());
    
    PreencheTabela();

    }
    
    public void BtnBuscar(){
    
    BuscarProduto();
    
    if(tbl_item.getRowCount()>0){
    tbl_item.changeSelection(0, 0, false, false);
    
    }
    tbl_item.grabFocus();
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_vendedor;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_item;
    public static javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_prazo;
    public static javax.swing.JTextField txt_vendedor;
    // End of variables declaration//GEN-END:variables
}
