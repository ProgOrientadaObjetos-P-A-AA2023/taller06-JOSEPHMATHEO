package paquetedos;

public class Enfermeros {
    
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermeros(String nom, String tp, Double sld){
    
        nombre = nom;
        tipo = tp;
        sueldo = sld;
        
    }
    
    public void establecerNombre(String c){
        
        nombre = c;
        
    }
    
    public void establecerTipo(String c){
        
        tipo = c;
        
    }
    
    public void establecerSueldo(double c){
        
        sueldo = c;
        
    }
    
    public String obtenerNombre(){
    
        return nombre;
    
    }
    
    public String obtenerTipo(){
    
        return tipo;
    
    }
    
    public Double obtenerSueldo(){
    
        return sueldo;
    
    }
    
}
