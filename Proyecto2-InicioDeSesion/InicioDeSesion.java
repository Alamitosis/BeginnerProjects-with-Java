/*
Por Alan Oswaldo Huerta Becerra

 * Realizar un programa que simule el inicio de sesión solicitando
 * el nombre de usuario y la contraseña, para posteriormente compararlos
 * y mostrar un mensaje en pantalla que diga: inicio de sesión correcto/
 * nombre de usuario o contraseña incorrectos.
 */
import java.util.Scanner;

public class InicioDeSesion{
    public static void main(String[] args){

        String dataBaseUser="Alamitosis";
        String dataBasePassword="Alitas123";
        Scanner entrada= new Scanner(System.in);
        String User;
        String Password;

        System.out.println("********************************************");
        System.out.println("Bienvenido al sistema bancario BBXVA");
        System.out.println("********************************************");
        System.out.println("");
        System.out.println("");
        System.out.print("Porfavor, ingrese su nombre de usuario:");
        User=entrada.nextLine();
        System.out.flush();
        System.out.print("Porfavor, ingrese su contraseña:");
        Password=entrada.nextLine();
        System.out.flush();

        if ((User.equals(dataBaseUser))&&(Password.equals(dataBasePassword))) {
            System.out.println("Hola, " + User);
        }
        else{
            System.out.println("Usuario o contraseña incorrectos, cajero bloqueado");
        }

        entrada.close();
    }
}