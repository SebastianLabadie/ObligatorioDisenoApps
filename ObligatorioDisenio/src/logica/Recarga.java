package logica;

import java.time.LocalDateTime;
import java.util.Date;
import observador.Observable;
import observador.Observador;


public class Recarga extends Observable{
    public enum EstadoRec{
        PENDIENTE,
        ACEPTADA,
        RECHAZADA//VER SI SIRVE
    }
    
    public enum eventos{cambioListaRecarga};
    
    private EstadoRec estado;
    private Date fecha;
    private double monto;
    private UsuarioAdministrador usr;

    public Recarga(double monto) {
        this.fecha = new Date();
        this.monto = monto;
        this.estado = EstadoRec.PENDIENTE;
        this.usr = null;
        avisar(eventos.cambioListaRecarga);
        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaRecargas);
        
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

    public UsuarioAdministrador getUsr() {
        return usr;
    }
    
    
    
}
