/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JuanMayancela 
 */
public class Proveedor extends Persona {
    private static ArrayList<Proveedor> listaProveedores;

    public Proveedor(String codigo, String nombre, String direccion, String telefono) {
        super(codigo, nombre, direccion, telefono);
        listaProveedores = new ArrayList<>();
        this.llenarListaProveedores();
    }
    
    public void llenarListaProveedores(){
        Proveedor p1 = new Proveedor("12345","Andrea Cueva","Guayaquil","0989221345");
        Proveedor p2 = new Proveedor("12346","Diego Vera","Quito","0949332785");
        Proveedor p3 = new Proveedor("12347","Carlos Bayas","Cuenca","0928552314");
        Proveedor p4 = new Proveedor("12348","Daniela Mora","Machala","0971224536");
        
        listaProveedores.add(p1);
        listaProveedores.add(p2);
        listaProveedores.add(p3);
        listaProveedores.add(p4);
    }
    
    public void agregarProveedor(){
        Scanner sc = new Scanner(System.in); 
        
        String res = "";
        String cod = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < getCodigo().length(); i++){
            int n = (int)(Math.random()*getCodigo().length());
            cod += getCodigo().charAt(n);
        }
        System.out.println("!! Ingrese los datos del proveedor !!\n");
        do{
            System.out.println("Ingrese nombre del proveedor: ");
            String nom = sc.nextLine();
            System.out.println("Ingrese dirección del proveedor: ");
            String direc = sc.nextLine();
            System.out.println("Ingrese teléfono del proveedor: ");
            String tel = sc.nextLine();
            
            Proveedor proveedor = new Proveedor(cod,nom,direc,tel);
            listaProveedores.add(proveedor);
            System.out.println("Desea agregar otro proveedor(S/N)?");
            res = sc.nextLine();
            System.out.println(" ");
            
        }while(res.equals("S"));
        
        sc.close();
    }
    
}
