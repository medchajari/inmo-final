package Vistas;


import AccesoADatos.PropietarioData;
import Entidades.Propietario;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class FormPropietario extends javax.swing.JFrame {
     private PropietarioData propdat = new PropietarioData ();
    private Propietario propietarioActual=null;

    public FormPropietario() {
        initComponents();
    }

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextDNI = new javax.swing.JTextField();
        jTextDomicilio = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jTextId = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioEstado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono-la83-larga.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 130));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Propietario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, 40));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 110, 40));

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 40));

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 100, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 10));

        jLabel5.setText("ID Propietario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel8.setText("DNI");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel9.setText("Domicilio");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel10.setText("Apellido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 180, -1));
        jPanel1.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, -1));
        jPanel1.add(jTextDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 180, -1));
        jPanel1.add(jTextDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, -1));

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, 40));

        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, -1));

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 180, -1));

        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel11.setText("Telefono");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel1.add(jRadioEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        limpiarCampos();   
        propietarioActual=null;        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
         
             // TODO add your handling code here:
                        try {
            Integer dni=Integer.parseInt(jTextDNI.getText());
            String nombre=jTextNombre.getText();
            String apellido=jTextApellido.getText();
            String domicilio=jTextDomicilio.getText();
        if (nombre.isEmpty()||apellido.isEmpty()||domicilio.isEmpty())
            { 
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
                return;
            }
        Integer telefono=Integer.parseInt(jTextTelefono.getText());
        //Integer estado=jRadioEstado;
        Integer estado = jRadioEstado.isSelected() ? 1 : 0;  
        if (propietarioActual==null){
            propietarioActual=new Propietario(nombre,apellido,dni,domicilio,telefono,estado);
            propdat.guardarPropietario(propietarioActual);
            limpiarCampos();
        } else {
            propietarioActual.setNombre(nombre);
            propietarioActual.setApellido(apellido);
            propietarioActual.setDni(dni);
            propietarioActual.setDomicilio(domicilio);
            propietarioActual.setTelefono(telefono);
            propdat.modificarPropietario(propietarioActual);     
            limpiarCampos();
        }
        

        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido.");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (propietarioActual!=null){
            propdat.eliminarPropietario(propietarioActual.getIdPropietario());
            propietarioActual=null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha indicado ningún propietario.");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       // TODO add your handling code here:
        // TODO add your handling code here:
        try {
        Integer dni=Integer.parseInt(jTextDNI.getText());
        propietarioActual=propdat.buscarPropietarioPorDni(dni);
        if (propietarioActual!=null) {
            jTextApellido.setText(propietarioActual.getApellido());
            jTextNombre.setText(propietarioActual.getNombre());
            jTextDomicilio.setText(propietarioActual.getDomicilio());
            jTextTelefono.setText(propietarioActual.getTelefono()+"");
            jTextId.setText(propietarioActual.getIdPropietario()+"");
            //jRadioEstado.setSelected(propietarioActual.getEstado());
            jRadioEstado.setSelected(propietarioActual.getEstado() == 1);
        }
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido.");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FormPropietario().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtonGuardar;
    public javax.swing.JButton jButtonNuevo;
    public javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField jTextApellido;
    public javax.swing.JTextField jTextDNI;
    public javax.swing.JTextField jTextDomicilio;
    public javax.swing.JTextField jTextId;
    public javax.swing.JTextField jTextNombre;
    public javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables

        public void limpiarCampos() {
        this.jTextId.setText(null);
        this.jTextApellido.setText(null);
        this.jTextNombre.setText(null);        
        this.jTextDNI.setText(null);     
        this.jTextDomicilio.setText(null);
        this.jTextTelefono.setText(null);
        //this.jRadioEstado.set
    }

}
