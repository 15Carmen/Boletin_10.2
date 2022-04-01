package Ejercicio_1;

import java.util.ArrayList;

public class PilaLista implements Pila{

    //atributos
    static ArrayList<Integer> listita = new ArrayList<>();
    private static int indiceCima=-1;

    //constructores

    public PilaLista(ArrayList<Integer> listita) {
        this.listita = listita;
    }

    public PilaLista() {

    }


    //metodos


    @Override
    public boolean pilaVacia(){
        return indiceCima == -1;
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
            elemento = listita.get(indiceCima);
        }else{ elemento = null;}

        return elemento;
    }

    /**
     * Metodo para apilar un elemento, redimensionándola si es necesario
     * Precondición:
     * Postcondición:
     *
     */
    @Override
    public void apilar(int num) {
        listita.add(num);
        indiceCima++;
    }


    /**
     * Metodo para eliminar del array los últimos datos de este
     * Precondición:
     * Postcondición:
     *
     * @return Integer
     */
    @Override
    public Integer desapilar() {
        Integer valor;

        if (pilaVacia()) {
            valor = null;
        } else {
            valor = PilaLista.listita.get(PilaLista.indiceCima);
            listita.remove(valor);
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
    @Override
    public int devolverNumElementos(){
        return listita.size();
    }



    /**
     * Metodo que imprime el array por pantalla
     * @return String
     */
    @Override
    public String toString() {
        return "Los numeros son: " + listita.toString();
    }


}
