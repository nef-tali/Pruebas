public class Atleta {
    int num, tiempo;
    String nombre;

    public Atleta(int num, String nombre, int tiempo) {
        this.num = num;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public int getTiempo() {
        return tiempo;
    }
    public String mostrarDatos() {
        return "Número: " + num + ", Nombre: " + nombre + ", Tiempo: " + tiempo + " segundos";
    }
}
