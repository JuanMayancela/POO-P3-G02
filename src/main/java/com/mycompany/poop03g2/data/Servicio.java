/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Diego Contreras
 */
public class Servicio {
        private String codigo;
	private String nombre;
	private double precio;
        private ArrayList<Servicio> listaServicios= new ArrayList<Servicio();


    public Servicio(String codigo, String nombre, double precio){
	this.codigo=codigo;
	this.nombre=nombre;
	this.precio=precio;
}
  
            
	public String getCodigo(){
        return codigo;
    	}

    	public void setCodigo(String codigo) {
        this.codigo = codigo;
    	}

	public String getNombre() {
        return nombre;
    	}

    	public void setNombre(String nombre) {
        this.nombre = nombre;
    	}

    	public double getPrecio() {
        return precio;
    	}

    	public void setPrecio(double precio) {
        this.precio = precio;
    	}

        
        
        
	public void agregarServicio(){
	Scanner input= new Scanner(System.in);
	codigo= "";
	String res= "S";

	while(res.equals("S")){
	System.out.println("Ingrese el nombre del Servicio: ");
	String nombreS= input.nextLine();
	System.out.println("Ingrese el precio del Servicio: ");
	double precioS= input.nextDouble();
	for(int i = 0; i < getCodigo().length(); i++){
            int n = (int)(Math.random()*getCodigo().length());
            codigo += getCodigo().charAt(n);
        }	
	Servicio Serv= new Servicio(nombreS,codigo,precioS);
	listaServicios.add(Serv);
	System.out.println("Desea ingresar otro Servicio(S/N): ");
	String res= input.nextLine();
        }
}

        
	public void editarServicio(){
	Scanner input= new Scanner(System.in);
	System.out.println("Ingrese el codigo del servicio: ");
	String codigoS= input.nextLine();
	Servicio busqueda= new Servicio(codigoS,"",0.0);
	if (listaServicios.contains(busqueda)){
	int ind = listaServicios.indexOf(busqueda);
	Servicio editServ= listaServicios.get(ind);
	}
	System.out.println("Ingrese el nuevo valor del precio");
	double newPrecio= input.nextDouble;
	editServ.setPrecio(newPrecio);
    	}
    
}
