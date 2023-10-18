/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author MeD Servicios Inf
 */
public class Contrato extends javax.swing.JFrame {

	/**
	 * Creates new form Contrato
	 */
	public Contrato() {
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
                jLabel2 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jLabel3 = new javax.swing.JLabel();
                cbxSeleccionInquilino = new javax.swing.JComboBox<>();
                cbxContratosDelInquilino = new javax.swing.JComboBox<>();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jdcRealizaciondelContrato = new com.toedter.calendar.JDateChooser();
                jSeparator2 = new javax.swing.JSeparator();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jdcInicioContrato = new com.toedter.calendar.JDateChooser();
                jdcFinContrato = new com.toedter.calendar.JDateChooser();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                txtVendedor = new javax.swing.JTextField();
                jSeparator3 = new javax.swing.JSeparator();
                txtGarante = new javax.swing.JTextField();
                jSeparator4 = new javax.swing.JSeparator();
                jSeparator5 = new javax.swing.JSeparator();
                jLabel11 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                btnGuardar = new javax.swing.JButton();
                btnEditar = new javax.swing.JButton();
                btnCancelar = new javax.swing.JButton();
                btnSalir = new javax.swing.JButton();
                rbEstadoContrato = new javax.swing.JRadioButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MeD Servicios Inf\\Documents\\GitHub\\inmo-final\\src\\img\\icono-la83-larga.png")); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 520, 120));

                jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(153, 0, 0));
                jLabel2.setText("CONTRATOS");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

                jSeparator1.setForeground(new java.awt.Color(204, 0, 0));
                jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 470, 10));

                jLabel3.setText("1- Seleccione Inquilino");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

                jPanel1.add(cbxSeleccionInquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, -1));

                jPanel1.add(cbxContratosDelInquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 180, -1));

                jLabel4.setText("2- Contratos del Inquilino ");
                jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

                jLabel5.setText("Fecha De Realizacion del contrato");
                jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
                jPanel1.add(jdcRealizaciondelContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, -1));

                jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
                jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 310, 10));

                jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(196, 107, 107));
                jLabel6.setText("Información del Contrato");
                jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

                jLabel7.setText("Fecha de Inicio");
                jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

                jLabel8.setText("Fecha de Fin");
                jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));
                jPanel1.add(jdcInicioContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, -1));
                jPanel1.add(jdcFinContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 180, -1));

                jLabel9.setText("Vendedor");
                jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

                jLabel10.setText("Garante");
                jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

                txtVendedor.setBorder(null);
                jPanel1.add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 170, -1));
                jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 170, -1));

                txtGarante.setBorder(null);
                jPanel1.add(txtGarante, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 170, 30));
                jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 170, 20));

                jSeparator5.setForeground(new java.awt.Color(153, 0, 0));
                jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 470, -1));

                jLabel11.setText("Propiedades La83 - ULP Red 1 AP - Desarrollo De Aplicaciones JAVA  ");
                jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 770, -1, -1));

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 470, 140));

                btnGuardar.setText("Guardar");
                jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 110, 40));

                btnEditar.setText("Editar");
                jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 700, 110, 40));

                btnCancelar.setText("Cancelar");
                jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, 110, 40));

                btnSalir.setText("Salir");
                jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 100, 40));

                rbEstadoContrato.setText("El contrato esta vigente");
                jPanel1.add(rbEstadoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Contrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Contrato().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancelar;
        private javax.swing.JButton btnEditar;
        private javax.swing.JButton btnGuardar;
        private javax.swing.JButton btnSalir;
        private javax.swing.JComboBox<String> cbxContratosDelInquilino;
        private javax.swing.JComboBox<String> cbxSeleccionInquilino;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JSeparator jSeparator4;
        private javax.swing.JSeparator jSeparator5;
        private javax.swing.JTable jTable1;
        private com.toedter.calendar.JDateChooser jdcFinContrato;
        private com.toedter.calendar.JDateChooser jdcInicioContrato;
        private com.toedter.calendar.JDateChooser jdcRealizaciondelContrato;
        private javax.swing.JRadioButton rbEstadoContrato;
        private javax.swing.JTextField txtGarante;
        private javax.swing.JTextField txtVendedor;
        // End of variables declaration//GEN-END:variables
}
