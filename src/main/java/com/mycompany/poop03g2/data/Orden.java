/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Diego Contreras
 */
public class Orden {
    private String cliente;
    private String fechaServicio;
    private String tipoVehiculo;
    private String placaVehiculo;
    private ArrayList<Servicio> listaSer;
    private Scanner input;
    private List<Orden> listaOrdenes;
    
    ArrayList<Servicio> servRealizados = new ArrayList<>();
    public Orden(Scanner input){
        listaOrdenes = new ArrayList<>();
        this.input = input;
       
        this.listaOrdenes.add(new Orden("123456","19/11/2022","automóvil","GST-0984",servRealizados));
        this.listaOrdenes.add(new Orden("123457","Balanceo","bus","GNW-087",servRealizados));
        this.listaOrdenes.add(new Orden("123458","Frenos","motocicleta","PQR-988",servRealizados));
        this.listaOrdenes.add(new Orden("123459","Cambio Aceite","automóvil","OBB-444",servRealizados));

        
    }
        
  
    public Orden(String cliente, String fechaServicio, String tipoVehiculo, String placaVehiculo,ArrayList<Servicio> listaSer){
        this.cliente=cliente;
        this.fechaServicio=fechaServicio;
        this.tipoVehiculo=tipoVehiculo;
        this.placaVehiculo=placaVehiculo;
        this.listaSer = listaSer;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(String fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }
    
    @Override
    public String toString(){
        return "Cliente: "+cliente+", Fecha: "+fechaServicio+", Vehiculo: "+tipoVehiculo+", Placa: "+placaVehiculo+", Servicios:"+listaSer;
    }


    public Orden generarOrden(){
        Scanner sc= new Scanner(System.in);
        String res = "";
        String codSer = "";
        double valorTotal = 0.0;
        Orden orden = new Orden("","","","",servRealizados);
       
        System.out.println(" ");
        System.out.println("Ingrese el codigo del cliente: ");
        String codCli= sc.nextLine();
        System.out.println("Ingrese la fecha del Servicio(DD/MM/YYYY): ");
        String fechaServ= sc.nextLine();
        System.out.println("Ingrese el tipo de Vehiculo: ");
        String tipoVehi= input.nextLine();
        System.out.println("Ingrese la placa del vehiculo: ");
        String placaVehi= input.nextLine();
        while(!codSer.equals("-1")){
            System.out.println("Ingrese el codigo del Servicio: ");
            codSer= input.nextLine();
            Servicio busqueda= new Servicio(codSer,"",0.0);
            if (Servicio.listaServicios.contains(busqueda)){
                System.out.println("Ingrese cantidad del Servicio: ");
                int cantidad= sc.nextInt();
                int ind = Servicio.listaServicios.indexOf(busqueda);
                Servicio editServ= Servicio.listaServicios.get(ind);
                servRealizados.add(editServ);
                double precioServ = editServ.getPrecio()*cantidad;
                valorTotal += precioServ;
                orden= new Orden(codCli,fechaServ,tipoVehi,placaVehi,servRealizados);
                listaOrdenes.add(orden);
            }
            else{
                if(codSer.equals("-1")){
                    System.out.println("!! Su Orden fue registrada !!"); 
                }
                else{
                    System.out.println("!! No se econtro el servicio !!");
                }
            }
        }
            
        
        System.out.println(orden+", Valor a pagar: "+valorTotal);
        return orden;
    }
}
