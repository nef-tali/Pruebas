public class Tablero {

    private int posY;
    private int posX;

    public Tablero(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
    public int moverArriba(int pasos) {
        this.posY += pasos;
        return this.posY;    
    }
    public int moverAbajo(int pasos) {
        this.posY -= pasos;
        return this.posY;    
    }
    public int moverDerecha(int pasos) {
        this.posX += pasos;
        return this.posX;   
    }
    public int moverIzquierda(int pasos) {
        this.posX -= pasos;
        return this.posX;    
    }
    public String obtenerPosicion() {
        return "Posición actual -> X: " + this.posX + ", Y: " + this.posY;
    }
    public int getPosX() {
        return this.posX;
    }
    public int getPosY() {
        return this.posY;
    }
    

}