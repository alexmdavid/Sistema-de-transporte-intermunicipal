/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistra.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import sistra.controladores.Municipio_controlador;



/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Persistente{
    public void guardar(Municipio_controlador x, String a ) throws FileNotFoundException, IOException{
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(a));
        salida.writeObject(x);
        salida.close();
    }
    
    public Municipio_controlador recuperar(String archivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
        Municipio_controlador mun_con = (Municipio_controlador) entrada.readObject();
        entrada.close();
        return mun_con;
        
    }
    
}
