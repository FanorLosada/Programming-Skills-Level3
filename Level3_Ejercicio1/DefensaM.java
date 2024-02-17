
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefensaM extends Jugador{

    public DefensaM() {
    }

    public DefensaM(String nombre, int puntaje) {
        super(nombre, puntaje);
    }
    
    public void mejoresDefensas() {

        DefensaM d1 = new DefensaM("Victor Lindelöf", 80);
        DefensaM d2 = new DefensaM("Harry Maguire", 82);
        DefensaM d3 = new DefensaM("Lisandro Martínez", 82);
        DefensaM d4 = new DefensaM("Tyrell Malacia", 67);
        DefensaM d5 = new DefensaM("Raphaël Varane", 80);
        DefensaM d6 = new DefensaM("Diogo Dalot", 89);
        DefensaM d7 = new DefensaM("Luke Shaw", 89);
        DefensaM d8 = new DefensaM("Aaron Wan-Bissaka", 70);
        DefensaM d = new DefensaM();

        List<DefensaM> listaDefensa = new ArrayList<>();
        listaDefensa.add(d1);
        listaDefensa.add(d2);
        listaDefensa.add(d3);
        listaDefensa.add(d4);
        listaDefensa.add(d5);
        listaDefensa.add(d6);
        listaDefensa.add(d7);
        listaDefensa.add(d8);

        Collections.sort(listaDefensa, (DefensaM a, DefensaM b) -> Integer.compare(b.getPuntaje(), a.getPuntaje()));

        for (int i = 0; i < 3; i++) {
            DefensaM defensa = listaDefensa.get(i);
            System.out.println("Nombre: " + defensa.getNombre() + "\nPuntaje: " + defensa.getPuntaje());
        }

    }
    
}
