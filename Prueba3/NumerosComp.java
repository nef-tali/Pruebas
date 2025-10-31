package Prueba3;

public class NumerosComp {

    private int pReal;
    private int pImaginario;

    public NumerosComp(int pReal, int pImaginario) {
        this.pReal = pReal;
        this.pImaginario = pImaginario;
    }
    public int getpReal() {
        return pReal;
    }
    public int getpImaginario() {
        return pImaginario;
    }
    public int sumaPReal() {

        return pReal + pReal;
    }
    public int sumaPImaginario() {

        return pImaginario + pImaginario;
    }
    public int multiplica() {
        int multiplicacion;
        multiplicacion = (((pReal * pReal) - (pReal * pImaginario)) + ((pReal * pImaginario) + (pImaginario * pImaginario)));
        return multiplicacion;
    }
    public String compara (NumerosComp otro) {
        if (this.pReal == otro.pReal && this.pImaginario == otro.pImaginario) {
            return "Los numeros complejos son iguales";
        } else {
            return "Los numeros complejos son diferentes";
        }
    }
    public int multiplicaPEntero (int entero) {
        int multiplicacionEntero;
        multiplicacionEntero = ((pReal * entero) + (pImaginario * entero));
        return multiplicacionEntero;
    }
    
}