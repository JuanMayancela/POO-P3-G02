/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;
<<<<<<< HEAD

import com.mycompany.poop03g2.PooP03G2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

=======
import java.util.Scanner;
>>>>>>> 4bfae9b23146f05cdc54bbf1e409bce19f89996d
/**
 *
 * @author mamay
 */
public class Tecnico extends Usuario {
    
    private Scanner input;
    private List<Tecnico> listaTecnicos;
    private char respuesta = '1';
    
    public Tecnico(Scanner input){
        listaTecnicos = new ArrayList<>();
        this.input = input;
        this.listaTecnicos.add(new Tecnico("alopez","al123456","Alvaro Lopez","tecnico"));
        this.listaTecnicos.add(new Tecnico("mbarcos","mb123456","Mario Barcods","tecnico"));
        PooP03G2.listaUsuarios.addAll(listaTecnicos);
    }

    public Tecnico(String usuario, String contraseña, String nombre, String nivel) {
        super(usuario, contraseña, nombre, nivel);
    }
    
    public void generarOrden(){
        Scanner input= new Scanner(System.in);
	System.out.println("Ingrese el codigo del cliente: ");
	String codCliente= input.nextLine();
	System.out.println("Ingrese la fecha del Servicio(DD/MM/YYYY): ");
	String fechaServ= input.nextLine();
	System.out.println("Ingrese el numero del tipo de Vehiculo: ");
	int tipoVehi= input.nextInt();
        System.out.println("Ingrese la placa del vehiculo: ");
	String placaVehi= input.nextLine();
	Orden ordenU= new Orden(codCliente,fechaServ,tipoVehi,placaVehi);
	String codigo= "0";
	double ValorTotal= 0.00;
        while(codigo!="-1"){
        System.out.println("Ingrese el codigo del Servicio: ");
	String codigoT= input.nextLine();
	Servicio busqueda= new Servicio(codigo,"",0.0);
        if (listaServicios.contains(busqueda)){
        System.out.println("Ingrese la cantidad del Servicio: ");
        int cantidad= input.nextInt()
	int ind = listaServicios.indexOf(busqueda);
	Servicio editServ= listaServicios.get(ind);
	double sP= editServ.getPrecio()*cantidad;
	ValorTotal+=sP;
        }       
        }      
}
    
    
    public void reportarStock(){
        Scanner input= new Scanner(System.in);
	System.out.println("Descripcion: ");
	String Descripcion= input.nextLine();
	System.out.println("Desea enviar una notificacion?(S/N): ");
	String vN= input.nextLine():
	if (vN.equals("S")){
	System.out.println("Enviando mensaje a WesterBlain2004@gmail.com);
	}
    
}