
import java.util.HashMap;
import java.util.Random;

public class DelanteroT {

    Random random = new Random();
    
    
    public void obtenerDelantero() {
        
        HashMap<String, Integer> delanterosTottenham = new HashMap<>();
        delanterosTottenham.put("Son Heung-Min", 78);
        delanterosTottenham.put("Richarlison", 82);
        delanterosTottenham.put("Bryan Gil", 80);
        delanterosTottenham.put("Timo Werner", 82);
        delanterosTottenham.put("Brennan Johnson", 70);
        delanterosTottenham.put("Manor Solomon", 70);
        delanterosTottenham.put("Alejo Véliz", 75);
        delanterosTottenham.put("Dane Scarlett", 75);
    
        HashMap<String, Integer> delanteroSeleccionado = new HashMap<>();

        int veces = 3; 
        
        for (int i = 0; i < veces; i++) {
            Object[] keys = delanterosTottenham.keySet().toArray();
            int indice = random.nextInt(keys.length);
            String delantero = (String) keys[indice];
            int puntaje = delanterosTottenham.get(delantero);
            
            delanteroSeleccionado.put(delantero, puntaje); 
        }
        
        for (HashMap.Entry<String, Integer> entry: delanteroSeleccionado.entrySet()) {
            System.out.println("Jugador: "+entry.getKey()+"\nPuntaje:"+entry.getValue());
        } 
    }
}
