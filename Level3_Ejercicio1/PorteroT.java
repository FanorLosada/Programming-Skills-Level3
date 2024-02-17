import java.util.HashMap;
import java.util.Random;

public class PorteroT {
   
    Random random = new Random();
    
    public void obtenerPortero() {
        
        HashMap<String, Integer> porterosTottenham = new HashMap<>();
        porterosTottenham.put("Hugo Lloris", 85);
        porterosTottenham.put("Guglielmo Vicario", 79);
        porterosTottenham.put("Fraser Forster", 79);
        porterosTottenham.put("Brandon Austin", 79);

        Object[] llavesp = porterosTottenham.keySet().toArray();

        int indicePortero = random.nextInt(llavesp.length);
        String portero = (String) llavesp[indicePortero];
        int puntajePortero = porterosTottenham.get(portero);
        
        System.out.println("Jugador: "+portero+",\nPuntaje: "+puntajePortero);
        
    }  
}
