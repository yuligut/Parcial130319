
package udem.edu.com.parcial;

import Clases.Automovil;
import Clases.Camion;
import Clases.Moto;
import Clases.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s114e17
 */
public class UdemEduComParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //creamos un ArrayList para almacenar los vehiculos
        ArrayList<Vehiculo>vehiculo=new ArrayList<Vehiculo>();
        vehiculo.add(new Moto("amarillo","123", "honda", 12.000));
        vehiculo.add(new Automovil("verde","123cd", "mercedes", 5.000));
        vehiculo.add(new Camion("rojo","123der", "volvo", 18.000));
        System.out.println(vehiculo.toString());
        
        
        
        
       
    }
    
}
