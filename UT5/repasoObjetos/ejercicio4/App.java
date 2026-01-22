
package principal;

import java.util.Scanner;

import clases.DepositoAgua;

/**
 * Llenar depósito
 * 
 * Vaciar depósito
 * 
 * Vaciar completamente
 * 
 * Comprobar si está vacío
 * 
 * Comprobar si está lleno
 * 
 * Salir
 */
public class App {
    public static void main(String[] args) throws Exception {

        String opcion;
        Scanner sc = new Scanner(System.in);
        DepositoAgua deposito = new DepositoAgua(100);
        System.out.println("MENÚ DE USO DEL DEPÓSITO");

        do {
            System.out.println("1. Llenar deposito");
            System.out.println("2.Vaciar depósito");
            System.out.println("3.Vaciar completamente");
            System.out.println("4.Comprobar si está vacío");
            System.out.println("5.Comprobar si está lleno");
            System.out.println("6.salir");



            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Dime cuántos litros quieres llenar");
                    try {
                        double litros = Double.parseDouble(sc.nextLine());
                        deposito.llenar(litros);
                    } catch (Exception e) {
                        System.out.println("No es posible llenar con esa cantidad");
                    }
                    break; 
                case "2":
                    System.out.println("Dime cuántos litros quieres vaciar");
                    try {
                        double litros = Double.parseDouble(sc.nextLine());
                        deposito.llenar(litros);
                    } catch (Exception e) {
                        System.out.println("No es posible llenar con esa cantidad");
                    }
                    break; 
                case "3":
                    System.out.println("VACIAMOS EL DEPÓSITO");
                    deposito.vaciarCompleto();
                    break; 
                case "4":
                    if(deposito.estaVacio()){
                        System.out.println("EL DEPÓSITO ESTÁ VACÍO");


                    }else
                        System.out.println("EL DEPÓSITO NO ESTÁ VACÍO");
                    break;
                    case "5":
                        // Comprobar si está lleno

                    if(deposito.estaLleno()){
                        System.out.println("EL DEPÓSITO ESTÁ LLENO");

                    }else
                        System.out.println("EL DEPÓSITO NO ESTÁ LLENO");
                    break;
                    default: 
                    break; 

                    }

            }while(!opcion.equalsIgnoreCase("6"));
}}
