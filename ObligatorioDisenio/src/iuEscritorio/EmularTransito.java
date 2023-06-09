/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuEscritorio;

import Exceptions.NoExiste;
import controlador.ControladorEmularTransito;
import controlador.VistaEmularTransito;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.BonificacionAsignada;
import logica.Fachada;
import logica.Puesto;
import logica.Tarifa;
import logica.Transito;
import logica.UsuarioPropietario;
import logica.Vehiculo;

/**
 *
 * @author sebastianlb
 */
public class EmularTransito extends javax.swing.JDialog implements VistaEmularTransito{

    /**
     * Creates new form EmularTransito
     */
    private ControladorEmularTransito controlador;
    private java.awt.Frame parent;
    public EmularTransito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.setLocationRelativeTo(null);
        this.controlador = new ControladorEmularTransito(this);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPuestos = new javax.swing.JLabel();
        cbPuestos = new javax.swing.JComboBox();
        lblTarifas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTarifas = new javax.swing.JTable();
        lblTarifas1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        tfMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPuestos.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblPuestos.setText("Puestos:");

        cbPuestos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPuestosItemStateChanged(evt);
            }
        });

        lblTarifas.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTarifas.setText("Tarifas:");

        jScrollPane1.setViewportView(tablaTarifas);

        lblTarifas1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTarifas1.setText("Ingrese Matricula:");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTarifas1)
                    .addComponent(lblPuestos)
                    .addComponent(lblTarifas))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbPuestos, tfMatricula});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuestos)
                    .addComponent(cbPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTarifas)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTarifas1)
                            .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)))
                .addGap(48, 48, 48)
                .addComponent(btnCerrar)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPuestosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPuestosItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED && controlador != null) {
                controlador.cargarTarifasPuesto((Puesto) cbPuestos.getSelectedItem());
        }
    }//GEN-LAST:event_cbPuestosItemStateChanged

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Puesto puesto= (Puesto) cbPuestos.getSelectedItem();
        String matricula = tfMatricula.getText();
        controlador.crearTransito(puesto, matricula);
       
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cbPuestos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPuestos;
    private javax.swing.JLabel lblTarifas;
    private javax.swing.JLabel lblTarifas1;
    private javax.swing.JTable tablaTarifas;
    private javax.swing.JTextField tfMatricula;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargarPuestos(ArrayList<Puesto> puestos) {
        cbPuestos.removeAllItems();
        for (Puesto puesto : puestos) {
             cbPuestos.addItem(puesto);
        }
    }
    

    @Override
    public void error(String message) {
        JOptionPane.showMessageDialog(this, message,"Error",JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void exito(Transito t) {
        new TransitoExitoso(this.parent, false, t).setVisible(true);
    }
    

    @Override
    public void cargarTarifasPuesto(ArrayList<Tarifa> tarifas) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Categoria");
        datos.addColumn("Monto");
        
        datos.setRowCount(tarifas.size());
        int fila = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        for(Tarifa t:tarifas){
            datos.setValueAt(t.getCategoria().getNombre(), fila, 0);
            datos.setValueAt(t.getMonto(), fila, 1);
      
            fila++;
       }
        tablaTarifas.setModel(datos);
    }
}
