/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop03g2.data;

import com.mycompany.poop03g2.PooP03G2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mamay
 */
public class Cobranza extends Usuario{
    
    private Scanner input;
    private List<Cobranza> listaCobranzas;
    
    
    public Cobranza(Scanner input){
        listaCobranzas = new ArrayList<>();
        this.input = input;
        this.listaCobranzas.add(new Cobranza("mcastro","mc123456","Mario Castro","cobranzas"));
        PooP03G2.listaUsuarios.addAll(listaCobranzas);
        
    }

    public Cobranza(String usuario, String contraseña, String nombre, String nivel) {
        super(usuario, contraseña, nombre, nivel);
    }
    
    public void generarFactura(){
        
    }
    
    public void reporteIngresos(){
        
    }
    
    public void reporteAtencionTecnico(){
        
    }
    
    
    
}
