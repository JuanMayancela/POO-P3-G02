/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poop03g2;
import java.util.Scanner;
import java.util.ArrayList;
import com.mycompany.poop03g2.data.*;

/**
 *
 * @author mamay
 */
public class PooP03G2 {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public static char respuesta = '1';
    

    public static void main(String[] args) {
        validarUsuario();
    }
    
    public static void validarUsuario(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("!! Inicie sesión !!");
        System.out.print("Ingrese usuario: ");
        String usua = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contra = sc.nextLine();
        Usuario busqueda = new Admin(usua,contra,"","");
        if(listaUsuarios.contains(busqueda)){
            
            //for(int i = 0; i<listaUsuarios.size(); i++){
                int ind = listaUsuarios.indexOf(busqueda);
                Usuario u = listaUsuarios.get(ind);
                if(u instanceof Admin){
                    while(respuesta != 4){
                        
                        System.out.println("""
                               1.Administrar Clientes
                               2.Administrar Proveedores
                               3.Administrar Servicios
                               4.Salir""");
                        System.out.print("Ingrese el número de la opción seleccionada: ");
                        respuesta = input.nextLine().charAt(0);
                        switch(respuesta){
                            case '1':
                                
                                break;
                            case '2':
                                
                                break;
                                
                            case '3':
                                
                                break;
                                
                            case '4':
                                return;
                                
                            default :
                                System.out.println("La opcion es incorrecta");
                        }
                    }
                    
                }
                if(u instanceof Tecnico){
                    while(respuesta != 3){
                        
                        System.out.println("""
                               1.Generar orden de servicios
                               2.Reportar falta de insumos
                               3.Salir""");
                        System.out.print("Ingrese el número de la opción seleccionada: ");
                        respuesta = input.nextLine().charAt(0);
                        switch(respuesta){
                            case '1':
                                
                                break;
                            case '2':
                                
                                break;
                                
                            case '3':
                                return;
                                
                            default :
                                System.out.println("La opcion es incorrecta");
                        }
                    }
                    
                }
                if(u instanceof Cobranza){
                    while(respuesta != 4){
                        
                        System.out.println("""
                               1.Generar facturas a empresas
                               2.Reporte de ingresos por servicios
                               3.Reporte de atenciones por técnico
                               4.Salir""");
                        System.out.print("Ingrese el número de la opción seleccionada: ");
                        respuesta = input.nextLine().charAt(0);
                        switch(respuesta){
                            case '1':
                                
                                break;
                            case '2':
                                
                                break;
                                
                            case '3':
                                
                                break;
                                
                            case '4':
                                return;
                                
                            default :
                                System.out.println("La opcion es incorrecta");
                        }
                    }
                    
                }
            //}
        }
        else{
            System.out.println("!! Error: usuario o contraseña incorrectos !!");
        }
        
        sc.close();
    }
}
