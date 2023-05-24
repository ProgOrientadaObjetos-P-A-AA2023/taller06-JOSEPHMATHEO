package paqueteuno;

public class Ciudad {
    
    private String nombreC;
    private String provincia;
    
    public Ciudad(String nomC, String prov){
    
        nombreC = nomC;
        provincia = prov;
        
    }
    
    public void establecerNombreC(String c){
    
        nombreC = c;
    
    }
    
    public void establecerProvincia(String c){
    
        provincia = c;
    
    }
    
    public String obtenerNombreC(){
    
        return nombreC;
    
    }
    
    public String obtenerProvincia(){
    
        return provincia;
    
    }
    
}
