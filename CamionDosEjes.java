/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author s114e17
 */
public class CamionDosEjes extends Camion{

    public CamionDosEjes(String color, String placa, String marca, double valorpeaje) {
        super(color, placa, marca, valorpeaje);
    }

    @Override
    public String toString() {
        return "CamionDosEjes{" + "  color=" +super.getColor()+  ", placa=" + super.getPlaca()+ ", marca=" + super.getMarca()+ ", valorPeaje=" + super.getValorpeaje();
    }
    
    
}
