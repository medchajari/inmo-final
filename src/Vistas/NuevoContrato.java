/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.Conexion;
import AccesoADatos.ContratoData;
import AccesoADatos.InmuebleData;
import AccesoADatos.InquilinoData;
import Entidades.Contrato;
import Entidades.Inmueble;
import Entidades.Inquilino;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class NuevoContrato extends javax.swing.JFrame {
private DefaultTableModel modelo;
private Connection con;
private Contrato cont;
private ContratoData contData;
private ArrayList<Entidades.Inquilino> listarInquilinos;
private ArrayList<Entidades.Inmueble> listaInmuebles;
private ArrayList<Entidades.Contrato> listaContratos;
private InmuebleData inmData;
private Inmueble inm;
private Entidades.Inquilino inq;
private InquilinoData inqData;

private boolean columnasAjustadas = false;
private DefaultTableModel modeloInmueblesLibres;
private DefaultTableModel modeloContratosVigentes;
private Contrato contratoSeleccionado;



	public NuevoContrato(Connection con) {
        this.con = con;	
	
	 }
	
	public NuevoContrato() {
		initComponents();		
		inicializarModelosTabla();	
		
		modelo = new DefaultTableModel();
		inq = new Inquilino();  
		inqData = new InquilinoData(); 
		listarInquilinos = (ArrayList<Entidades.Inquilino>) inqData.listarInquilinos();
		contData = new ContratoData(con);
		cont = new Contrato();			
		inmData = new InmuebleData();		
		
		listaContratos= (ArrayList<Entidades.Contrato>) contData.listarContratosActivos();
		
		cargarInquilinos();
		
		armarCabecera();
		contratosVigentes();
		armarCabeceraVigentes();
		cargaInmueblesDisponibles();
		
		jlRenovarContrato.setVisible(false);
		
		
	}
	
	public void cargarInquilinos(){
		for (Iterator<Inquilino> it = listarInquilinos.iterator(); it.hasNext();) {
			Inquilino i = it.next();
			cbxInquilinos.addItem(i);
		}
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jLabel2 = new javax.swing.JLabel();
                cbxInquilinos = new javax.swing.JComboBox<>();
                jlListainquilino = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tableInmuebles = new javax.swing.JTable();
                btnGuardar = new javax.swing.JButton();
                dateFechaInicioContrato = new com.toedter.calendar.JDateChooser();
                dateFechaFinContrato = new com.toedter.calendar.JDateChooser();
                dateFechaFirmaContrato = new com.toedter.calendar.JDateChooser();
                jlFC = new javax.swing.JLabel();
                jlIC = new javax.swing.JLabel();
                jlFdC = new javax.swing.JLabel();
                jSeparator2 = new javax.swing.JSeparator();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                chbInmueblesLibres = new javax.swing.JCheckBox();
                chbContratosVigentes = new javax.swing.JCheckBox();
                jLabel4 = new javax.swing.JLabel();
                jlRnC = new javax.swing.JLabel();
                btnExtenderContrato = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                btnCancelarContrato = new javax.swing.JButton();
                jlRenovarContrato = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jSeparator4 = new javax.swing.JSeparator();
                jSeparator5 = new javax.swing.JSeparator();
                txtVendedor = new javax.swing.JTextField();
                txtGarante = new javax.swing.JTextField();
                chbOcuparInmueble = new javax.swing.JCheckBox();
                chbDesocuparInmueble = new javax.swing.JCheckBox();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MeD Servicios Inf\\Documents\\GitHub\\inmo-final\\src\\img\\icono-la83-larga.png")); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 130));
                jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 600, 10));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(102, 0, 0));
                jLabel2.setText(" Contratos");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 100, -1));

                cbxInquilinos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbxInquilinosActionPerformed(evt);
                        }
                });
                jPanel1.add(cbxInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 370, -1));

                jlListainquilino.setText("Lista de Inquilinos");
                jPanel1.add(jlListainquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

                tableInmuebles.setModel(new javax.swing.table.DefaultTableModel(
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
                jScrollPane1.setViewportView(tableInmuebles);

                jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 620, 220));

                btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnGuardar.setForeground(new java.awt.Color(0, 51, 51));
                btnGuardar.setText("Obtener Contrato");
                btnGuardar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnGuardarActionPerformed(evt);
                        }
                });
                jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, 50));
                jPanel1.add(dateFechaInicioContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 160, -1));
                jPanel1.add(dateFechaFinContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 150, -1));
                jPanel1.add(dateFechaFirmaContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 160, -1));

                jlFC.setText("Fecha Firma Contrato");
                jPanel1.add(jlFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

                jlIC.setText("Fecha Inicio Contrato");
                jPanel1.add(jlIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

                jlFdC.setText("Fecha Fin Contrato");
                jPanel1.add(jlFdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, -1, -1));
                jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 780, 440, -1));

                jLabel8.setText("Propiedades La83 - ULP Red 1 AP - Desarrollo De Aplicaciones JAVA  ");
                jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 800, -1, -1));
                jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 820, 230, 20));

                chbInmueblesLibres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                chbInmueblesLibres.setText("Lista de inmuebles libres");
                chbInmueblesLibres.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chbInmueblesLibresActionPerformed(evt);
                        }
                });
                jPanel1.add(chbInmueblesLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

                chbContratosVigentes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                chbContratosVigentes.setText("Contratos vigentes");
                chbContratosVigentes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chbContratosVigentesActionPerformed(evt);
                        }
                });
                jPanel1.add(chbContratosVigentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

                jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MeD Servicios Inf\\Documents\\GitHub\\inmo-final\\src\\img\\busqueda-contrato.png")); // NOI18N
                jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 30, 50));

                jlRnC.setForeground(new java.awt.Color(153, 153, 153));
                jlRnC.setText("Realizar un nuevo Contrato...");
                jPanel1.add(jlRnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 180, -1));

                btnExtenderContrato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnExtenderContrato.setForeground(new java.awt.Color(51, 51, 51));
                btnExtenderContrato.setText("Extender Contrato");
                btnExtenderContrato.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnExtenderContratoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnExtenderContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 720, 150, 50));

                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setText("SALIR");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, 150, 50));

                btnCancelarContrato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btnCancelarContrato.setForeground(new java.awt.Color(153, 0, 0));
                btnCancelarContrato.setText("Cancelar Contato");
                btnCancelarContrato.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnCancelarContratoMouseClicked(evt);
                        }
                });
                btnCancelarContrato.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCancelarContratoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnCancelarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 150, 50));

                jlRenovarContrato.setText("Renovar el contrato (Nueva fecha)");
                jPanel1.add(jlRenovarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 190, 30));

                jLabel3.setText("Garante");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

                jLabel5.setText("Vendedor");
                jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, -1, -1));
                jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 200, 20));
                jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 200, 20));

                txtVendedor.setBorder(null);
                jPanel1.add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 200, -1));

                txtGarante.setBorder(null);
                jPanel1.add(txtGarante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 200, -1));

                chbOcuparInmueble.setText("Ocupar el inmueble");
                jPanel1.add(chbOcuparInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

                chbDesocuparInmueble.setText("Desocupar Inmueble");
                jPanel1.add(chbDesocuparInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 17, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void cbxInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxInquilinosActionPerformed

                 // TODO add your handling code here:
        }//GEN-LAST:event_cbxInquilinosActionPerformed

        private void chbInmueblesLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbInmueblesLibresActionPerformed
	 
borrarFilas();
cargaInmueblesDisponibles();
		 cbxInquilinos.setEnabled(true);
		jlRenovarContrato.setVisible(false);
		
		chbContratosVigentes.setSelected(false);
				
		jlListainquilino.setVisible(true);
		jlFC.setVisible(true);
		dateFechaFinContrato.setEnabled(true);
		jlIC.setVisible(true);
		dateFechaInicioContrato.setEnabled(true);
		jlFdC.setVisible(true);
		dateFechaFirmaContrato.setEnabled(true);
		btnGuardar.setEnabled(true);
		jlRnC.setVisible(true);
		btnExtenderContrato.setEnabled(false);
		btnCancelarContrato.setEnabled(false);

  
		tableInmuebles.setModel(modeloInmueblesLibres);

  
                ajustarAnchoColumnas();
        }//GEN-LAST:event_chbInmueblesLibresActionPerformed

        private void chbContratosVigentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbContratosVigentesActionPerformed
       
	borrarFilasVigentes();
	contratosVigentes();
	   chbInmueblesLibres.setSelected(false);
	   cbxInquilinos.setEnabled(false);
	   jlRenovarContrato.setVisible(true);
	   jlListainquilino.setVisible(false);
	   
	   jlFC.setVisible(false);
	   dateFechaFinContrato.setVisible(true);
	   jlIC.setVisible(false);
	   dateFechaInicioContrato.setEnabled(false);
	   jlFdC.setVisible(false);
	   dateFechaFirmaContrato.setEnabled(false);
	   btnGuardar.setEnabled(false);
	   jlRnC.setVisible(false);
	   btnExtenderContrato.setEnabled(true);
	   btnCancelarContrato.setEnabled(true);
           

   
	   tableInmuebles.setModel(modeloContratosVigentes);

 
	   ajustarAnchoColumnas();
        }//GEN-LAST:event_chbContratosVigentesActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();                // TODO add your handling code here:
        }//GEN-LAST:event_jButton1ActionPerformed

        private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
	try {
        con = Conexion.getConexion();

        
        Inquilino inquilinoSeleccionado = (Inquilino) cbxInquilinos.getSelectedItem();
        Inmueble idInmuebleContrato = (Inmueble) obtenerInmuebleSeleccionadoDeTabla();

       
        if (idInmuebleContrato == null) {
            JOptionPane.showMessageDialog(null, "El contrato no tiene un inmueble asociado. Asegúrate de establecer el inmueble antes de crear el contrato.");
            return; 
        }

        Date fechaRealizacion = (Date) dateFechaFirmaContrato.getDate();
        java.sql.Date sqlFechaRealizacion = new java.sql.Date(fechaRealizacion.getTime());

        Date fechaInicio = (Date) dateFechaInicioContrato.getDate();
        java.sql.Date sqlFechaInicio = new java.sql.Date(fechaInicio.getTime());

        Date fechaFin = (Date) dateFechaFinContrato.getDate();
        java.sql.Date sqlFechaFin = new java.sql.Date(fechaFin.getTime());

        String garante = txtGarante.getText();
        String vendedor = txtVendedor.getText();

        
        Contrato nuevoContrato = new Contrato();

       
        nuevoContrato.setOcupante(inquilinoSeleccionado);
        nuevoContrato.setInmueble(idInmuebleContrato);
        nuevoContrato.setFechaRealizacion(sqlFechaRealizacion);
        nuevoContrato.setFechaInicio(sqlFechaInicio);
        nuevoContrato.setFechaFin(sqlFechaFin);
        nuevoContrato.setGarante(garante);
        nuevoContrato.setVendedor(vendedor);

        
        contData.crearContrato(nuevoContrato);

        
        if (chbOcuparInmueble.isSelected()) {
           
            int idInmueble = idInmuebleContrato.getIdInmueble();
           
            int idInquilino = inquilinoSeleccionado.getIdInquilino();
            
            inmData.alquilarInmueble(idInmueble, idInquilino);
	   
	    
        }

       
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al crear el contrato: " + e.getMessage());
    }  
}


