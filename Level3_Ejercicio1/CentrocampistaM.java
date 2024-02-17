import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CentrocampistaM extends Jugador{

    public CentrocampistaM() {
    
    }

    public CentrocampistaM(String nombre, int puntaje) {
        super(nombre, puntaje);
    }
       
    public void valoresMaximo() {

        CentrocampistaM c1 = new CentrocampistaM("Sofyan Amrabat", 76);
        CentrocampistaM c2 = new CentrocampistaM("Scott McTominay", 80);
        CentrocampistaM c3 = new CentrocampistaM("Bruno Fernandes", 88);
        CentrocampistaM c4 = new CentrocampistaM("Christian Eriksen", 67);
        CentrocampistaM c5 = new CentrocampistaM("Mason Mount", 77);
        CentrocampistaM c6 = new CentrocampistaM("Kobbie Mainoo", 65);
        CentrocampistaM c7 = new CentrocampistaM("Daniel Gore", 60);


        List<CentrocampistaM> centrocampista = new ArrayList<>();
        centrocampista.add(c1);
        centrocampista.add(c2);
        centrocampista.add(c3);
        centrocampista.add(c4);
        centrocampista.add(c5);
        centrocampista.add(c6);
        centrocampista.add(c7);

        Collections.sort(centrocampista, (CentrocampistaM a, CentrocampistaM b) -> Integer.compare(b.getPuntaje(), a.getPuntaje()));

        for (int i = 0; i < 3; i++) {
            CentrocampistaM centrocampistaActual = centrocampista.get(i);
            System.out.println("Nombre: " + centrocampistaActual.getNombre() + "\nPuntaje" + centrocampistaActual.getPuntaje());
        }
    }
}
