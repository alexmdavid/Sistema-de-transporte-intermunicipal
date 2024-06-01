/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases_externas_;


public class Prueba {
     public static void main(String[] args) {
        Bus bus = new Bus("110",true);
        System.out.println(bus.vender_asiento("A1")); // true
        System.out.println(bus.vender_asiento("A1")); // false (ya vendido)
        System.out.println(bus.vender_asiento("B2")); // true
        System.out.println(bus.vender_asiento("B5")); //false no existe
        bus.imprimir_bus();
    }
}
