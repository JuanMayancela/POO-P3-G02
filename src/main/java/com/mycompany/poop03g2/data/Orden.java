/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;

/**
 *
 * @author Diego Contreras
 */
public class Orden {
        private String codigoCliente;
	private String fechaServicio;
	private int tipoVehiculo;
	private String placaVehiculo;

public Orden(String codigoCliente, String fechaServicio, int tipoVehiculo, String placaVehiculo){
	this.codigoCliente=codigoCliente;
	this.fechaServicio=fechaServicio;
	this.tipoVehiculo=tipoVehiculo;
	this.placaVehiculo=placaVehiculo;
}
	public String getCodigoCliente() {
        return codigoCliente;
    	}

    	public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    	}

	public String getFechaServicio() {
        return fechaServicio;
    	}

    	public void setFechaServicio(String fechaServicio) {
        this.fechaServicio = fechaServicio;
    	}

    	public int getTipoVehiculo() {
        return tipoVehiculo;
    	}

    	public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    	}

   	public String getPlacaVehiculo() {
        return placaVehiculo;
    	}

    	public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    	}

    
}
