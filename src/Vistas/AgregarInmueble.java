/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.InmuebleData;
import Entidades.Inmueble;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.util.ArrayList;
import java.util.List;


public class AgregarInmueble extends javax.swing.JFrame {

    private Connection con;
    private Inmueble inmuActual ;
     private InmuebleData id = new InmuebleData();
    private  Propietario prop;
    private ArrayList<Inmueble> listadoInmuebles;
    
    public AgregarInmueble(Connection con) {
        this.con = con;	
	 }
    
    public AgregarInmueble() {
        initComponents();
        cargarComboTipo();
        cargarComboZona();
        limpiarCampos();
        
        id =new InmuebleData();
         listadoInmuebles = (ArrayList<Inmueble>)id.listarInmueblePorId();
    }
    
     private String [] zona = {"NORTE", "ESTE", "OESTE", "CENTRO", "SUR"};
     private String [] tipoInmueble = {"CASA", "DEPARTAMENTO", "PH", "MONOAMBIENTE", "DUPLEX", "TERRENO", "LOCAL", "COMPLEJO", "OFICINA", "COCHERA", "DEPOSITO", "CABAÑA"};
     private DefaultTableModel modeloAgregarInmueble = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
        };

    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel2 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                jLGrandeimagen = new javax.swing.JLabel();
                jLagregarInmueble = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jSeparator2 = new javax.swing.JSeparator();
                jTFidProp = new javax.swing.JTextField();
                jTFcaract = new javax.swing.JTextField();
                jTFdire = new javax.swing.JTextField();
                jTFprecio = new javax.swing.JTextField();
                jTFrevisor = new javax.swing.JTextField();
                jTFsuperf = new javax.swing.JTextField();
                jTFobserv = new javax.swing.JTextField();
                jBagregar = new javax.swing.JButton();
                jBsalir = new javax.swing.JButton();
                jLidProp = new javax.swing.JLabel();
                jLcaract = new javax.swing.JLabel();
                jLdire = new javax.swing.JLabel();
                jLzona = new javax.swing.JLabel();
                jLtipInm = new javax.swing.JLabel();
                jCBtipoInmu = new javax.swing.JComboBox<>();
                jCBzona = new javax.swing.JComboBox<>();
                jLprecio = new javax.swing.JLabel();
                jLrevisor = new javax.swing.JLabel();
                jLsuperficie = new javax.swing.JLabel();
                jLobser = new javax.swing.JLabel();
                jLestado = new javax.swing.JLabel();
                jBLIMPIAR = new javax.swing.JButton();
                jBmodificar = new javax.swing.JButton();
                jTFestado = new javax.swing.JTextField();
                jLidInmueble = new javax.swing.JLabel();
                jTFidInmueble = new javax.swing.JTextField();
                jBBUSCAR = new javax.swing.JButton();

                jLabel2.setText("jLabel2");

                jButton1.setText("limpiar");

                jButton2.setText("BUSCAR");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLGrandeimagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\MeD Servicios Inf\\Documents\\GitHub\\inmo-final\\src\\img\\icono-la83-larga.png")); // NOI18N
                jPanel1.add(jLGrandeimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 120));

                jLagregarInmueble.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLagregarInmueble.setForeground(new java.awt.Color(255, 0, 0));
                jLagregarInmueble.setText("Agregar inmueble");
                jPanel1.add(jLagregarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, -1));
                jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));
                jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 20));

                jTFidProp.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTFidPropActionPerformed(evt);
                        }
                });
                jTFidProp.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFidPropKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFidProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 50, -1));

                jTFcaract.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFcaractKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFcaract, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 290, -1));

                jTFdire.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTFdireActionPerformed(evt);
                        }
                });
                jTFdire.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFdireKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFdire, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 290, -1));

                jTFprecio.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFprecioKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 70, -1));

                jTFrevisor.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFrevisorKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFrevisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 180, -1));

                jTFsuperf.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTFsuperfActionPerformed(evt);
                        }
                });
                jTFsuperf.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFsuperfKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFsuperf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 70, -1));

                jTFobserv.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFobservKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFobserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 300, -1));

                jBagregar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
                jBagregar.setForeground(new java.awt.Color(255, 51, 51));
                jBagregar.setText("AGREGAR");
                jBagregar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBagregarActionPerformed(evt);
                        }
                });
                jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

                jBsalir.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
                jBsalir.setForeground(new java.awt.Color(51, 51, 255));
                jBsalir.setText("SALIR");
                jBsalir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBsalirActionPerformed(evt);
                        }
                });
                jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

                jLidProp.setText("ID PROPIETARIO");
                jPanel1.add(jLidProp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

                jLcaract.setText("CARACTERISTICAS");
                jPanel1.add(jLcaract, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

                jLdire.setText("DIRECCION");
                jPanel1.add(jLdire, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

                jLzona.setText("ZONA:");
                jPanel1.add(jLzona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

                jLtipInm.setText("TIPO INMUEBLE:");
                jPanel1.add(jLtipInm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

                jPanel1.add(jCBtipoInmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

                jCBzona.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCBzonaActionPerformed(evt);
                        }
                });
                jPanel1.add(jCBzona, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

                jLprecio.setText("PRECIO");
                jPanel1.add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

                jLrevisor.setText("REVISOR:");
                jPanel1.add(jLrevisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

                jLsuperficie.setText("SUPERFICIE:");
                jPanel1.add(jLsuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

                jLobser.setText("OBSERVACIONES:");
                jPanel1.add(jLobser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

                jLestado.setText("ESTADO:");
                jPanel1.add(jLestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, -1));

                jBLIMPIAR.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
                jBLIMPIAR.setForeground(new java.awt.Color(255, 51, 51));
                jBLIMPIAR.setText("LIMPIAR");
                jBLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBLIMPIARActionPerformed(evt);
                        }
                });
                jPanel1.add(jBLIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

                jBmodificar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
                jBmodificar.setForeground(new java.awt.Color(255, 0, 51));
                jBmodificar.setText("MODIFICAR");
                jBmodificar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBmodificarActionPerformed(evt);
                        }
                });
                jPanel1.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 100, -1));

                jTFestado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTFestadoActionPerformed(evt);
                        }
                });
                jTFestado.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFestadoKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 40, -1));

                jLidInmueble.setText(" ID INMUEBLE:");
                jPanel1.add(jLidInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 20));

                jTFidInmueble.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTFidInmuebleActionPerformed(evt);
                        }
                });
                jTFidInmueble.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                jTFidInmuebleKeyTyped(evt);
                        }
                });
                jPanel1.add(jTFidInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 40, -1));

                jBBUSCAR.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
                jBBUSCAR.setForeground(new java.awt.Color(255, 0, 0));
                jBBUSCAR.setText("BUSCAR");
                jBBUSCAR.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBBUSCARActionPerformed(evt);
                        }
                });
                jPanel1.add(jBBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jCBzonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBzonaActionPerformed
         modeloAgregarInmueble.setRowCount(0);

        String inm = (String) jCBzona.getSelectedItem();
    }//GEN-LAST:event_jCBzonaActionPerformed

    private void jTFidPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidPropActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
         dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
         
         try {
        int idPropietario = 0;
        int estado = 0;
        float precio = 0;
        int superficie = 0;

        String caracteristicas = jTFcaract.getText();
        String direccion = jTFdire.getText();
        String tipo = (String) jCBtipoInmu.getSelectedItem();
        String zona = (String) jCBzona.getSelectedItem();
        String revisor = jTFrevisor.getText();
        String observaciones = jTFobserv.getText();

        if (!jTFidProp.getText().isEmpty()) {
            if (esValorNumericoValido(jTFidProp.getText())) {
                idPropietario = Integer.parseInt(jTFidProp.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de ID Propietario debe contener un valor numérico válido.");
                return; 
            }
        }

        if (!jTFestado.getText().isEmpty()) {
            if (esValorNumericoValido(jTFestado.getText())) {
                estado = Integer.parseInt(jTFestado.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de Estado debe contener un valor numérico válido.");
                return; 
            }
        }

        if (!jTFprecio.getText().isEmpty()) {
            if (esValorNumericoValido(jTFprecio.getText())) {
                precio = Float.parseFloat(jTFprecio.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de Precio debe contener un valor numérico válido.");
                return; 
            }
        }

        if (!jTFsuperf.getText().isEmpty()) {
            if (esValorNumericoValido(jTFsuperf.getText())) {
                superficie = Integer.parseInt(jTFsuperf.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de Superficie debe contener un valor numérico válido.");
                return; 
            }
        }

        if (caracteristicas.isEmpty() || direccion.isEmpty() || revisor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de Características, Dirección y Revisor no pueden estar vacíos.");
        } else {
            if (inmuActual == null) {
                
                Inmueble nuevoInmueble = new Inmueble();
                nuevoInmueble.setIdPropietario(idPropietario);
                nuevoInmueble.setCaracteristicas(caracteristicas);
                nuevoInmueble.setDireccion(direccion);
                nuevoInmueble.setTipoInmueble(tipo);
                nuevoInmueble.setZona(zona);
                nuevoInmueble.setPrecio(precio);
                nuevoInmueble.setRevisor(revisor);
                nuevoInmueble.setSuperficieMinima(superficie);
                nuevoInmueble.setObservaciones(observaciones);
                nuevoInmueble.setEstado(estado);
                
                id.crearInmueble(nuevoInmueble);
                JOptionPane.showMessageDialog(this, "El inmueble ha sido creado exitosamente.");
            } else {
               
                inmuActual.setIdPropietario(idPropietario);
                inmuActual.setCaracteristicas(caracteristicas);
                inmuActual.setDireccion(direccion);
                inmuActual.setTipoInmueble(tipo);
                inmuActual.setZona(zona);
                inmuActual.setPrecio(precio);
                inmuActual.setRevisor(revisor);
                inmuActual.setSuperficieMinima(superficie);
                inmuActual.setObservaciones(observaciones);
                inmuActual.setEstado(estado);

                id.modificarInmueble(inmuActual);
                JOptionPane.showMessageDialog(this, "El inmueble ha sido modificado exitosamente");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos válidos en los campos numéricos.");
    }
           
    }//GEN-LAST:event_jBagregarActionPerformed


    
    private void jBLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLIMPIARActionPerformed
        limpiarCampos();
        inmuActual = null;
    }//GEN-LAST:event_jBLIMPIARActionPerformed

    private void jTFidPropKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidPropKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_jTFidPropKeyTyped

    private void jTFprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFprecioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS ");
        }
    }//GEN-LAST:event_jTFprecioKeyTyped

    private void jTFsuperfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFsuperfKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_jTFsuperfKeyTyped

    private void jTFcaractKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcaractKeyTyped
        
    }//GEN-LAST:event_jTFcaractKeyTyped

    private void jTFdireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFdireKeyTyped
        
    }//GEN-LAST:event_jTFdireKeyTyped

    private void jTFrevisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFrevisorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR LETRAS");
        }
    }//GEN-LAST:event_jTFrevisorKeyTyped

    private void jTFobservKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFobservKeyTyped
        
        
    }//GEN-LAST:event_jTFobservKeyTyped

    private void jTFsuperfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFsuperfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFsuperfActionPerformed

    private void jTFdireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFdireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFdireActionPerformed

    private void jTFestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFestadoActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
     try {
        int idPropietario = 0;
        int precio = 0;
        int superficie = 0;

        String caracteristicas = jTFcaract.getText();
        String direccion = jTFdire.getText();
        String zona = (String) jCBzona.getSelectedItem();
        String tipoInmueble = (String) jCBtipoInmu.getSelectedItem();
        String revisor = jTFrevisor.getText();
        String observaciones = jTFobserv.getText();

        if (!jTFidProp.getText().isEmpty()) {
            if (esValorNumericoValido(jTFidProp.getText())) {
                idPropietario = Integer.parseInt(jTFidProp.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de ID Propietario debe contener un valor numérico válido.");
                return; 
            }
        }

        if (!jTFprecio.getText().isEmpty()) {
            if (esValorNumericoValido(jTFprecio.getText())) {
                precio = Integer.parseInt(jTFprecio.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de Precio debe contener un valor numérico válido.");
                return; 
            }
        }

        if (!jTFsuperf.getText().isEmpty()) {
            if (esValorNumericoValido(jTFsuperf.getText())) {
                superficie = Integer.parseInt(jTFsuperf.getText());
            } else {
                JOptionPane.showMessageDialog(this, "El campo de Superficie debe contener un valor numérico válido.");
                return;
            }
        }

        
        if (caracteristicas.isEmpty() || direccion.isEmpty() || revisor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de Características, Dirección y Revisor no pueden estar vacíos.");
        } else {
            if (inmuActual != null) {
              
                inmuActual.setIdPropietario(idPropietario);
                inmuActual.setCaracteristicas(caracteristicas);
                inmuActual.setDireccion(direccion);
                inmuActual.setZona(zona);
                inmuActual.setTipoInmueble(tipoInmueble);
                inmuActual.setPrecio(precio);
                inmuActual.setRevisor(revisor);
                inmuActual.setSuperficieMinima(superficie);
                inmuActual.setObservaciones(observaciones);

              
                id.modificarInmueble(inmuActual);

                JOptionPane.showMessageDialog(this, "El inmueble ha sido modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(this, "No hay un inmueble seleccionado");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos válidos en los campos numéricos.");
    }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private boolean esValorNumericoValido(String valor) {
       try {
        Integer.parseInt(valor);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
	}
    
    private void jTFidInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidInmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidInmuebleActionPerformed

    private void jTFidInmuebleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFidInmuebleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidInmuebleKeyTyped

    private void jBBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBUSCARActionPerformed
        
try{   
        int idInm = Integer.parseInt (jTFidInmueble.getText());
        
        inmuActual = id.buscarInmueblePorId(idInm);

        if (inmuActual != null){
            int estado = inmuActual.getEstado();
            jTFestado.setText(Integer.toString(estado));
            int idPropietario = inmuActual.getPropietario().getIdPropietario();
            jTFidProp.setText(Integer.toString(idPropietario)); 
            jTFcaract.setText(inmuActual.getCaracteristicas());
            jTFdire.setText(inmuActual.getDireccion());
            jCBzona.setSelectedItem(inmuActual.getZona());
            jCBtipoInmu.setSelectedItem(inmuActual.getTipoInmueble());
            float precio = inmuActual.getPrecio();
            jTFprecio.setText(Float.toString(precio));
            jTFrevisor.setText(inmuActual.getRevisor());
            int superficieMinima = inmuActual.getSuperficieMinima();
            jTFsuperf.setText(Integer.toString(superficieMinima));
            jTFobserv.setText(inmuActual.getObservaciones());
            
          
     
     } else {
            JOptionPane.showMessageDialog(this, "El INMUEBLE buscado no existe en la base de datos");
            limpiarCampos();
        }
    } catch (NumberFormatException ex) {    
         JOptionPane.showMessageDialog(this, "Debe ingresar un idInmueble válido");
     } 

    }//GEN-LAST:event_jBBUSCARActionPerformed

    private void jTFestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFestadoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO PUEDE INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_jTFestadoKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarInmueble().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jBBUSCAR;
        private javax.swing.JButton jBLIMPIAR;
        private javax.swing.JButton jBagregar;
        private javax.swing.JButton jBmodificar;
        private javax.swing.JButton jBsalir;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JComboBox<String> jCBtipoInmu;
        private javax.swing.JComboBox<String> jCBzona;
        private javax.swing.JLabel jLGrandeimagen;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLagregarInmueble;
        private javax.swing.JLabel jLcaract;
        private javax.swing.JLabel jLdire;
        private javax.swing.JLabel jLestado;
        private javax.swing.JLabel jLidInmueble;
        private javax.swing.JLabel jLidProp;
        private javax.swing.JLabel jLobser;
        private javax.swing.JLabel jLprecio;
        private javax.swing.JLabel jLrevisor;
        private javax.swing.JLabel jLsuperficie;
        private javax.swing.JLabel jLtipInm;
        private javax.swing.JLabel jLzona;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JTextField jTFcaract;
        private javax.swing.JTextField jTFdire;
        private javax.swing.JTextField jTFestado;
        private javax.swing.JTextField jTFidInmueble;
        private javax.swing.JTextField jTFidProp;
        private javax.swing.JTextField jTFobserv;
        private javax.swing.JTextField jTFprecio;
        private javax.swing.JTextField jTFrevisor;
        private javax.swing.JTextField jTFsuperf;
        // End of variables declaration//GEN-END:variables

private void cargarComboTipo(){
     for(int i = 0; i < tipoInmueble.length; i++){
         jCBtipoInmu.addItem(tipoInmueble[i]);
       }
}
private void cargarComboZona(){
          for(int i = 0; i < zona.length; i++){
         jCBzona.addItem(zona[i]);
       }  
}

private void limpiarCampos() {
        jTFidInmueble.setText("");
        jTFestado.setText("");
        jTFidProp.setText("");
        jTFcaract.setText("");
        jTFdire.setText("");
        jCBtipoInmu.setSelectedItem("");
        jCBzona.setSelectedItem("");
        jCBzona.setSelectedItem(true);
        jCBtipoInmu.setSelectedItem(true);
        jTFprecio.setText("");
        jTFrevisor.setText("");
        jTFsuperf.setText("");
        jTFobserv.setText("");
         
//        
        
    }

}
