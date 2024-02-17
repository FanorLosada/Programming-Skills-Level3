package Alquileres;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Vivienda v1 = new Vivienda(200, 3, 2);
        Vivienda v2 = new Vivienda(150, 2, 2);
        Vivienda v3 = new Vivienda(100, 2, 1);
        Vivienda v4 = new Vivienda(100, 1, 2);
        Vivienda v5 = new Vivienda(80, 1, 1);
        Vivienda v = new Vivienda(); 
        
        ArrayList<Vivienda> viviendas = new ArrayList<>();
        viviendas.add(v1);
        viviendas.add(v2);
        viviendas.add(v3);
        viviendas.add(v4);
        viviendas.add(v5);  
        
        int opcionSeleccionada; 
        
        do{
            System.out.println("1. Mostrar vivienda");
            System.out.println("2. Salir");
            opcionSeleccionada = sc.nextInt(); 
            
            switch(opcionSeleccionada){
                case 1: 
                    
                    System.out.println("Seleccione la vivienda: ");
                    v.mostrarViviendas(viviendas);
                    System.out.println(v.precioVivienda(viviendas));
                    break; 
            }
        }while(opcionSeleccionada != 2); 
    }
}
