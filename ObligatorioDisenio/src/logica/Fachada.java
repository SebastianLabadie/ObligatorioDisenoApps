package logica;

import Exceptions.AccesoException;
import Exceptions.BonificacionAsignadaException;
import Exceptions.DuplicadoException;
import Exceptions.LoginException;
import Exceptions.NoExiste;
import Exceptions.NumeroNegativoException;
import Exceptions.TransitoException;
import java.util.ArrayList;
import observador.Observable;

/**
 *
 * @author PC
 */
public class Fachada extends Observable{
    
    public enum eventos{cambioListaConexiones,cambioListaRecargas,cambioListaTransitos,pepe};
    
    private SistemaAcceso sAcceso = new SistemaAcceso();
    private SistemaTransito sTransito = new SistemaTransito();
    private SistemaBonificaciones  sBonificacion= new SistemaBonificaciones();
    public static int saldoMinimo=200;
    
    private static Fachada instancia = new Fachada();

    public static Fachada getInstancia() {
        return instancia;
    }
    

    private Fachada() {
    }

    public UsuarioPropietario agregarUsuarioPropietario(String cedula, String pwd, String nc,int saldo) {
        return sAcceso.agregarUsuarioPropietario(cedula, pwd, nc,saldo);
    }
    public UsuarioAdministrador agregarUsuarioAdministrador(String cedula, String pwd, String nc) {
        return sAcceso.agregarUsuarioAdministrador(cedula, pwd, nc);
    }

    public UsuarioPropietario loginPropietario(String cedula, String pwd) throws LoginException {
        return sAcceso.loginPropietario(cedula, pwd);
            
    }

    public Conexion loginAdministrador(String cedula, String pwd) throws LoginException {
        return sAcceso.loginAdministrador(cedula, pwd);
    }
    
    public Vehiculo agregarVehiculo(String matricula, String color, String modelo,CategoriaVehiculo cat) throws DuplicadoException{
       return  sTransito.agregarVehiculo(matricula, color, modelo,cat);
    }
    
    public void agregarCategoriaVehiculo(String nom){
        sTransito.agregarCategoriaVehiculo(nom);
    }
    
    public ArrayList<CategoriaVehiculo> obtenerCategoriasVehiculos(){
        return sTransito.getCategoriasVehiculos();
    } 
    
    public ArrayList<Tarifa> obtenerTarifas(){
        return sTransito.getTarifas();
    }
    
    public ArrayList<Puesto> obtenerPuestos(){
        return sTransito.getPuestos();
    }
    
    public void agregarTarifa(int monto,String nom,CategoriaVehiculo cat){
        sTransito.agregarTarifa(monto,nom, cat);
    }
    
    public void agregarPuesto(String nom,String dir){
        sTransito.agregarPuesto(nom, dir);
    }
    
    public void agregarTransito(Puesto puesto,Vehiculo vehiculo, Tarifa tarifa,BonificacionAsignada bonificacion) throws TransitoException{
        sTransito.agregarTransito(puesto, vehiculo, tarifa,bonificacion);
    }
    
    public void agregarRecarga(double monto,UsuarioPropietario usr) throws NumeroNegativoException{
        sTransito.agregarRecarga(monto,usr);
        
    }
    
    public UsuarioPropietario obtenerPropietarioPorCedula(String cedula) throws AccesoException{
        return sAcceso.obtenerPropietarioPorCedula(cedula);
    }
    
    public ArrayList<Transito> obtenerTransitosDeUsuario(UsuarioPropietario u){
         return sTransito.obtenerTransitosDeUsuario(u);
        
    }
    
    public ArrayList<Recarga> obtenerRecargasDeUsuario(UsuarioPropietario u){
         return sTransito.obtenerRecargasDeUsuario(u);
    }
            
    public void agregarBonificacion(String nombre){
        sBonificacion.agregarBonificacion(nombre);
    }
    
    public ArrayList<Bonificacion> obtenerBonificaciones(){
        return sBonificacion.obtenerBonificaciones();
    }
    
    public void crearBonificacionAsignada(Puesto p,Bonificacion b, UsuarioPropietario u) throws BonificacionAsignadaException{
        sBonificacion.crearBonificacionAsignada(p, b, u);
    }
    
    public Vehiculo obtenerVehiculoByMatricula(String matricula) throws NoExiste{
        return sTransito.getVehiculoByMatricula(matricula);
    }
    

    public ArrayList<Conexion> getConexiones() {
        return sAcceso.getConexiones();
    }

    public void logout(Conexion c) {
        sAcceso.logout(c);
    }

    
}
