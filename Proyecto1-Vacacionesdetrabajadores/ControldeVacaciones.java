/* La empresa Coca cola solicita un sistema que determine
 * los dias de vacaciones a los que tiene derecho un trabajador, 
 * tomando en cuenta las siguientes características:
 * 
 * Existen tres departamentos dentro de la empresa con sus respectivas claves:
 * 
 * 1. Departamento de Atención al cliente.(clave 1)
 * 2. Departamento de logística. (Clave 2)
 * 3. Gerencia.(Clave 3)
 * 
 * Trabajadores con clave 1(Atención al cliente):
 * -Con 1 año de servicio, reciben 6 dias de vacaciones.
 * -Con 2 a 6 años de servicio, reciben 14 días de vacaciones.
 * - A partir de 7 años de servicio, reciben 20 días de vacaciones.
 * 
 * Trabajadores con clave 2(Logística):
 * -Con 1 año de servicio, reciben 7 días de vacaciones.
 * -Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
 * -A partir de 7 años de servicio, reciben 22 días de vacaciones.
 * 
 * Trabajadores con clave 3(Gerencia):
 * -Con 1 año de servicio, reciben 10 días de vacaciones.
 * -Con 2 a 6 años de servicio, reciben 20 días de vacaciones.
 * -A partir de 7 años de servicio, reciben 30 días de vacaciones.
 * 
 * Nota: El sistema debe solicitar el Nombre, Clave del departamento y Antiguedad
 * del trabajador, posteriormente mostrar un mensaje que contenga el
 * nombre del trabajador y los días de vacaciones a los que tiene derecho.
 */

import java.util.Scanner;

public class ControldeVacaciones{
    public static void main(String[] args){
        int antiguedad;
        String nombre;
        int clave;
        Boolean logistica=false;
        Boolean gerencia=false;
        Boolean atencionCliente=false;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de control vacacional de Coca Cola Company");
        System.out.println("Ingrese su nombre porfavor");
        nombre= entrada.nextLine();

        System.out.println("Hola "+ nombre + ", ahora ingresa tu antiguedad en Coca Cola Company porfavor");
        antiguedad= entrada.nextInt();

        System.out.println("Ahora ingresa tu clave de departamento, porfavor recuerde que sólo se admite 1 (Atencion a cliente),2 (Logística) y 3 (Gerencia)");
        clave= entrada.nextInt();

        switch(clave){
            case 1:{atencionCliente=true;break;}
            case 2:{logistica=true;break;}
            case 3:{gerencia=true;break;}
            default:{System.out.println("Clave no soportada,porfavor recuerde que sólo se admite 1 (Atencion a cliente),2 (Logística) y 3 (Gerencia)");}
        }

        if (atencionCliente==true) {
            if (antiguedad ==1) {
                System.out.println("El trabajador, "+ nombre + " recibe 6 días de vacaciones");
            }
            else if ((antiguedad >= 2)&&(antiguedad<=6)) {
                System.out.println("El trabajador, "+ nombre + " recibe 14 días de vacaciones");
            }
            else if (antiguedad>=7){
                System.out.println("El trabajador, "+ nombre + " recibe 20 días de vacaciones");
            }
        }

        if (logistica==true) {
            if (antiguedad ==1) {
                System.out.println("El trabajador, "+ nombre + " recibe 7 días de vacaciones");
            }
            else if ((antiguedad >= 2)&&(antiguedad<=6)) {
                System.out.println("El trabajador, "+ nombre + " recibe 15 días de vacaciones");
            }
            else if (antiguedad>=7){ 
                System.out.println("El trabajador, "+ nombre + " recibe 30 días de vacaciones");
            }
        }

        if (gerencia==true) {
            if (antiguedad ==1) {
                System.out.println("El trabajador, "+ nombre + " recibe 10 días de vacaciones");
            }
            else if ((antiguedad >= 2)&&(antiguedad<=6)) {
                System.out.println("El trabajador, "+ nombre + " recibe 20 días de vacaciones");
            }
            else if (antiguedad>=7){
                System.out.println("El trabajador, "+ nombre + " recibe 30 días de vacaciones");
            }
        }

        entrada.close();

    }
    
}