
package Vistas;


import AccesoADatos.InquilinoData;
import Entidades.Inquilino;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class AgregarInquilino extends javax.swing.JFrame {
    private Connection con;
    private Inquilino ocupanteActual;
    private InquilinoData ocupanteData;
   
    public AgregarInquilino() {
        initComponents();
          this.con=con;
          ocupanteData = new InquilinoData();
	  ocupanteActual = new Inquilino();
        limpiarCampos();
    }
 

    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jTdni = new javax.swing.JTextField();
                jTapellido = new javax.swing.JTextField();
                jTnombre = new javax.swing.JTextField();
                jTcuit = new javax.swing.JTextField();
                jTtelefono = new javax.swing.JTextField();
                jTlugarTrabajo = new javax.swing.JTextField();
                jBlimpiar = new javax.swing.JButton();
                jBagregar = new javax.swing.JButton();
                jBsalir = new javax.swing.JButton();
                jLabel10 = new javax.swing.JLabel();
                jTtipo = new javax.swing.JTextField();

                jButton1.setText("jButton1");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setIconImages(null);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-la83-larga.png"))); // NOI18N

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(204, 41, 0));
                jLabel2.setText("INQUILINO");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(196, 107, 107));
                jLabel3.setText("Agregar Inquilino");

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel4.setText("DNI Inquilino: ");

                jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel5.setText("Apellido: ");

                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel6.setText("Nombre: ");

                jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel7.setText("CUIT: ");

                jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel8.setText("Teléfono:");

                jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel9.setText("Lugar de Trabajo: ");

                jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTdniKeyTyped(evt);
                        }
                });

                jTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTapellidoKeyTyped(evt);
                        }
                });

                jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTnombreKeyTyped(evt);
                        }
                });

                jTcuit.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTcuitKeyTyped(evt);
                        }
                });

                jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTtelefonoKeyTyped(evt);
                        }
                });

                jTlugarTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTlugarTrabajoKeyTyped(evt);
                        }
                });

                jBlimpiar.setText("LIMPIAR");
                jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBlimpiarActionPerformed(evt);
                        }
                });

                jBagregar.setText("AGREGAR");
                jBagregar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBagregarActionPerformed(evt);
                        }
                });

                jBsalir.setText("SALIR");
                jBsalir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBsalirActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel10.setText("Tipo de Inquilino: ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(191, 191, 191))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jBlimpiar)
                                                                .addGap(65, 65, Short.MAX_VALUE)
                                                                .addComponent(jBagregar)
                                                                .addGap(38, 38, 38))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addGap(94, 94, 94))
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addGap(121, 121, 121)))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(jLabel6)
                                                                                                        .addGap(120, 120, 120)))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel7)
                                                                                                .addGap(136, 136, 136)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel8)
                                                                                        .addGap(118, 118, 118)))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel10)
                                                                                .addGap(72, 72, 72)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTtelefono)
                                                                        .addComponent(jTcuit)
                                                                        .addComponent(jTnombre)
                                                                        .addComponent(jTdni)
                                                                        .addComponent(jTlugarTrabajo)
                                                                        .addComponent(jTapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                                        .addComponent(jTtipo))))
                                                .addGap(45, 45, 45)
                                                .addComponent(jBsalir)))
                                .addContainerGap(29, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel6))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTcuit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jTlugarTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBlimpiar)
                                        .addComponent(jBagregar)
                                        .addComponent(jBsalir))
                                .addGap(33, 33, 33))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose ();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
      try {
        int dni = Integer.parseInt(jTdni.getText());
        String apellido = jTapellido.getText();
        String nombre = jTnombre.getText();
        int cuit = Integer.parseInt(jTcuit.getText());
        int telefono = Integer.parseInt(jTtelefono.getText());
        String lugarTrabajo = jTlugarTrabajo.getText();
        String tipo = jTtipo.getText();

        if (dni == 0 || apellido.isEmpty() || nombre.isEmpty() || cuit == 0 || telefono == 0 || lugarTrabajo.isEmpty() || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            return;
        }

        // Crear un objeto Inquilino con los datos del formulario
        Inquilino ocupanteNuevo = new Inquilino(apellido, nombre, dni, cuit, lugarTrabajo, telefono, tipo);

        // Llamar al método agregarInquilino con el nuevo inquilino
        ocupanteData.agregarInquilino(ocupanteNuevo);

        // Restablecer los campos del formulario
        jTdni.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTcuit.setText("");
        jTtelefono.setText("");
        jTlugarTrabajo.setText("");
        jTtipo.setText("");

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(this, "Inquilino guardado exitosamente.");
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(this, "Debe ingresar datos válidos");
    }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiarCampos ();
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_jTdniKeyTyped

    private void jTapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTapellidoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR LETRAS");
        }
    }//GEN-LAST:event_jTapellidoKeyTyped

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
            
char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR LETRAS");
        }
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTcuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcuitKeyTyped
      char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_jTcuitKeyTyped

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped
      char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_jTtelefonoKeyTyped

    private void jTlugarTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTlugarTrabajoKeyTyped
       char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR LETRAS");
        }
    }//GEN-LAST:event_jTlugarTrabajoKeyTyped
    private void limpiarCampos (){
        jTdni.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTcuit.setText("");
        jTtelefono.setText("");
        jTlugarTrabajo.setText("");
        jTtipo.setText("");
    }
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
            java.util.logging.Logger.getLogger(AgregarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarInquilino().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jBagregar;
        private javax.swing.JButton jBlimpiar;
        private javax.swing.JButton jBsalir;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JTextField jTapellido;
        private javax.swing.JTextField jTcuit;
        private javax.swing.JTextField jTdni;
        private javax.swing.JTextField jTlugarTrabajo;
        private javax.swing.JTextField jTnombre;
        private javax.swing.JTextField jTtelefono;
        private javax.swing.JTextField jTtipo;
        // End of variables declaration//GEN-END:variables

    
} 


