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
    private List<Cliente> listaClientes;
    private char respuesta = '1';
    
     public Cliente(Scanner input){
        listaClientes = new ArrayList<>();
        this.input = input;
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
    
    public void agregarCliente(){
        
        Scanner sc = new Scanner(System.in);
        
        String res = "";
        String cod = "";
        
        for(int i = 0; i < getCodigo().length(); i++){
            int n = (int)(Math.random()*getCodigo().length());
            cod += getCodigo().charAt(n);
        }
        
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
        
        sc.close();
    }

}
