/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistra.TADS;

import java.util.LinkedList;

public interface Grafo<E> {

    void insertar_vertice(E x);

    void modificar_arista(int i, int j);

    E obtener_vertice(int i);

    void insertar_arista(int vertice_inicial, int vertice_final, int costo, Object x);

    int costo_arista(int i, int j);

    int tamaño();

    LinkedList<E> sucesores(int i);

    String mostrar();
    final int infinito = 999999999;

}
