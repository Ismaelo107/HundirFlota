// Ismael Ouardane El Ghali
package hundirFlota1;


import java.util.Random;

public class Tablero {
    private int[][] tablero = new int[10][10];

    // CONSTRUCTOR QUE INICIALIZA EL TABLERO A 0
    public Tablero() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                this.tablero[i][j] = 0;
            }
        }
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }


    public void mostrarTablero() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                System.out.print(this.tablero[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

    public void posicionarBarco(Barco b) {
        Random rn = new Random();
        int ran = rn.nextInt(11), ran2 = rn.nextInt(11);

        try {


            if (posicioVH() != 0) {

                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero.length; j++) {
                        for (int k = 0; k < b.getTamanio(); k++) {
                            if (k + ran < 10) {
                                if (ran + k < 10) {
                                    tablero[ran][ran2] = b.getTamanio();
                                    tablero[ran + k][ran2] = b.getTamanio();
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero.length; j++) {
                        for (int k = 0; k < b.getTamanio(); k++) {
                            if (k + ran2 < 10) {
                                tablero[ran][ran2] = b.getTamanio();
                                tablero[ran][ran2 + k] = b.getTamanio();
                            }

                        }
                    }
                }
            }
            System.out.println(b.toString() + "(" + ran + "," + ran2 + ")");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("SE SALE");
        }
    }


    public int posicioVH() {
        Random rn = new Random();
        int ran = rn.nextInt(2);

        if (ran == 0) {
            // HORIZONTAL
            return 0;
        } else {
            // VERTICAL
            return 1;
        }
    }


}
