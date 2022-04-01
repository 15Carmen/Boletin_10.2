package Ejercicio_1;

public interface Pila {

    //declaro en mi interfaz que voy a obligar a las clases que la implementen a usar y definir
    boolean pilaVacia();

    Integer devolverCima();

    void apilar(int num);

    Integer desapilar();

    int devolverNumElementos();
}
