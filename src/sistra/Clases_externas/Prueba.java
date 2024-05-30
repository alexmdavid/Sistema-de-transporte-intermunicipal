/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.Clases_externas;

/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Prueba {
     public static void main(String[] args) {
        Bus bus = new Bus(110,true);
        System.out.println(bus.venderAsiento("A1")); // true
        System.out.println(bus.venderAsiento("A1")); // false (ya vendido)
        System.out.println(bus.venderAsiento("B2")); // true
        System.out.println(bus.venderAsiento("B5")); //false no existe
        bus.imprimirBus();
    }
}
