/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemplosClase2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar ingresar valores
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese sus  nombres");
        nombre = entrada.nextLine();
       
        System.out.println("Ingrese sus apellidos");
        apellido = entrada.nextLine() ;
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //limpieza del buffer de entrada de datos
        
        System.out.println("Ingrese sus ciudad");
        ciudad = entrada.nextLine();
       
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido"
                + " es: " +apellido+", edad: " +edad+ "\n Ciudad: " +ciudad);
      
    }
    
}
