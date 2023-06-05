/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuEscritorio;

import controlador.ControladorTableroDeControl;
import controlador.VistaTableroDeControl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.BonificacionAsignada;
import logica.Fachada;
import logica.Notificacion;
import logica.Transito;
import logica.UsuarioPropietario;
import logica.Recarga;
import observador.Observable;
import observador.Observador;
import logica.Recarga.EstadoRec;
import logica.Vehiculo;

/**
 *
 * @author sebastianlb
 */
public class TableroDeControl extends javax.swing.JFrame implements VistaTableroDeControl{

    private UsuarioPropietario usuario;
    /**
     * Creates new form TableroDeControl
     */
    private ControladorTableroDeControl controlador;
    
    public TableroDeControl(UsuarioPropietario u) {
        initComponents();
        this.usuario = u;
        this.controlador = new ControladorTableroDeControl(usuario, this);
       
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNombreUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        l1 = new javax.swing.JLabel();
        lSaldoUsuario = new javax.swing.JLabel();
        lCantVehiculos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        lCantTransitos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTransitos = new javax.swing.JTable();
        lCantRecargas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRecargas = new javax.swing.JTable();
        btnRecargar = new javax.swing.JButton();
        lCantBonificaciones = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBonificaciones = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaNotificaciones = new javax.swing.JTable();
        lCantNotificaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1051, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lNombreUsuario.setText("Nombre Usuario");

        l1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(84, 130, 53));
        l1.setText("$");

        lSaldoUsuario.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lSaldoUsuario.setForeground(new java.awt.Color(84, 130, 53));
        lSaldoUsuario.setText("saldo usuario");

        lCantVehiculos.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantVehiculos.setText("cVe");

        tablaVehiculos.setMinimumSize(new java.awt.Dimension(60, 60));
        tablaVehiculos.setPreferredSize(new java.awt.Dimension(300, 60));
        jScrollPane1.setViewportView(tablaVehiculos);

        lCantTransitos.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantTransitos.setText("cTr");

        jScrollPane2.setViewportView(tablaTransitos);

        lCantRecargas.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantRecargas.setText("cRe");

        jScrollPane3.setViewportView(tblRecargas);

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        lCantBonificaciones.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantBonificaciones.setText("cBo");

        jScrollPane4.setViewportView(tablaBonificaciones);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(tablaNotificaciones);

