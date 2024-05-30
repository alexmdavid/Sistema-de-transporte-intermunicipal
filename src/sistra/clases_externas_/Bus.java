/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases_externas_;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Bus implements Serializable {

    private int id_bus;
    private int[][] asientos;
    private boolean disponible;

    public Bus(int id_bus, boolean disponible) {
        this.id_bus = id_bus;
        this.disponible = disponible;
        asientos = new int[4][10];
    }

    public void iniciar_bus() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                asientos[i][j] = 0;
            }

        }
    }

    private int[] convertir_asiento_a_indices(String identificador) {
        Pattern pattern = Pattern.compile("([A-J])(\\d)");
        Matcher matcher = pattern.matcher(identificador);
        if (matcher.matches()) {
            char filaLetra = matcher.group(1).charAt(0);
            int columnaNumero = Integer.parseInt(matcher.group(2));
            int fila = filaLetra - 'A';
            int columna = columnaNumero - 1;
            return new int[]{fila, columna};
        } else {
            throw new IllegalArgumentException("Identificador de asiento inválido: " + identificador);
        }
    }

    // Vende un asiento dado su identificador
    public boolean vender_asiento(String identificador) {
        Asiento_definido ob= new Asiento_definido();
        ob.definir_asientos();
        int[] indices = convertir_asiento_a_indices(identificador);
        int fila = indices[0];
        int columna = indices[1];

        if (asientos[fila][columna] == 0 && ob.verificar_rango_asiento(identificador)) {
            asientos[fila][columna] = 1;
            return true; // Asiento vendido exitosamente
        } else {
            return false; // Asiento ya estaba ocupado
        }
    }
    
     // Imprimir el estado del bus (opcional, para ver el estado de los asientos)
    public void imprimir_bus() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

   

    /**
     * @return the id_bus
     */
    public int getId_bus() {
        return id_bus;
    }

    /**
     * @param id_bus the id_bus to set
     */
    public void setId_bus(int id_bus) {
        this.id_bus = id_bus;
    }

    /**
     * @return the asientos
     */
    public int[][] getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }

    /**
     * @return the disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
