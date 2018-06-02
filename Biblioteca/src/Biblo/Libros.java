/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
/**
 *
 * @author usuario
 */
public class Libros extends javax.swing.JFrame {
    DefaultTableModel tab1 = new DefaultTableModel();

    
    
   public static ArrayList<RLibro> Libro=new ArrayList<RLibro>() ;
    
   
    
    public Libros() {
        
        initComponents();
        setLocationRelativeTo(null);
        tab1.addColumn("Titulo");
        tab1.addColumn("Autor");
        tab1.addColumn("Año.Publicacion");
        tab1.addColumn("Editorial");
        tab1.addColumn("Codigo");
        tab1.addColumn("Estado");
        
        this.tabla1.setModel(tab1);
        
    }
    
    void Editar (){
        int fila=tabla1.getSelectedRow();
        tab1.setValueAt(txtitulo.getText(),fila,0);
        tab1.setValueAt(txautor.getText(),fila,1);
        tab1.setValueAt(txaño.getText(),fila,2);
        tab1.setValueAt(txEditorial.getText(),fila,3);
        tab1.setValueAt(txcodigo.getText(),fila,4);
        tab1.setValueAt(TxDisponible.getText(),fila,5);
    }
    void LimpiarTabla(){
        int filas=tab1.getRowCount();
        for(int i=0;i<filas;i++){
            tab1.removeRow(0);
        }
    }
    void Mostrar(){
        int filas=tab1.getRowCount();
        for(int i=0;i<filas;i++){
            tab1.removeRow(0);
        }
        
        for(int i = 0;i<Libro.size();i++){
            Object [] most = {Libro.get(i).titulo,Libro.get(i).autor,Libro.get(i).Año,Libro.get(i).editorial,Libro.get(i).codigo,Libro.get(i).estado};
            tab1.addRow(most);
        }
            
        
        
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
        jLabel2 = new javax.swing.JLabel();
        txtitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txautor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txaño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        Bt_Registrar = new javax.swing.JButton();
        BT_Eliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txEditorial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txcodigo = new javax.swing.JTextField();
        BT_Salir = new javax.swing.JButton();
        BT_Editar = new javax.swing.JButton();
        BT_VERTODO = new javax.swing.JButton();
        BT_Volver = new javax.swing.JButton();
        BT_Minimizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TxDisponible = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Modificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Libros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Titulo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, -1));

        txtitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtituloActionPerformed(evt);
            }
        });
        getContentPane().add(txtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 92, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        txautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txautorActionPerformed(evt);
            }
        });
        getContentPane().add(txautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 97, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año de Publicacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 51, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editorial");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 89, 58, -1));
        getContentPane().add(txaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, 30));

        tabla1.setBackground(new java.awt.Color(0, 0, 0));
        tabla1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla1.setForeground(new java.awt.Color(255, 255, 255));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TITULO", "AUTOR", "AÑO. PUBLICACION", "EDITORIAL", "CODIGO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 540, 110));

        Bt_Registrar.setBackground(new java.awt.Color(0, 0, 0));
        Bt_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Registrar.setText("Registrar");
        Bt_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        BT_Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        BT_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Eliminar.setText("Eliminar");
        BT_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Limpiar tabla");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 110, -1));

        txEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEditorialActionPerformed(evt);
            }
        });
        getContentPane().add(txEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 120, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));
        getContentPane().add(txcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 50, 30));

        BT_Salir.setBackground(new java.awt.Color(0, 0, 0));
        BT_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xnombre.png"))); // NOI18N
        BT_Salir.setBorder(null);
        BT_Salir.setBorderPainted(false);
        BT_Salir.setContentAreaFilled(false);
        BT_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        BT_Salir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        BT_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SalirMouseClicked(evt);
            }
        });
        BT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 40));

        BT_Editar.setBackground(new java.awt.Color(0, 0, 0));
        BT_Editar.setForeground(new java.awt.Color(255, 255, 255));
        BT_Editar.setText("Editar");
        BT_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EditarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        BT_VERTODO.setBackground(new java.awt.Color(0, 0, 0));
        BT_VERTODO.setForeground(new java.awt.Color(255, 255, 255));
        BT_VERTODO.setText("Ver Todo");
        BT_VERTODO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_VERTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VERTODOActionPerformed(evt);
            }
        });
        getContentPane().add(BT_VERTODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 83, -1));

        BT_Volver.setBackground(new java.awt.Color(0, 0, 0));
        BT_Volver.setForeground(new java.awt.Color(255, 255, 255));
        BT_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flchneg.png"))); // NOI18N
        BT_Volver.setBorder(null);
        BT_Volver.setBorderPainted(false);
        BT_Volver.setContentAreaFilled(false);
        BT_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Next_page_64px_2.png"))); // NOI18N
        BT_Volver.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Next_page_64px_2.png"))); // NOI18N
        BT_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, 60));

        BT_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flchngra.png"))); // NOI18N
        BT_Minimizar.setBorder(null);
        BT_Minimizar.setBorderPainted(false);
        BT_Minimizar.setContentAreaFilled(false);
        BT_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Minimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        BT_Minimizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        BT_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_MinimizarMouseClicked(evt);
            }
        });
        BT_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 40, 20));

        TxDisponible.setForeground(new java.awt.Color(204, 204, 204));
        TxDisponible.setText("Disponible o Prestamo");
        getContentPane().add(TxDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Li.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 340));

        jMenuBar2.setBackground(new java.awt.Color(153, 153, 255));

        jMenu4.setText("Registro");

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Ir al Loby");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 0, 0));
        jMenu5.setText("Libros");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(255, 255, 255));
        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Search_32px_2.png"))); // NOI18N
        Modificar.setText("Buscar");
        Modificar.setBorder(null);
        Modificar.setBorderPainted(true);
        Modificar.setContentAreaFilled(false);
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jMenu5.add(Modificar);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtituloActionPerformed

    private void txEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEditorialActionPerformed

    private void txautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txautorActionPerformed

    private void Bt_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_RegistrarActionPerformed
       Libro.add(new RLibro(txtitulo.getText(),txautor.getText(),txaño.getText(),txEditorial.getText(),txcodigo.getText(),TxDisponible.getText()));
       tab1.addRow(new Object[]{txtitulo.getText(),txautor.getText(),txaño.getText(),txEditorial.getText(),txcodigo.getText(),TxDisponible.getText()});
        
       txtitulo.setText("");
        txautor.setText("");
        txaño.setText("");
        txEditorial.setText("");
        txcodigo.setText("");
       TxDisponible.setText(""); 
    }//GEN-LAST:event_Bt_RegistrarActionPerformed

    private void BT_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EliminarActionPerformed
        int fila= tabla1.getSelectedRow();
        Libro.remove(fila);
        tab1.removeRow(fila);
    }//GEN-LAST:event_BT_EliminarActionPerformed

    private void BT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SalirActionPerformed
      
    }//GEN-LAST:event_BT_SalirActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
        Busr B=new Busr();
        B.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       LimpiarTabla();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BT_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EditarActionPerformed
      Editar ();
    }//GEN-LAST:event_BT_EditarActionPerformed

    private void BT_VERTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VERTODOActionPerformed
       Mostrar ();
    }//GEN-LAST:event_BT_VERTODOActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        LOBY V= new LOBY();
        V.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void BT_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VolverActionPerformed
        LOBY vr= new LOBY();
        vr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_VolverActionPerformed

    private void BT_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_MinimizarActionPerformed

    private void BT_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_MinimizarMouseClicked
        this.setState(Libros.ICONIFIED);
    }//GEN-LAST:event_BT_MinimizarMouseClicked

    private void BT_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SalirMouseClicked
      
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, " ¿Desea salir del Programa?","Exit", dialog);
     
        if (result == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_BT_SalirMouseClicked

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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Editar;
    private javax.swing.JButton BT_Eliminar;
    private javax.swing.JButton BT_Minimizar;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JButton BT_VERTODO;
    private javax.swing.JButton BT_Volver;
    private javax.swing.JButton Bt_Registrar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JTextField TxDisponible;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txEditorial;
    private javax.swing.JTextField txautor;
    private javax.swing.JTextField txaño;
    private javax.swing.JTextField txcodigo;
    private javax.swing.JTextField txtitulo;
    // End of variables declaration//GEN-END:variables
}
