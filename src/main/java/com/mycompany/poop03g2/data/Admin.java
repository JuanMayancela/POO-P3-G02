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
public class Admin extends Usuario {
    
    private Scanner input;
    private List<Admin> listaAdmins;
    private char respuesta = '1';
    
    public Admin(Scanner input){
        listaAdmins = new ArrayList<>();
        this.input = input;
        this.listaAdmins.add(new Admin("admin1","12345678","Administrador","admin"));
        PooP03G2.listaUsuarios.addAll(listaAdmins);
    }

    public Admin(String usuario, String contraseña, String nombre, String nivel) {
        super(usuario, contraseña, nombre, nivel);
    }
    
    
}
