/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author Patryk
 */
public class Punkt3D extends Punkt2D {

   private int z;

    public Punkt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public void random(){
        Random k = new Random();
        x = (int) ((-10) + (10 - (-10)) * k.nextDouble());
        y = (int) ((-10) + (10 - (-10)) * k.nextDouble());
        z = (int) ((-10) + (10 - (-10)) * k.nextDouble());
    }

    @Override
    public String toString() {
        return "Punkt 3D ma wspĂłĹ‚rzÄ™dne:\nX = "  + Double.toString(x) + 
                ",\nY= " + Double.toString(y) + ",\nZ= " + Double.toString(z);
    }
    
    
}
