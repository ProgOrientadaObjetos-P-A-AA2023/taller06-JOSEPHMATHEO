package paquetedos;

public class Doctores {
    
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Doctores(String nom, String esp, Double sld){
    
        nombre = nom;
        especialidad = esp;
        sueldo = sld;
        
    }
    
    public void establecerNombre(String c){
        
        nombre = c;
        
    }
    
    public void establecerEspecialidad(String c){
        
        especialidad = c;
        
    }
    
    public void establecerSueldo(double c){
        
        sueldo = c;
        
    }
    
    public String obtenerNombre(){
    
        return nombre;
    
    }
    
    public String obtenerEspecialidad(){
    
        return especialidad;
    
    }
    
    public Double obtenerSueldo(){
    
        return sueldo;
    
    }
    
}
