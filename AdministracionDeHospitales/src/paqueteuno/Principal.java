package paqueteuno;

// @author JosephMatheo

import java.util.Scanner;
import paqueteuno.Hospital;
import paqueteuno.Ciudad;
import paquetedos.Doctores;
import paquetedos.Enfermeros;

public class Principal {

    public static void main(String[] args) {
        
        // Objeto de tipo Scanner 
        
        Scanner lm = new Scanner(System.in);
        
        // Variables para el Hospital 
        
        String hosp;
        String ciudadH;
        String provincia;
        byte especialidades;
        double sueldosTot;
        String direccion;
        
        // Varaibles para los Medicos 
        
        byte numDoc;
        String nomDoc;
        String espDoc;
        double sueldoDoc;
        
        // Variables para los Enfermer@s
        
        byte numEnfe;
        String nomEnfe;
        String tipoNom;
        double sueldoEnfe;
        
        // Ingreso de los Datos 
        
        System.out.print("Programa para Adminitar los Hospitales del Pais");
        System.out.print("===============================================");
        
        System.out.print("\nIngrese el nombre del Hospital: ");
        hosp = lm.nextLine();
        
        System.out.print("Ingrese la ciudad del Hospital: ");
        ciudadH = lm.nextLine();
        
        System.out.print("Ingrese la provincia del Hospital: ");
        provincia = lm.nextLine();
        
        System.out.print("Ingrese el numero de especialidades del Hospital: ");
        especialidades = lm.nextByte();
        
        lm.nextLine(); // Limpieza de Buffer
        
        System.out.print("Ingrese la direccion del Hospital: ");
        direccion = lm.nextLine();
        
        
        
        System.out.print("\nIngrese el numero de Doctores en el Hospital: ");
        numDoc = lm.nextByte();
        
        lm.nextLine(); // Limpieza de Buffer
        
        Doctores arrayDoc[] = new Doctores[numDoc];
        
        for(byte i = 0; i < arrayDoc.length; i++){ 
            
            System.out.print("Ingrese el nombre del Doctor: ");
            nomDoc = lm.nextLine();

            System.out.print("Ingrese la especialidad del Doctor: ");
            espDoc = lm.nextLine();

            System.out.print("Ingrese el sueldo mensual del Doctor: ");
            sueldoDoc = lm.nextDouble();
            
            lm.nextLine(); // Limpieza de Buffer
            
            Doctores doctores = new Doctores(nomDoc, espDoc, 
                sueldoDoc);
            
            arrayDoc[i] = doctores;
        
        }
        
        System.out.print("\nIngrese el numero de Enfermeros en el Hospital: ");
        numEnfe = lm.nextByte();
        
        lm.nextLine(); // Limpieza de Buffer
            
        Enfermeros arrayEnfe[] = new Enfermeros[numEnfe];
        
        for(byte i = 0; i < arrayEnfe.length; i++){
            
            System.out.print("Ingrese el nombre del enfermero o enfermera: ");
            nomEnfe = lm.nextLine();

            System.out.print("Ingrese el tipo: nombramiento/contrato del enfermero o enfermera: ");
            tipoNom = lm.nextLine();

            System.out.print("Ingrese el sueldo mensual del del enfermero o enfermera: ");
            sueldoEnfe = lm.nextDouble();
            
            lm.nextLine(); // Limpieza de Buffer
            
            Enfermeros enfermeros = new Enfermeros(nomEnfe, tipoNom,
                sueldoEnfe);
            
            arrayEnfe[i] = enfermeros;
            
        }
        
        // Creacion de los objetos y envio de parametros 

        Ciudad ciudad = new Ciudad(ciudadH, provincia);
        
        Hospital hospital = new Hospital(hosp, ciudad, especialidades, 
                arrayDoc, arrayEnfe, direccion );
        
        // Llamada a la funcion que calcula el sueldo
        
        hospital.calcularSueldos();
        
        // Presentacion de Datos
        
        System.out.printf("%s",hospital);
        
    }
    
}
