package paqueteuno;

import paquetedos.Doctores;
import paquetedos.Enfermeros;

public class Hospital {
    
    private String nombreH;
    private Ciudad ciudad;
    private byte especialidades;
    private Doctores[] doctores;
    private Enfermeros[] enfermeros;
    private double sueldos;
    private String direccion;
    
    public Hospital(String nh, Ciudad cd, byte esp, Doctores[] dc, Enfermeros[] em, String dr ){
    
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
    
    public void establecerDoctores(Doctores[] c){
    
        doctores = c;
    
    }
    
    public void establecerEnfermeros(Enfermeros[] c){
    
        enfermeros = c;
    
    }
    
    public void calcularSueldos(){
        
        double sueldoDc = 0;
        double sueldoEn = 0;
                
        for(int i = 0; i < doctores.length; i++){
            
            sueldoDc = sueldoDc + doctores[i].obtenerSueldo();
            
        }
        
        for(int i = 0; i < enfermeros.length; i++){
            
            sueldoEn = sueldoEn + enfermeros[i].obtenerSueldo();
            
        }
        
        sueldos = sueldoDc + sueldoEn;
       
    
    }
    
    public String obtenerNombreH(){
    
        return nombreH;
    
    }
    
    public Ciudad obtenerCiudad(){
    
        return ciudad;
    
    }
    
    public byte obtenerEspecialidades(){
    
        return especialidades;
    
    }
    
    public Doctores[] obtenerDoctores(){
    
        return doctores;
    
    }
    
    public Enfermeros[] obtenerEnfermeros(){
    
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
                + "Listado de médicos\n",
                nombreH,
                direccion,
                ciudad.obtenerNombreC(),
                ciudad.obtenerProvincia(),
                especialidades);
                
        for(byte i =0; i < doctores.length; i++){
        
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena,doctores[i].obtenerNombre(),doctores[i].obtenerSueldo(),doctores[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%s\n Listado de enfermeros(as)\n", cadena);
                
        for(byte i = 0; i < enfermeros.length; i++){
            
                cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                        
                        cadena,enfermeros[i].obtenerNombre(),enfermeros[i].obtenerSueldo(),enfermeros[i].obtenerTipo());
                
        }
        
        cadena = String.format("%s\n Total de sueldo a pagar por mes: %.2f\n", cadena,sueldos);
        
        return cadena;
        
    }
    
}

