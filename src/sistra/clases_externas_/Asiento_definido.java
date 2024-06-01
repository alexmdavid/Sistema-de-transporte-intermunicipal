/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.clases_externas_;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Asiento_definido implements Serializable{
    List<String> asientos_definidos;

    public Asiento_definido() {
        asientos_definidos = new ArrayList<>();
    }
    public void definir_asientos(){
        String A1 = "A1";
        String A2 = "A2";
        String A3 = "A3";
        String A4 = "A4";

        String B1 = "B1";
        String B2 = "B2";
        String B3 = "B3";
        String B4 = "B4";

        String C1 = "C1";
        String C2 = "C2";
        String C3 = "C3";
        String C4 = "C4";

        String D1 = "D1";
        String D2 = "D2";
        String D3 = "D3";
        String D4 = "D4";

        String E1 = "E1";
        String E2 = "E2";
        String E3 = "E3";
        String E4 = "E4";

        String F1 = "F1";
        String F2 = "F2";
        String F3 = "F3";
        String F4 = "F4";

        String G1 = "G1";
        String G2 = "G2";
        String G3 = "G3";
        String G4 = "G4";

        String H1 = "H1";
        String H2 = "H2";
        String H3 = "H3";
        String H4 = "H4";

        String I1 = "I1";
        String I2 = "I2";
        String I3 = "I3";
        String I4 = "I4";

        String J1 = "J1";
        String J2 = "J2";
        String J3 = "J3";
        String J4 = "J4";
        
        asientos_definidos.add(A1);
        asientos_definidos.add(A2);
        asientos_definidos.add(A3);
        asientos_definidos.add(A4);

        asientos_definidos.add(B1);
        asientos_definidos.add(B2);
        asientos_definidos.add(B3);
        asientos_definidos.add(B4);

        asientos_definidos.add(C1);
        asientos_definidos.add(C2);
        asientos_definidos.add(C3);
        asientos_definidos.add(C4);

        asientos_definidos.add(D1);
        asientos_definidos.add(D2);
        asientos_definidos.add(D3);
        asientos_definidos.add(D4);

        asientos_definidos.add(E1);
        asientos_definidos.add(E2);
        asientos_definidos.add(E3);
        asientos_definidos.add(E4);

        asientos_definidos.add(F1);
        asientos_definidos.add(F2);
        asientos_definidos.add(F3);
        asientos_definidos.add(F4);

        asientos_definidos.add(G1);
        asientos_definidos.add(G2);
        asientos_definidos.add(G3);
        asientos_definidos.add(G4);

        asientos_definidos.add(H1);
        asientos_definidos.add(H2);
        asientos_definidos.add(H3);
        asientos_definidos.add(H4);

        asientos_definidos.add(I1);
        asientos_definidos.add(I2);
        asientos_definidos.add(I3);
        asientos_definidos.add(I4);

        asientos_definidos.add(J1);
        asientos_definidos.add(J2);
        asientos_definidos.add(J3);
        asientos_definidos.add(J4);

        
    }
    
    public boolean verificar_rango_asiento(String x){
        for(int i=0; i<asientos_definidos.size();i++){
            if(x.equals(asientos_definidos.get(i))){
                return true;
            }
        }
        return false;
    }
    
}
