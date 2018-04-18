/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author Patryk
 */
public class Wykladowca extends Osoba {
    
    private String stopieńNaukowy;
    private String katedra;

    public Wykladowca(String stopieńNaukowy, String katedra, String imie, String nazwisko, String dataurodzenia, String płeć) {
        super(imie, nazwisko, dataurodzenia, płeć);
        this.stopieńNaukowy = stopieńNaukowy;
        this.katedra = katedra;
    }

    public String getStopieńNaukowy() {
        return stopieńNaukowy;
    }

    public void setStopieńNaukowy(String stopieńNaukowy) {
        this.stopieńNaukowy = stopieńNaukowy;
    }

    public String getKatedra() {
        return katedra;
    }

    public void setKatedra(String katedra) {
        this.katedra = katedra;
    }

    @Override
    public void info()
{
    System.out.println("Stopień naukowy" +this.stopieńNaukowy);
    System.out.println("Nazwa katedry" +this.katedra);  
}
    
    
    
}
