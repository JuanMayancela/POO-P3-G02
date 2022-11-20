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
        
    }
    
    public void reportarStock(){
    }
    
}
