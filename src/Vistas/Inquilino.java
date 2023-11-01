

package Vistas;

import AccesoADatos.InquilinoData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Inquilino extends javax.swing.JFrame {
    private Connection con;
    private Inquilino ocupanteActual;
    private InquilinoData inquiData;
    private Statement st;
    private ResultSet rs;
    
    private Inquilino ocupante = null; 
    private int getDni;
    private Entidades.Inquilino Inquilino;

   
	public Inquilino() {        
		initComponents();
                inquiData = new InquilinoData();  
		this.con = con;               
                limpiarCampos();
                
	}

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jBeditar = new javax.swing.JButton();
        jBbaja = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTnombre = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jTcuit = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jTlugarTrabajo = new javax.swing.JTextField();
        jTtipo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 633));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-la83-larga-menu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 150));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Inquilino");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(196, 107, 107));
        jLabel3.setText("Buscar Inquilino");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setText("DNI Inquilino : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel7.setText("CUIT : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel8.setText("Teléfono: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel9.setText("Lugar de Trabajo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel12.setText("Tipo de Inquilino: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jBeditar.setText("EDITAR");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, -1));

        jBbaja.setText("BAJA");
        jBbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbajaActionPerformed(evt);
            }
        });
        jPanel1.add(jBbaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, -1, -1));

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 130, -1));

        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });
        jPanel1.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        jTcuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcuitKeyTyped(evt);
            }
        });
        jPanel1.add(jTcuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 130, -1));

        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 130, -1));

        jTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTapellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 130, -1));

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jBlimpiar.setText("LIMPIAR");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        jTlugarTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTlugarTrabajoKeyTyped(evt);
            }
        });
        jPanel1.add(jTlugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 130, -1));

        jTtipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtipoKeyTyped(evt);
            }
        });
        jPanel1.add(jTtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try{   
        int dni = Integer.parseInt (jTdni.getText());
        Inquilino = inquiData.buscarInquilinoPorDni(dni);

        if (Inquilino != null){
            jTapellido.setText(Inquilino.getApellido());
            jTnombre.setText(Inquilino.getNombre());
            int cuit = Inquilino.getCuit();
            jTcuit.setText(Integer.toString(cuit)); 
            int telefono = Inquilino.getTelefono();
            jTtelefono.setText (Integer.toString(telefono));
            jTlugarTrabajo.setText(Inquilino.getLugarTrabajo());
            jTtipo.setText (Inquilino.getTipo());
            
     
     } else {
            JOptionPane.showMessageDialog(this, "El inquilino buscado no existe en la base de datos");
            limpiarCampos();
        }
    } catch (NumberFormatException ex) {    
         JOptionPane.showMessageDialog(this, "Debe ingresar un documento válido");
    
     }

    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose ();
    }//GEN-LAST:event_jBsalirActionPerformed
    private void limpiarCampos (){
        jTdni.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jTcuit.setText("");
        jTtelefono.setText("");
        jTlugarTrabajo.setText("");
        jTtipo.setText("");
        
    
    }
    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiarCampos ();
        ocupante = null;
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbajaActionPerformed
//               if ( materiaActual!= null) {
//
//            matData.eliminarMateria(materiaActual.getIdMateria());
//            materiaActual = null;
//            limpiarCampos();
//        } else {
//
//            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado");
//
//        }
//    }  
//  if (inmuActual != null) {
//
//            inmData.eliminarInmueble(inmuActual.getIdInmueble());
//            inmuActual = null;
//            limpiarCampos();
//        } else {
//
//            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado");
//        } 
        if (ocupanteActual!= null) {
    try {
        inquiData.bajaInquilino(Inquilino.getDni());
        ocupanteActual=null;
        limpiarCampos();
        JOptionPane.showMessageDialog(this, "El inquilino ha sido eliminado de la base de datos");
         
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ha ocurrido un error al eliminar el inquilino: " + e.getMessage());
    }
}else{
    JOptionPane.showMessageDialog(this, "No hay un inquilino seleccionado");
}
    }//GEN-LAST:event_jBbajaActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
   
     try {
        int dni = Integer.parseInt(jTdni.getText());
        String apellido = jTapellido.getText();
        String nombre = jTnombre.getText();
        int cuit = Integer.parseInt(jTcuit.getText()); 
        int telefono = Integer.parseInt(jTtelefono.getText());
        String lugarTrabajo = jTlugarTrabajo.getText();
        String tipo = jTtipo.getText();
         Entidades.Inquilino ocupanteActual = inquiData.buscarInquilinoPorDni(dni);
        if (ocupanteActual != null) {
           
            ocupanteActual.setDni(dni);
            ocupanteActual.setApellido(apellido);
            ocupanteActual.setNombre(nombre);
            ocupanteActual.setCuit(cuit);
            ocupanteActual.setTelefono(telefono);
            ocupanteActual.setLugarTrabajo(lugarTrabajo);
            ocupanteActual.setTipo(tipo);

            
            inquiData.modificarInquilino(ocupanteActual);
            JOptionPane.showMessageDialog(this, "El inquilino ha sido modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "No hay un inquilino seleccionado");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un documento válido");
    }
    
      
    }//GEN-LAST:event_jBeditarActionPerformed

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

    private void jTtipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtipoKeyTyped
       
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR LETRAS");
        }
    }//GEN-LAST:event_jTtipoKeyTyped

	
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
			java.util.logging.Logger.getLogger(Inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Inquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Inquilino().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbaja;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTcuit;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTlugarTrabajo;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JTextField jTtipo;
    // End of variables declaration//GEN-END:variables

 
	
}  
    

    

