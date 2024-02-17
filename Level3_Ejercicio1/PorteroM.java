import java.util.ArrayList;
import java.util.List;

public class PorteroM extends Jugador{

    
    public PorteroM() {
    }    
    
    public PorteroM(String nombre, int puntaje) {
        super(nombre, puntaje);
    }
    
    public String valorMayor(){

        PorteroM p1 = new PorteroM("André Onana", 80);
        PorteroM p2 = new PorteroM("Tom Heaton", 75);
        PorteroM p3 = new PorteroM("Altay Bayindir", 69);
        
        List<PorteroM> porteros = new ArrayList<>();
        porteros.add(p1);
        porteros.add(p2);
        porteros.add(p3);
        
        PorteroM valorMaximo = porteros.get(0); 
        
        for (PorteroM portero: porteros) {
            if(portero.getPuntaje() > valorMaximo.getPuntaje()){
                valorMaximo = portero; 
            }
        }
        
        return "Nombre: "+ valorMaximo.getNombre()+ "\nPuntaje: "+valorMaximo.getPuntaje();   
    }     
}