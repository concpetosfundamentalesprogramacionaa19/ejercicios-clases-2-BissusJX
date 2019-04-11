/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioClase;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class MiClase {
    
    
    public static void main(String[] args) {
        
        //Mi primera clase 
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int notas;
        int nota1;
        int nota2;
        float promedio;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese sus  Nombres");
        nombre = entrada.nextLine();
       
        System.out.println("Ingrese sus Apellidos");
        apellido = entrada.nextLine() ;
        
        System.out.println("Ingrese su Edad");
        edad = entrada.nextInt();
        entrada.nextLine(); //limpieza del buffer de entrada de datos
        
        System.out.println("Ingrese sus Ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Ingrese su Pais");
        pais = entrada.nextLine();
        
        System.out.println("Ingrese Nota 1");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese Nota 2");
        nota2 =entrada.nextInt();
        
        promedio = (nota1 + nota2)/2;
       /**
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido"
                + " es: " +apellido+", edad: " +edad+ "\n Ciudad: " +ciudad);
        */
        System.out.printf(" Sus nombres y Apellidos: %s %s \n Edad: "
                +"%s\n Ciudad: %s\n Pais: %s\n Notas %s, %s\n Promedio: %s ",
                nombre,apellido, edad,ciudad,pais,nota1,nota2,promedio);
    }
}
