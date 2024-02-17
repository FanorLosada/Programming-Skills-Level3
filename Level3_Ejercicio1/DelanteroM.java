
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DelanteroM extends Jugador{

    public DelanteroM() {
    }

    public DelanteroM(String nombre, int puntaje) {
        super(nombre, puntaje);
    }
    
    public void mejoresDelanteros() {

        DelanteroM de1 = new DelanteroM("Anthony Martial", 50);
        DelanteroM de2 = new DelanteroM("Marcus Rashford", 76);
        DelanteroM de3 = new DelanteroM("Antony", 75);
        DelanteroM de4 = new DelanteroM("Rasmus Højlund", 80);
        DelanteroM de5 = new DelanteroM("Alejandro Garnacho", 85);
        DelanteroM de6 = new DelanteroM("Facundo Pellistri", 75);      

        List<DelanteroM> listaDelantero = new ArrayList<>();
        listaDelantero.add(de1);
        listaDelantero.add(de2);
        listaDelantero.add(de3);
        listaDelantero.add(de4);
        listaDelantero.add(de5);
        listaDelantero.add(de6);

        Collections.sort(listaDelantero, (DelanteroM a, DelanteroM b) -> Integer.compare(b.getPuntaje(), a.getPuntaje()));

        for (int i = 0; i < 3; i++) {

            DelanteroM delantero = listaDelantero.get(i);
            System.out.println("Nombre: " + delantero.getNombre() + "\nPuntaje: " + delantero.getPuntaje());
        }
    }
}
