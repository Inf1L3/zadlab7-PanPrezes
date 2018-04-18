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
public class Student extends Osoba {
    private int nrindeksu;
    private String typstudiów;
    private String kierunek;
    private int rokstudiów;

    public Student(int nrindeksu, String typstudiów, String kierunek, int rokstudiów, String imie, String nazwisko, String dataurodzenia, String płeć) {
        super(imie, nazwisko, dataurodzenia, płeć);
        this.nrindeksu = nrindeksu;
        this.typstudiów = typstudiów;
        this.kierunek = kierunek;
        this.rokstudiów = rokstudiów;
    }

    public int getNrindeksu() {
        return nrindeksu;
    }

    public void setNrindeksu(int nrindeksu) {
        this.nrindeksu = nrindeksu;
    }

    public String getTypstudiów() {
        return typstudiów;
    }

    public void setTypstudiów(String typstudiów) {
        this.typstudiów = typstudiów;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRokstudiów() {
        return rokstudiów;
    }

    public void setRokstudiów(int rokstudiów) {
        this.rokstudiów = rokstudiów;
    }

  
    @Override
  public void info()
  {
      super.info();
      System.out.println("Dane Studenta");
      System.out.println("Imię: " +this.imie);
      System.out.println("Nazwisko: :" +this.nazwisko);
      System.out.println("Data urodzenia: " +this.dataurodzenia);
      System.out.println("Płeć: " +this.płeć);
      System.out.println("nr indeksu:" +this.nrindeksu);
      System.out.println("Typ studiów:" +this.typstudiów);
      System.out.println("Kierunek:" +this.kierunek);
      System.out.println("Rok studiów:" +this.rokstudiów);
  
    
}
}