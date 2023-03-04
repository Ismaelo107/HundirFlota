// Ismael Ouardane El Ghali
package hundirFlota1;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Barco> barcos;
    private Tablero tablero;


    public Juego() {
        this.barcos = new ArrayList<>();
        this.tablero = new Tablero();
    }

    public ArrayList<Barco> generarBarcos() {
        this.barcos.add(new Barco("PortaAviones", 4, false, 0));
        this.barcos.add(new Barco("Buque1", 3, false, 2));
        this.barcos.add(new Barco("Buque2", 3, false, 3));
        this.barcos.add(new Barco("Crucero1", 2, false, 4));
        this.barcos.add(new Barco("Crucero2", 2, false, 5));
        this.barcos.add(new Barco("Crucero3", 2, false, 6));
        this.barcos.add(new Barco("Submarino1", 1, false, 7));
        this.barcos.add(new Barco("Submarino2", 1, false, 8));
        this.barcos.add(new Barco("Submarino3", 1, false, 9));
        this.barcos.add(new Barco("Submarino4", 1, false, 10));
        return this.barcos;
    }

    public void posBarco(ArrayList<Barco> barcos) {
        for (Barco p : barcos) {
            tablero.posicionarBarco(p);
        }
        tablero.mostrarTablero();
    }
}





























