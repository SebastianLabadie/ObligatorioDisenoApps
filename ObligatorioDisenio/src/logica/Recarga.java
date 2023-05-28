package logica;

import java.time.LocalDateTime;


public class Recarga {
    public enum EstadoRec{
        PENDIENTE,
        ACEPTADA,
        RECHAZADA//VER SI SIRVE
    }
    
    private EstadoRec estado;
    private LocalDateTime fecha;
    private double monto;
    private UsuarioAdministrador usr;

    public Recarga(double monto) {
        this.fecha = LocalDateTime.now();
        this.monto = monto;
        this.estado = EstadoRec.PENDIENTE;
        this.usr = null;        
    }

    public EstadoRec getEstado() {
        return estado;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public UsuarioAdministrador getUsr() {
        return usr;
    }
    
    
    
}
