// Ismael Ouardane El Ghali
package hundirFlota1;


public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando partida");

        Juego j = new Juego();
        Tablero t = new Tablero();

        j.posBarco(j.generarBarcos());


    }
}