        lCantNotificaciones.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantNotificaciones.setText("cNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(538, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(464, 464, 464))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCantNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lCantRecargas)
                                    .addComponent(lCantTransitos)
                                    .addComponent(lCantBonificaciones)
                                    .addComponent(lCantVehiculos)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRecargar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(l1)
                        .addGap(6, 6, 6)
                        .addComponent(lSaldoUsuario)
                        .addGap(765, 765, 765)
                        .addComponent(lNombreUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1)
                    .addComponent(lSaldoUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lNombreUsuario)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCantVehiculos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCantBonificaciones)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCantTransitos)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lCantRecargas)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCantNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
         new RecargarSaldo(usuario).setVisible(true);
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    
    
   


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lCantBonificaciones;
    private javax.swing.JLabel lCantNotificaciones;
    private javax.swing.JLabel lCantRecargas;
    private javax.swing.JLabel lCantTransitos;
    private javax.swing.JLabel lCantVehiculos;
    private javax.swing.JLabel lNombreUsuario;
    private javax.swing.JLabel lSaldoUsuario;
    private javax.swing.JTable tablaBonificaciones;
    private javax.swing.JTable tablaNotificaciones;
    private javax.swing.JTable tablaTransitos;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTable tblRecargas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void remplazarLabels(UsuarioPropietario u, ArrayList<Transito> t, ArrayList<BonificacionAsignada> b,ArrayList<Recarga> r,ArrayList<Notificacion> n) {
        lNombreUsuario.setText(u.getNombreCompleto());
        lSaldoUsuario.setText(""+u.getSaldo());
        lCantVehiculos.setText(""+u.getVehiculos().size());
        lCantTransitos.setText(""+t.size());
        lCantBonificaciones.setText(""+b.size());
        lCantRecargas.setText(""+r.size());
        lCantNotificaciones.setText(""+n.size());
    }

    @Override
    public void mostrarVehiculos(ArrayList<Vehiculo> vehiculos) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Matricula");
        datos.addColumn("Categoria");
        datos.addColumn("Modelo");
        datos.addColumn("Color");
        datos.addColumn("#Transitos");
        datos.addColumn("Monto Total");
     
        datos.setRowCount(vehiculos.size());
        int fila = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        for(Vehiculo v:usuario.getVehiculos()){
            datos.setValueAt(v.getMatricula(), fila, 0);
            datos.setValueAt(v.getCategoria().getNombre(), fila, 1);
            datos.setValueAt(v.getModelo(), fila, 2);
            datos.setValueAt(v.getColor(), fila, 3);
            datos.setValueAt("1", fila, 4);
            datos.setValueAt("400", fila, 5);
            fila++;
        }
        tablaVehiculos.setModel(datos);
    }

    @Override
    public void mostrarTransitos(ArrayList<Transito> transitos) {
      DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Puesto");
        datos.addColumn("Matricula");
        datos.addColumn("Tarifa");
        datos.addColumn("Tarifa (Monto)");
        datos.addColumn("Bonificacion");
        datos.addColumn("Bonificacion (Monto)");
        datos.addColumn("Monto Pagado");
        datos.addColumn("Fecha");
     
        datos.setRowCount(transitos.size());
        int fila = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        for(Transito t:transitos){
            datos.setValueAt(t.getPuesto().getNombre(), fila, 0);
            datos.setValueAt(t.getVehiculo().getMatricula(), fila, 1);
            datos.setValueAt(t.getTarifa().getNombre(), fila, 2);
            datos.setValueAt(t.getTarifa().getMonto(), fila, 3);
            datos.setValueAt(t.getBonificacion() != null ? t.getBonificacion().getBonificacion().getNombre() : "", fila, 4);
            datos.setValueAt("", fila, 5);
            datos.setValueAt(t.getMontoPagado(), fila, 6);
            datos.setValueAt(sdf.format(t.getFechaIngreso()), fila, 7);
            
      
            fila++;
       }
       tablaTransitos.setModel(datos);
    }

    @Override
    public void mostrarRecargas(ArrayList<Recarga> recargas) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Fecha Recarga");
        datos.addColumn("Monto");
        datos.addColumn("Estado");
        datos.addColumn("Administrador");


        datos.setRowCount(recargas.size());
        int fila = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        for(Recarga r:recargas){
            datos.setValueAt(sdf.format(r.getFecha()), fila, 0);
            datos.setValueAt(r.getMonto(), fila, 1);
            datos.setValueAt(r.getEstado(), fila, 2);
            if(r.getAdmin()!=null){
                datos.setValueAt(r.getAdmin().getNombreCompleto(), fila, 3);
            }
            fila++;
       }
       tblRecargas.setModel(datos);
    }

    @Override
    public void mostrarBonificacionesAsignadas(ArrayList<BonificacionAsignada> bonificaciones) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Bonif Nombre");
        datos.addColumn("Puesto");
        datos.addColumn("Fecha Asignada");
        
        datos.setRowCount(bonificaciones.size());
        int fila = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        for(BonificacionAsignada b:bonificaciones){
            datos.setValueAt(b.getBonificacion().getNombre(), fila, 0);
            datos.setValueAt(b.getPuesto().getNombre(), fila, 1);
            datos.setValueAt(sdf.format(b.getFechaAsignada()), fila, 2);
            
      
            fila++;
       }
       tablaBonificaciones.setModel(datos);
    }

    @Override
    public void mostrarNotificaciones(ArrayList<Notificacion> notificaciones) {
       DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Fecha");
        datos.addColumn("Mensaje");
        
        datos.setRowCount(notificaciones.size());
        int fila = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        for(Notificacion n:notificaciones){
            datos.setValueAt(n.getFecha(), fila, 0);
            datos.setValueAt(n.getMensaje(), fila, 1);
      
            fila++;
       }
       tablaNotificaciones.setModel(datos);
    }
    
    private void salir(){
        controlador.salir();
        this.dispose();
    }
}
