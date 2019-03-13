
package Clases;

/**
 *
 * @author s114e17
 */
public class Automovil extends Vehiculo{
    
    private String color;

    public Automovil(String color, String placa, String marca, double valorpeaje) {
        super(placa, marca, valorpeaje);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + " color=" + color +  ", placa=" + super.getPlaca()+ ", marca=" + super.getMarca()+ ", valorPeaje=" + super.getValorpeaje();
    }

    
    

    
    
    
}
