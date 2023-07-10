import javax.swing.*;

public class Calculator {

    double numero1;
    double numero2;
    double resultado;

    public Calculator() {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    //Función sumar
    public double suma(double numero1, double numero2){
        return numero1 + numero2;
    }

    //Función restar
    public double resta(double numero1, double numero2){
        return numero1 - numero2;
    }

    //Función multiplicación
    public double multiplicacion(double numero1, double numero2){
        return numero1 * numero2;
    }

    //Función división
    public double division(double numero1, double numero2){
        return numero1 / numero2;
    }
}