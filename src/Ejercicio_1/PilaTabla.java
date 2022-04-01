package Ejercicio_1;

import java.util.Arrays;
import java.util.Scanner;

public class PilaTabla implements Pila{

    static Scanner sc = new Scanner(System.in);

    //atributos
    private static Integer [] tablita;
    private static int indiceCima=-1;


    //constructores
    public PilaTabla(){
        this.tablita=new Integer[10];
    }

    public PilaTabla(int tamanio){
        this.tablita=new Integer[10];
    }



    //metodos

    /**
     * Metodo que indica con true o false si la pila está o no vacía
     * Precondición: debe existir el atributo indiceCima
     * Postcondición: ninguna
     * @return booleano
     */
    @Override
    public boolean pilaVacia(){
        return indiceCima == -1;
    }



    /**
     * Metodo que indica con un true o false si la pila está llena
     * Precondición:
     * Postcondición:
     * @return booleano
     */

    public boolean pilaLlena(){
        return indiceCima == tablita.length-1;
    }



    /**
     * Metodo que delvuelve el valor del elemento en la cima si la pila tiene alguno, y devuelve null si
     * está vacia
     * Precondición:
     * Postcondición:
     * @return Integer
     */
    @Override
    public Integer devolverCima(){
        Integer elemento;

        if (!pilaVacia()){
            elemento = tablita[indiceCima];
        }else{ elemento = null;}

        return elemento;
    }



    /**
     * Metodo para apilar un elemento, redimensionándola si es necesario
     * Precondición:
     * Postcondición:
     *
     * @param num
     */
    @Override
    public void apilar(int num) {
        if (pilaLlena()) {
            PilaTabla.tablita = Arrays.copyOf(PilaTabla.tablita, PilaTabla.tablita.length + 10);
        }
        PilaTabla.indiceCima++;
        PilaTabla.tablita[PilaTabla.indiceCima] = num;
    }



    /**
     * Metodo para
     *
     * @return
     */
    @Override
    public Integer desapilar() {
        Integer valor;

        if (pilaVacia()) {
            valor = null;
        } else {
            valor = PilaTabla.tablita[PilaTabla.indiceCima];
            PilaTabla.tablita[PilaTabla.indiceCima] = null;
            PilaTabla.indiceCima--;
        }
        return valor;
    }



    /**
     * Metodo que devuelve el número de elementos que tiene el Integer
     * Precondición:
     * Postcondición:
     * @return int
     */
    @Override
    public int devolverNumElementos(){
        return indiceCima+1;
    }



    /**
     Metodo que imprime el array por pantalla
     * @return String
     */
    @Override
    public String toString() {
        return "El array es de: " + Arrays.toString(tablita);
    }
}
