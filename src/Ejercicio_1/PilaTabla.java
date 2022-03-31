package Ejercicio_1;

import java.util.Arrays;
import java.util.Scanner;

public class PilaTabla {

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
    public static boolean pilaVacia(){
        return indiceCima == -1;
    }

    /**
     * Metodo que indica con un true o false si la pila está llena
     * Precondición:
     * Postcondición:
     * @return booleano
     */
    public static  boolean pilaLlena(){
        return indiceCima == tablita.length-1;
    }

    /**
     * Metodo que delvuelve el valor del elemento en la cima si la pila tiene alguno, y devuelve null si
     * está vacia
     * Precondición:
     * Postcondición:
     * @return Integer
     */
    public static Integer devolverCima(){
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
     * @param num
     */
    public static void apilar(int num){
        if (pilaLlena()){
            tablita = Arrays.copyOf(tablita, tablita.length+10);
        }
        indiceCima++;
        tablita[indiceCima]=num;
    }


    public static Integer desapilar(){
        Integer valor;

        if (pilaVacia()){
            valor=null;
        }else {
            valor=tablita[indiceCima];
            tablita[indiceCima]=null;
            indiceCima--;
        }
        return valor;
    }

    /**
     * Metodo que devuelve el número de elementos que tiene el Integer
     * Precondición:
     * Postcondición: 
     * @return int
     */
    public int devolverNumElementos(){
        return indiceCima+1;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return Arrays.toString(tablita);
    }
}
