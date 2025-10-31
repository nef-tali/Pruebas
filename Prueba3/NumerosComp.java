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
    public int sumaPReal(NumerosComp otro) {

        return pReal + otro.pReal;
    }
    public int sumaPImaginario(NumerosComp otro) {

        return pImaginario + otro.pImaginario;
    }
    public int multiplica(NumerosComp otro) {
        int multiplicacion;
        multiplicacion = (((pReal * otro.pReal) - (pReal * otro.pImaginario)) + ((otro.pReal * pImaginario) + (pImaginario * otro.pImaginario)));
        return multiplicacion;
    }
    public String compara (NumerosComp otro) {
        if (this.pReal == otro.pReal && this.pImaginario == otro.pImaginario) {
            return "Los numeros complejos son iguales";
        } else {
            return "Los numeros complejos son diferentes";
        }
    }
    public String multiplicaPEntero (int entero) {
        String multiplicacionEntero;
        multiplicacionEntero = ("El resultado de la multiplicacion es: "+"("+(pReal * entero)+", " + (pImaginario * entero)+"i)");
        return multiplicacionEntero;
    }
    
}