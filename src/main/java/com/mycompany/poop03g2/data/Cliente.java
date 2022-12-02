/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author JuanMayancela 
 */
public class Cliente extends Persona{
    private String tipoCliente;
    
    private Scanner input;
    protected static List<Cliente> listaClientes;
    private char respuesta = '1';
    
    
    
    
    public Cliente(Scanner input){
        listaClientes = new ArrayList<>();
        this.input = input;
        this.listaClientes.add(new Cliente("123456","Carlos Bayas","Guayaquil","0975661328","Empresarial"));
        this.listaClientes.add(new Cliente("123457","Mateo Vega","Machala","0975661328","Personal"));
        this.listaClientes.add(new Cliente("123458","Carla Gaona","Cuenca","0975661328","Empresarial"));
        this.listaClientes.add(new Cliente("123459","Aianna Mata","Quito","0975661328","Personal"));
    }

    public Cliente(String codigo, String nombre, String direccion, String telefono,String tipoCliente) {
        super(codigo, nombre, direccion, telefono);
        this.tipoCliente = tipoCliente;
       
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
    
    public void agregarCliente(){
        
        Scanner sc = new Scanner(System.in);
        
        String res = "";
        String cod = "1";
        
        /*for(int i = 0; i < getCodigo().length(); i++){
            int n = (int)(Math.random()*getCodigo().length());
            cod += getCodigo().charAt(n);
        }*/
        
        System.out.println("!! Ingrese los datos del cliente !!");
        
        do{
            System.out.println("Ingrese nombre del cliente: ");
            String nom = sc.nextLine();
            System.out.println("Ingrese dirección del cliente: ");
            String direc = sc.nextLine();
            System.out.println("Ingrese teléfono del cliente: ");
            String tel = sc.nextLine();
            System.out.println("Ingrese tipo de cliente: ");
            String tipoCli = sc.nextLine();
           
            Cliente cliente = new Cliente(cod,nom,direc,tel,tipoCli);
            listaClientes.add(cliente);
            System.out.println("Desea agregar otro cliente(S/N)?");
            res = sc.nextLine();
            System.out.println(" ");
            
        }while(res.equals("S"));
        
    }
    
    @Override
    public String toString(){
        return getCodigo()+","+getNombre()+","+getDireccion()+","+getTelefono()+","+tipoCliente;
    }
    

    
    public void menuCliente(){
        
        respuesta = '1';        
        while(respuesta != '2'){
            
            System.out.println(" ");
            System.out.println("!! Información de los clientes !!");
            System.out.println(listaClientes);
            System.out.println(" ");
            System.out.println("""
                Menú Cliente:
                1.Agregar Cliente
                2.Regresar al menú principal
                """);
            System.out.print("Ingrese el número de la opción selecionada: ");
            respuesta = input.nextLine().charAt(0);
            switch(respuesta){
                
                case '1':
                   agregarCliente();
                    break;
                 
                case '2':
                    return;
                   
                default :
                    System.out.println("La opcion es incorrecta");

            }
        }
    }
    @Override
    public boolean equals(Object obj){
        if(obj==this){
            return true;
        }
        if(obj != null && obj instanceof Cliente){
            Cliente other = (Cliente)obj;
            String cod1= getCodigo();
            return cod1.equals(other.getCodigo());
        }
        return false;
    }
}
