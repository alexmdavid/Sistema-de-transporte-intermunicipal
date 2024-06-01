/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases;

import java.io.Serializable;


public class Municipio implements Serializable{

    private String nombre;
    private String capital;
    private String terminal;

    public Municipio(String nombre, String capital, String terminal) {
        this.nombre = nombre;
        this.capital = capital;
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Municipio "+"[" + "nombre: " + nombre + ", capital: " + capital + ", terminal: " + terminal+" ]";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return the terminal
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * @param terminal the terminal to set
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

}
