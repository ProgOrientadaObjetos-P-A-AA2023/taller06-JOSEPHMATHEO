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
        Byte especialidades;
        double sueldosTot;
        String direccion;
        
        // Varaibles para los Medicos 
        
        String nomDoc;
        String espDoc;
        double sueldoDoc;
        
        // Variables para los Enfermer@s
        
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
        
        System.out.print("Ingrese la direccion del Hospital: ");
        direccion = lm.nextLine();
        
        System.out.print("\nIngrese el nombre del Doctor: ");
        nomDoc = lm.nextLine();
        
        System.out.print("Ingrese la especialidad del Doctor: ");
        espDoc = lm.nextLine();
        
        System.out.print("Ingrese el sueldo mensual del Doctor: ");
        sueldoDoc = lm.nextDouble();
        
        System.out.print("\nIngrese el nombre del enfermero o enfermera: ");
        nomEnfe = lm.nextLine();
        
        System.out.print("Ingrese el tipo: nombramiento/contrato del enfermero o enfermera: ");
        tipoNom = lm.nextLine();
        
        System.out.print("Ingrese el sueldo mensual del del enfermero o enfermera: ");
        sueldoEnfe = lm.nextDouble();
        
        // Creacion de los objetos y envio de parametros 
        
        Enfermeros enfermeros = new Enfermeros(nomEnfe, tipoNom, sueldoEnfe);
        Doctores doctores = new Doctores(nomDoc, espDoc, sueldoDoc);
        Ciudad ciudad = new Ciudad(ciudadH, provincia);
        Hospital hospital = new Hospital(hosp, ciudad, especialidades, doctores, enfermeros, direccion );
        
        // Llamada a la funcion que calcula el sueldo
        
        hospital.calcularSueldos();
        
        // Presentacion de Datos
        
        
        
    }
    
}
