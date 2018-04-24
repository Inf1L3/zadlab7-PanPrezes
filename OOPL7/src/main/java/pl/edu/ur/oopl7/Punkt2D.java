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
public class Punkt2D {
    
    int x;
    int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   
   public void rand()
   {
       Random g = new Random();
x= g.nextInt(20)-10;
y=g.nextInt(20)-10;
           
   }
    @Override
    public String toString() {
        return "Punkt 2D ma współrzędne:\nX = "  + Double.toString(x) + 
                ",\n Y=" + Double.toString(y);
    }
}
