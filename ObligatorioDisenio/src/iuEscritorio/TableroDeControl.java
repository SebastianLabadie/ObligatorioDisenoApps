/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iuEscritorio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Fachada;
import logica.Transito;
import logica.UsuarioPropietario;
import logica.Recarga;
import observador.Observable;
import observador.Observador;
import logica.Recarga.EstadoRec;

/**
 *
 * @author sebastianlb
 */
public class TableroDeControl extends javax.swing.JFrame implements Observador {

    private UsuarioPropietario usuario;
    private Recarga recarga;
    private ArrayList<Transito> transitos;
    private ArrayList<Recarga> recargas;
    /**
     * Creates new form TableroDeControl
     */
    public TableroDeControl(UsuarioPropietario u) {
        initComponents();
        this.usuario = u;
        this.transitos = Fachada.getInstancia().obtenerTransitosDeUsuario(u);
        this.recargas = Fachada.getInstancia().obtenerRecargasDeUsuario(u);
        lNombreUsuario.setText(u.getNombreCompleto());
        lSaldoUsuario.setText(""+u.getSaldo());
        lCantVehiculos.setText(""+u.getVehiculos().size());
        lCantTransitos.setText(""+transitos.size());
        mostrarTabla();
        mostrarTablaTransitos();
        mostrarTablaRecargas();
        Fachada.getInstancia().agregarObservador(this);
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
        lRecargas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRecargas = new javax.swing.JTable();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lNombreUsuario.setText("Nombre Usuario");

        l1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(84, 130, 53));
        l1.setText("$");

        lSaldoUsuario.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lSaldoUsuario.setForeground(new java.awt.Color(84, 130, 53));
        lSaldoUsuario.setText("saldo usuario");

        lCantVehiculos.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantVehiculos.setText("cVe");

        jScrollPane1.setViewportView(tablaVehiculos);

        lCantTransitos.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lCantTransitos.setText("cTr");

        jScrollPane2.setViewportView(tablaTransitos);

        lRecargas.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lRecargas.setText("Recargas");

        jScrollPane3.setViewportView(tblRecargas);

        btnRecargar.setText("Recargar");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lSaldoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lNombreUsuario)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(lCantVehiculos))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lCantTransitos)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lRecargas)
                                    .addComponent(btnRecargar))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombreUsuario)
                    .addComponent(l1)
                    .addComponent(lSaldoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCantVehiculos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lCantTransitos)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lRecargas)
                        .addGap(43, 43, 43)
                        .addComponent(btnRecargar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        // TODO add your handling code here:
         new RecargarSaldo(usuario).setVisible(true);
    }//GEN-LAST:event_btnRecargarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
   
    @Override
    public void actualizar(Object evento, Observable origen) {
        System.out.println("LLEGO");
        if(evento.equals(Fachada.eventos.cambioListaRecargas)){
            this.recargas = Fachada.getInstancia().obtenerRecargasDeUsuario(this.usuario);
            System.out.println(this.recargas);
            mostrarTablaRecargas();
        }
        
    }

    private void mostrarTabla() {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Matricula");
        datos.addColumn("Modelo");
        datos.addColumn("Color");
        datos.addColumn("#Transitos");
        datos.addColumn("Monto Total");
     
        datos.setRowCount(1);
        int fila = 0;
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
//        for(Dialogo d:dialogos){
datos.setValueAt("mat1", fila, 0);
datos.setValueAt("mod1", fila, 1);
datos.setValueAt("rojo", fila, 2);
datos.setValueAt("1", fila, 3);
datos.setValueAt("1222", fila, 4);
//      
//            fila++;
//        }
tablaVehiculos.setModel(datos);
    }
    
     private void mostrarTablaTransitos() {
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
            datos.setValueAt("bonif", fila, 4);
            datos.setValueAt("bonif", fila, 5);
            datos.setValueAt(t.getMontoPagado(), fila, 6);
            datos.setValueAt(t.getMontoPagado(), fila, 7);
            datos.setValueAt(sdf.format(t.getFechaIngreso()), fila, 7);
            
      
            fila++;
       }
        tablaTransitos.setModel(datos);
    }
     
     private void mostrarTablaRecargas() {
        if (recargas !=null ){
        
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
                datos.setValueAt(r.getUsr(), fila, 3);
                fila++;
           }
            tblRecargas.setModel(datos);
        }
        
    }
     
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecargar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lCantTransitos;
    private javax.swing.JLabel lCantVehiculos;
    private javax.swing.JLabel lNombreUsuario;
    private javax.swing.JLabel lRecargas;
    private javax.swing.JLabel lSaldoUsuario;
    private javax.swing.JTable tablaTransitos;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTable tblRecargas;
    // End of variables declaration//GEN-END:variables
}
