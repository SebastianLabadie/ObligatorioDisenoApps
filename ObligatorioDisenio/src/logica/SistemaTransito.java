
package logica;

import Exceptions.DuplicadoException;
import Exceptions.NoExiste;
import Exceptions.NumeroNegativoException;
import Exceptions.TransitoException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sebastianlb
 */
public class SistemaTransito {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<CategoriaVehiculo> categoriasVehiculos = new ArrayList<>();
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Tarifa> tarifas = new ArrayList<>();
    private ArrayList<Transito> transitos = new ArrayList<>();
    private ArrayList<Recarga> recargas = new ArrayList<>();
    
    
     
    public Vehiculo agregarVehiculo(String matricula, String color, String modelo,CategoriaVehiculo cat) throws DuplicadoException{
        //validar que vehiculo no este creado
        validarVehiculo(matricula);
        Vehiculo v = new Vehiculo(matricula, color, modelo,cat);
        vehiculos.add(v);
        return v;
    }
    
    private void validarVehiculo(String matricula) throws DuplicadoException{
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                throw new DuplicadoException("Vehiculo duplicado");
            }
        }
    }
    
    public void agregarCategoriaVehiculo(String nom){
        CategoriaVehiculo c = new CategoriaVehiculo(nom);
        categoriasVehiculos.add(c);
    }
    
    public void agregarTarifa(int monto,String nombre,CategoriaVehiculo cat){
        Tarifa t = new Tarifa(monto,nombre, cat);
        tarifas.add(t);
    }
    
    public void agregarPuesto(String nom,String dir){
        Puesto p = new Puesto(nom, dir);
        puestos.add(p);
    }

    public void agregarTransito(Puesto puesto,Vehiculo vehiculo, Tarifa tarifa,BonificacionAsignada bonificacion ) throws TransitoException{
        
        //Validar que usuario tenga saldo suficiente
            //bonificacion.getBonificacion().getNombre().contains(s)
        double costoTotal = 0;
        if (bonificacion!=null) {
            costoTotal = tarifa.getMonto()  - bonificacion.getBonificacion().getDescuento(1);
        }else{
            costoTotal = tarifa.getMonto();
        }
            
        UsuarioPropietario propietario = vehiculo.getPropietario();
        if (propietario.getSaldo() < costoTotal) {
            throw new TransitoException("Saldo insuficiente: "+propietario.getSaldo());
        }
        
        Transito t= new Transito(puesto, vehiculo, tarifa,bonificacion);
        transitos.add(t);
        propietario.setSaldo(propietario.getSaldo()-costoTotal);
        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaTransitos);
        
        //Crear notificacion 
        Notificacion notPuesto = new Notificacion("Pasaste por el puesto "+puesto.getNombre()+" con el vehículo "+vehiculo.getMatricula()+".");
        propietario.agregarNotificacion(notPuesto);
        
        //Notificacion de saldo minimo
        if (Fachada.saldoMinimo >= propietario.getSaldo()) {
            Notificacion notSaldo = new Notificacion("Tu saldo actual es de $"+propietario.getSaldo()+" te recomendamos hacer una recarga.");
            propietario.agregarNotificacion(notSaldo);
        }
        
        Fachada.getInstancia().avisar(Fachada.eventos.cambioListaNotificaciones);
    }
    
    
     public ArrayList<Transito> obtenerTransitosDeUsuario(UsuarioPropietario u){
         ArrayList<Transito> ret = new ArrayList<>();
         for (Transito t : transitos) {
             if (t.getVehiculo().getPropietario().equals(u)) {
                   ret.add(t);
             }
         }
         
         return ret;
     }
     
     public Vehiculo getVehiculoByMatricula(String matricula) throws NoExiste{
         for (Vehiculo vehiculo : vehiculos) {
             if(vehiculo.getMatricula().equals(matricula)) return vehiculo;
         }
         
         throw new NoExiste("No existe el vehículo");
     }

    public ArrayList<Recarga> getRecargas() {
        return recargas;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ArrayList<CategoriaVehiculo> getCategoriasVehiculos() {
        return categoriasVehiculos;
    }

    public ArrayList<Puesto> getPuestos() {
        return puestos;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
    
    
    
    
}
