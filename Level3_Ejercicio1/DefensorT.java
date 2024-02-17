
import java.util.HashMap;
import java.util.Random;

public class DefensorT {
    
     Random random = new Random();
    
    public void obtenerDefensor() {

       
        HashMap<String, Integer> defensoresTottenham = new HashMap<>();
        defensoresTottenham.put("Eric Dier", 80);
        defensoresTottenham.put("Cristian Romero", 80);
        defensoresTottenham.put("Davinson Sánchez", 74);
        defensoresTottenham.put("Japhet Tanganga", 70);
        defensoresTottenham.put("Matt Doherty", 70);
        defensoresTottenham.put("Djed Spence", 70);
        defensoresTottenham.put("Sergio Reguilón", 74);
        defensoresTottenham.put("Ben Davies", 76);
        defensoresTottenham.put("Joe Rodon", 70);
        defensoresTottenham.put("Mislav Orsic", 71);
        
        HashMap<String, Integer> defensoresSeleccionados = new HashMap<>();
        
        int veces = 4; 
        
        for (int i = 0; i < veces; i++) {
            
            Object[] llaves = defensoresTottenham.keySet().toArray();
            int indice = random.nextInt(llaves.length);
            String defensor = (String) llaves[indice];
            int puntaje = defensoresTottenham.get(defensor);
            
            defensoresSeleccionados.put(defensor,puntaje);
        } 
        
        for (HashMap.Entry<String, Integer> entry : defensoresSeleccionados.entrySet()) {
            System.out.println("Jugador: " +entry.getKey() + "\nPuntaje:" + entry.getValue());
        }
    }  
}
