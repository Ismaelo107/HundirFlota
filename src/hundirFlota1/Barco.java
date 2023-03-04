// Ismael Ouardane El Ghali
package hundirFlota1;

public class Barco {
    private String nombre;
    private int tamanio;
    private boolean hundido;

    private int clave;

    public Barco() {
    }

    public Barco(String nombre, int tamanio, boolean hundido, int clave) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.hundido = hundido;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }

    @Override
    public String toString() {
        return nombre + ":  Tamaño: " + tamanio + " Hundido: " + hundido + " Posición: ";
    }

    //MÉTODOS TODO

    public void hundirBarco() {
    }
}