private Inmueble obtenerInmuebleSeleccionadoDeTabla() {
	int filaSeleccionada = tableInmuebles.getSelectedRow();
    
    if (filaSeleccionada != -1) {
        int idInmueble = (int) tableInmuebles.getValueAt(filaSeleccionada, 0); 

        
        for (Inmueble inmueble : listaInmuebles) {
            if (inmueble.getIdInmueble() == idInmueble) {
                return inmueble; 
            }
        }
    }
    
    return null;
		
        }//GEN-LAST:event_btnGuardarActionPerformed



        private void btnCancelarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarContratoActionPerformed
    try {
        con = Conexion.getConexion();

        int filaSeleccionada = tableInmuebles.getSelectedRow();

        if (filaSeleccionada != -1) {
           
            int idContrato = (int) tableInmuebles.getValueAt(filaSeleccionada, 0); 

            
            ContratoData contratoManager = new ContratoData(con);

            contratoManager.cancelarContrato(idContrato);

            if (chbDesocuparInmueble.isSelected()) {
             
                InmuebleData inmuebleManager = new InmuebleData();
               
                contratoManager.desocuparInmueble(idContrato);
            }

           
            borrarFilasVigentes();
borrarFilas();
	
         
            contratosVigentes();
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un contrato para cancelar.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al cancelar el contrato: " + e.getMessage());
    }
        }//GEN-LAST:event_btnCancelarContratoActionPerformed

        private void btnCancelarContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarContratoMouseClicked
            // TODO add your handling code here:
        }//GEN-LAST:event_btnCancelarContratoMouseClicked

        private void btnExtenderContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtenderContratoActionPerformed
            try {
        con = Conexion.getConexion();

        int filaSeleccionada = tableInmuebles.getSelectedRow();

        if (filaSeleccionada != -1) {
            
            int idContrato = (int) tableInmuebles.getValueAt(filaSeleccionada, 0); 

           
            java.util.Date utilDate = dateFechaFinContrato.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

           
            ContratoData contratoManager = new ContratoData(con);

           
            contratoManager.renovarContrato(idContrato, sqlDate);

           
            borrarFilasVigentes();

            contratosVigentes();
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un contrato para extender.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al extender el contrato: " + e.getMessage());
    }
        }//GEN-LAST:event_btnExtenderContratoActionPerformed

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
			java.util.logging.Logger.getLogger(NuevoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NuevoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NuevoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NuevoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NuevoContrato().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancelarContrato;
        private javax.swing.JButton btnExtenderContrato;
        private javax.swing.JButton btnGuardar;
        private javax.swing.JComboBox<Inquilino> cbxInquilinos;
        private javax.swing.JCheckBox chbContratosVigentes;
        private javax.swing.JCheckBox chbDesocuparInmueble;
        private javax.swing.JCheckBox chbInmueblesLibres;
        private javax.swing.JCheckBox chbOcuparInmueble;
        private com.toedter.calendar.JDateChooser dateFechaFinContrato;
        private com.toedter.calendar.JDateChooser dateFechaFirmaContrato;
        private com.toedter.calendar.JDateChooser dateFechaInicioContrato;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JSeparator jSeparator4;
        private javax.swing.JSeparator jSeparator5;
        private javax.swing.JLabel jlFC;
        private javax.swing.JLabel jlFdC;
        private javax.swing.JLabel jlIC;
        private javax.swing.JLabel jlListainquilino;
        private javax.swing.JLabel jlRenovarContrato;
        private javax.swing.JLabel jlRnC;
        private javax.swing.JTable tableInmuebles;
        private javax.swing.JTextField txtGarante;
        private javax.swing.JTextField txtVendedor;
        // End of variables declaration//GEN-END:variables
private void borrarFilas(){
		if(modeloInmueblesLibres != null){
		int a = modeloInmueblesLibres.getRowCount() -1;
		
		for(int i = a; i>= 0; i--){
		modeloInmueblesLibres.removeRow(i);
		}
		}
	}

private void borrarFilasVigentes(){
		if(modeloContratosVigentes != null){
		int a = modeloContratosVigentes.getRowCount() -1;
		
		for(int i = a; i>= 0; i--){
		modeloContratosVigentes.removeRow(i);
		}
		}
	}

private  void armarCabecera(){

		ArrayList<Object> columnas = new ArrayList<Object>();		
		
		
		
		for(Object it : columnas){
			modeloInmueblesLibres.addColumn(it);
		}
		//cargo a tabla
		
		tableInmuebles.setModel(modeloInmueblesLibres);
		
		
	}

private  void armarCabeceraVigentes(){
	
		ArrayList<Object> columnasV = new ArrayList<Object>();
		
		for(Object it : columnasV){
			modeloContratosVigentes.addColumn(it);
		}
		//cargo a tabla
		
		tableInmuebles.setModel(modeloContratosVigentes);
		
		
	}
public void contratosVigentes(){
        
        //Llenar filas
	
        ContratoData conD = new ContratoData(con);
        listaContratos = (ArrayList)conD.listarContratosActivos();
        DefaultTableModel modeloActual;
    
	 // Determinar modelo de tabla se debe utilizar
	if (chbContratosVigentes.isSelected()) {
        modeloActual = modeloContratosVigentes;
	 } else {
        modeloActual = modelo;
    }
        for(Entidades.Contrato m:listaContratos){
        
            modeloActual.addRow(new Object[]{m.getIdContrato(),m.getIdInmueble(),m.getOcupante(),m.getFechaInicio(),m.getFechaFin(),m.getGarante(),m.getVendedor()});
		}
	}



public void cargaInmueblesDisponibles(){
        
     // Llenar filas
    InmuebleData ind = new InmuebleData();
    listaInmuebles = (ArrayList) ind.listarInmuebles();
    
    DefaultTableModel modeloActual;
    
    if (chbInmueblesLibres.isSelected()) {
        
       
            modeloActual = modeloInmueblesLibres;
           
        
    } if (chbContratosVigentes.isSelected()) {
        modeloActual = modeloContratosVigentes;
    } else {
        
        modeloActual = modeloInmueblesLibres;
    }
    
    for (Inmueble m : listaInmuebles) {
        modeloActual.addRow(new Object[]{m.getIdInmueble(), m.getZona(), m.getSuperficieMinima(), m.getPrecio(), m.getCaracteristicas()});
    }
	}


// PRUEBA TABLAS //



private void inicializarModelosTabla() {
    
    modeloInmueblesLibres = new DefaultTableModel();
    modeloInmueblesLibres.addColumn("id Inm");
    modeloInmueblesLibres.addColumn("Zona");
    modeloInmueblesLibres.addColumn("Mts2");
    modeloInmueblesLibres.addColumn("Precio");
    modeloInmueblesLibres.addColumn("Caracteristicas");
    
    // Modelo de tabla para contratos vigentes
    modeloContratosVigentes = new DefaultTableModel();
    modeloContratosVigentes.addColumn("Id Con");
    modeloContratosVigentes.addColumn("Id Inm");
    modeloContratosVigentes.addColumn("Ocupante");
    modeloContratosVigentes.addColumn("FechaInicio");
    modeloContratosVigentes.addColumn("FechaFin");
    modeloContratosVigentes.addColumn("Garante");
    modeloContratosVigentes.addColumn("Vendedor");
    
    
}

private void ajustarAnchoColumnas() {
    // Ajustar el ancho de las columnas de la tabla de inmuebles libres
    TableColumnModel columnModelInmueblesLibres = tableInmuebles.getColumnModel();
    columnModelInmueblesLibres.getColumn(0).setPreferredWidth(10);  // Ajusta el ancho de la primera columna
    columnModelInmueblesLibres.getColumn(1).setPreferredWidth(30); // Ajusta el ancho de la segunda columna
    columnModelInmueblesLibres.getColumn(2).setPreferredWidth(30);  // Ajusta el ancho de la tercera columna
    columnModelInmueblesLibres.getColumn(3).setPreferredWidth(20);  // Ajusta el ancho de la cuarta columna
    columnModelInmueblesLibres.getColumn(4).setPreferredWidth(450); // Ajusta el ancho de la quinta columna

    // Ajustar el ancho de las columnas de la tabla de contratos vigentes
    TableColumnModel columnModelContratosVigentes = tableInmuebles.getColumnModel(); // Debes cambiar esto
    columnModelContratosVigentes.getColumn(0).setPreferredWidth(15);
    columnModelContratosVigentes.getColumn(1).setPreferredWidth(15); // Ajusta el ancho de la primera columna
    columnModelContratosVigentes.getColumn(2).setPreferredWidth(150);  // Ajusta el ancho de la segunda columna
    columnModelContratosVigentes.getColumn(3).setPreferredWidth(70);  // Ajusta el ancho de la tercera columna
    columnModelContratosVigentes.getColumn(4).setPreferredWidth(70);  // Ajusta el ancho de la cuarta columna
    columnModelContratosVigentes.getColumn(5).setPreferredWidth(180);  // Ajusta el ancho de la quinta columna
    columnModelContratosVigentes.getColumn(6).setPreferredWidth(180);  // Ajusta el ancho de la sexta columna
}




}
