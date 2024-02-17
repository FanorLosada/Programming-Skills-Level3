package Alquileres;

import java.util.ArrayList;
import java.util.Scanner;

public class Vivienda {
    
    private int tamaño; 
    private int numeroHabitaciones; 
    private int numeroBaños; 
    int vivienda; 
    
    Scanner sc = new Scanner(System.in); 
    
    public Vivienda() {
    }

    
    public Vivienda(int tamaño, int numeroHabitaciones, int numeroBaños) {
        this.tamaño = tamaño;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public void mostrarViviendas(ArrayList<Vivienda> viviendas) {
        
        int indice = 1; 
        
        for (Vivienda vivienda: viviendas) {
            System.out.println("Vivienda: "+indice);
            System.out.println("Tamaño: "+vivienda.getTamaño());
            System.out.println("Numero habitaciones: "+vivienda.getNumeroHabitaciones());
            System.out.println("----------------------------------------");
            indice++; 
        }        
    }
    
    public String precioVivienda(ArrayList<Vivienda> viviendas){
        
        int preMCuadrado = 0;        
        int preHabitacion = 0; 
        int preBanos = 0;
        
        System.out.println("Seleccione la vivienda,por numero");
        int opcion = sc.nextInt();
        
        //Metros cuadrados
        switch(opcion){
            case 1:
                preMCuadrado = 200 * 90;
                break;
            case 2:
                preMCuadrado = 150 * 90;
                break;
            case 3:
                preMCuadrado = 100 * 90;
                break;
            case 4:
                preMCuadrado = 100 * 90;
                break;
            case 5:
                preMCuadrado = 80 * 90;
                break;                
        }
        
        //Habitaciones
        switch(opcion){
            case 1:
                preHabitacion = 3 * 40;
                break;

            case 2:
            case 3:
                preHabitacion = 2 * 40;
                break;
                
            case 4:
            case 5:    
                preHabitacion = 1 * 40;
                break;                  
        }       
        
        //Baños
        switch (opcion) {
            case 1:
            case 2:
            case 4:    
                preBanos = 2 * 30;
                break;
            case 3:
            case 5:    
                preBanos = 1 * 30;
                break;
        }
         return "El precio de alquiler de la clasa es de: "+(preMCuadrado+preHabitacion+preBanos)+" dolares";
    }
    
    
}
