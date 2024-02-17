
import java.util.HashMap;
import java.util.Random;

public class CentrocampistaT {


    Random random = new Random();

    public void obtenerCentrocampista() {

        HashMap<String, Integer> centrocampistasTottenham = new HashMap<>();
        centrocampistasTottenham.put("Oliver Skipp", 70);
        centrocampistasTottenham.put("Pierre-Emile Højbjerg", 70);
        centrocampistasTottenham.put("Yves Bissouma", 72);
        centrocampistasTottenham.put("James Maddison", 74);
        centrocampistasTottenham.put("Giovani Lo Celso", 78);
        centrocampistasTottenham.put("Ryan Sessegnon", 80);
        centrocampistasTottenham.put("Dejan Kulusevski", 60);
        centrocampistasTottenham.put("Pape Sarr", 65);
        centrocampistasTottenham.put("Rodrigo Bentancur", 65);

        int veces = 3; 
        
        HashMap<String, Integer> centrocampistaSeleccionados = new HashMap<>();
        
        for (int i = 0; i < veces; i++) {
            
            Object[] keys = centrocampistasTottenham.keySet().toArray();
            int indice = random.nextInt(keys.length);
            String centrocampista = (String) keys[indice];
            int puntaje = centrocampistasTottenham.get(centrocampista);
            
            centrocampistaSeleccionados.put(centrocampista,puntaje); 
        }
        
        for (HashMap.Entry<String, Integer> entry: centrocampistaSeleccionados.entrySet()) {
            System.out.println("Jugador: "+ entry.getKey()+ "\nPuntaje:"+entry.getValue());
        } 
    }
}
