package Ejercicio_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Llamo a la interfaz pila y creo de cada clase una tabla
        Pila pilaTabla = new PilaTabla();
        Pila pilaLista = new PilaLista();

        //prueba pila vacia
        System.out.println("La pila esta vacia? si=true, no=false");
        System.out.println(pilaTabla.pilaVacia());

        System.out.println();

        System.out.println("La pila esta vacia? si=true, no=false");
        System.out.println(pilaLista.pilaVacia());

        //pruebas de apilar
        pilaTabla.apilar(8);
        pilaTabla.apilar(3);
        pilaTabla.apilar(12);
        pilaTabla.apilar(67);
        pilaTabla.apilar(15);
        pilaTabla.apilar(93);
        pilaTabla.apilar(752);
        pilaTabla.apilar(41);
        pilaTabla.apilar(37);
        pilaTabla.apilar(0);
        pilaTabla.apilar(5);
        pilaTabla.apilar(40);

        System.out.println(pilaTabla);

        pilaLista.apilar(1);
        pilaLista.apilar(2);
        pilaLista.apilar(3);
        pilaLista.apilar(4);
        pilaLista.apilar(5);
        pilaLista.apilar(6);
        pilaLista.apilar(7);
        pilaLista.apilar(8);
        pilaLista.apilar(9);
        pilaLista.apilar(10);
        pilaLista.apilar(11);
        pilaLista.apilar(12);
        pilaLista.apilar(13);
        pilaLista.apilar(14);

        System.out.println(pilaLista);

        //pruebas de desapilar
        pilaTabla.desapilar();

        System.out.println();
        System.out.println(pilaTabla);

        pilaLista.desapilar();
        System.out.println(pilaLista);

        //pruebas devolver cima

        System.out.println();
        System.out.println("El ultimo numero añadido a la tabla 1 es:"+pilaTabla.devolverCima());
        System.out.println("El ultimo numero añadido a la tabla 2 es:"+pilaLista.devolverCima());

        //pruebas de devolver el número de elementos de cada lista
        System.out.println();
        System.out.println("La tabla 1 tiene "+pilaTabla.devolverNumElementos()+" elementos");
        System.out.println("La tabla 2 tiene "+pilaLista.devolverNumElementos()+" elementos");







    }
}
