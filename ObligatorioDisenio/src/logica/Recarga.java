package logica;

import java.time.LocalDateTime;
import java.util.Date;
import observador.Observable;
import observador.Observador;


public class Recarga {
    public enum EstadoRec{
        PENDIENTE,
        ACEPTADA
    }
    
    public enum eventos{cambioListaRecarga};
    
    private EstadoRec estado;
    private Date fecha;
    private double monto;
    private UsuarioPropietario propietario;
    private UsuarioAdministrador admin;

    public Recarga(double monto,UsuarioPropietario propietario) {
        this.fecha = new Date();
        this.monto = monto;
        this.estado = EstadoRec.PENDIENTE;
        this.admin = null;
        this.propietario = propietario;
        
    }
    
    public EstadoRec getEstado() {
        return estado;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public UsuarioAdministrador getAdmin() {
        return admin;
    }

    public UsuarioPropietario getPropietario() {
        return propietario;
    }


    public void setEstado(EstadoRec estado) {
        this.estado = estado;
    }

    public void setAdmin(UsuarioAdministrador admin) {
        this.admin = admin;
    }
    
    
    
    
    
    
    
}
