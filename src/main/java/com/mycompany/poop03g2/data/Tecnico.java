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
 * @author Juan Mayancela
 */
public class Tecnico extends Usuario {
    
    private int stock;
    private String implemento;
    private Scanner input;
    protected static List<Tecnico> listaTecnicos;
    private List<Tecnico> listaImplementos;
    private final String email = "responsableInsumos@gmail.com";
    
    
    public Tecnico(Scanner input){
        listaTecnicos = new ArrayList<>();
        this.input = input;
        this.listaTecnicos.add(new Tecnico("alopez","al123456","Alvaro Lopez","tecnico"));
        this.listaTecnicos.add(new Tecnico("mbarcos","mb123456","Mario Barcods","tecnico"));
        PooP03G2.listaUsuarios.addAll(listaTecnicos);
        listaImplementos = new ArrayList<>();
    }

    public Tecnico(String usuario, String contraseña, String nombre, String nivel) {
        super(usuario, contraseña, nombre, nivel);
    }
    
    public Tecnico(String implemento, int stock){
   
        this.implemento = implemento;
        this.stock = stock;
        
    }
    
       public static List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }
    
    
    @Override
    public String toString(){
        return "Implemento: "+implemento+", Stock: "+stock;
    }
    
    public void reportarStock(){
        Scanner sc= new Scanner(System.in);
        String res = "";
        do{
            System.out.println(" ");
            System.out.println("Ingrese nombre del implemento a reportar: ");
            String imple= sc.nextLine();
            System.out.println("Ingrese la cantidad de stock faltante: ");
            int stc= sc.nextInt();
            sc.nextLine();
            Tecnico implemen = new Tecnico(imple,stc);
            listaImplementos.add(implemen);
            System.out.println("Desea agregar otro implemento?(S/N): ");
            res = sc.nextLine();
            System.out.println(" ");
            
        }while(res.equals("S"));
        
            System.out.println("Desea enviar una notificacion?(S/N): ");
            String noti= sc.nextLine();
            if (noti.equals("S")){
                System.out.println("lista de elementos con su stock faltante: "+listaImplementos);
                System.out.println("Enviando mensaje a: "+email);
            } 
            else{
                 System.out.println("!! Gracias por su reporte !!");
            }
    }
    
}