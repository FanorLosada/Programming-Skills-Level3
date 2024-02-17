import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int opcionSeleccionada; 
        
        do {
            System.out.println("Tottenham");
            System.out.println("1. Generar formacion aleatoria: ");
            System.out.println("2. Salir");
            opcionSeleccionada = sc.nextInt();

            switch (opcionSeleccionada) { 
                    
                case 1:      
                    System.out.println("Equipo: ");
                    
                    System.out.println("Portero");
                    System.out.println("--------------");
                    PorteroT p1 = new PorteroT(); 
                    p1.obtenerPortero(); 
                    
                    System.out.println("--------------");
                    System.out.println("Defensores");
                    DefensorT def1 = new DefensorT();
                    def1.obtenerDefensor();  
                    
                    System.out.println("--------------");
                    System.out.println("Centrocampistas");
                    CentrocampistaT c1 = new CentrocampistaT();
                    c1.obtenerCentrocampista();
                    
                    System.out.println("--------------");
                    System.out.println("Delanteros");
                    DelanteroT del1 = new DelanteroT(); 
                    del1.obtenerDelantero();
                    opcionSeleccionada = 2; 
                    break; 
            }
        } while (opcionSeleccionada != 2);
        
        do{
            
            System.out.println("Manchester United");
            System.out.println("1. Generar mejor formacion: ");
            System.out.println("2. Salir");
            
            opcionSeleccionada = sc.nextInt(); 
            
            switch(opcionSeleccionada){
                case 1: 
                    
                    System.out.println("Portero");
                    System.out.println("------------------");
                    PorteroM p = new PorteroM();
                    System.out.println(p.valorMayor());
                    
                    System.out.println("-------------------");
                    System.out.println("Defensa");
                    DefensaM d = new DefensaM();
                    d.mejoresDefensas();

                    System.out.println("-------------------");
                    System.out.println("Centrocampista");                    
                    CentrocampistaM c = new CentrocampistaM();
                    c.valoresMaximo();

                    System.out.println("-------------------");
                    System.out.println("Delantero");                    
                    DelanteroM dl = new DelanteroM();
                    dl.mejoresDelanteros();
                    break; 
            }  
        }while(opcionSeleccionada !=2);  
    }
}       

