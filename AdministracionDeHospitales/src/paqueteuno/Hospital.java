package paqueteuno;

import paquetedos.Doctores;
import paquetedos.Enfermeros;

public class Hospital {
    
    private String nombreH;
    private Ciudad ciudad;
    private Byte especialidades;
    private Doctores doctores;
    private Enfermeros enfermeros;
    private double sueldos;
    private String direccion;
    
    public Hospital(String nh, Ciudad cd, Byte esp, Doctores dc, Enfermeros em, String dr ){
    
        nombreH = nh;
        ciudad = cd;
        especialidades = esp;
        doctores = dc;
        enfermeros = em; 
        direccion = dr;
        
    }
    
    public void establecerNombreH(String c){
    
        nombreH = c;
    
    }
    
    public void establecerCiudad(Ciudad c){
    
        ciudad = c;
    
    }
    
    public void establecerEspecialidades(Byte c){
    
        especialidades = c;
    
    }
    
    public void establecerDoctores(Doctores c){
    
        doctores = c;
    
    }
    
    public void establecerEnfermeros(Enfermeros c){
    
        enfermeros = c;
    
    }
    
    public void calcularSueldos(){
    
        sueldos = obtenerDoctores().obtenerSueldo() + obtenerEnfermeros().obtenerSueldo();
    
    }
    
    public String obtenerNombreH(){
    
        return nombreH;
    
    }
    
    public Ciudad obtenerCiudad(){
    
        return ciudad;
    
    }
    
    public Byte obtenerEspecialidades(){
    
        return especialidades;
    
    }
    
    public Doctores obtenerDoctores(){
    
        return doctores;
    
    }
    
    public Enfermeros obtenerEnfermeros(){
    
        return enfermeros;
    
    }
    
    public double obtenerSueldos(){
    
        return sueldos;
    
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("HOSPITAL %S\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia %s\n"
                + "Numero de especialidades: %d\n"
                + "Listado de médicos\n"
                + "Valor minuto: %.2f\n"
                + "Total de sueldos a pagar por mes: %.2f\n",
                
                nombreH,
                direccion,
                ciudad.obtenerNombreC(),
                ciudad.obtenerProvincia(),
                especialidades,
                sueldos);
        
        return cadena;
    }
    
}

