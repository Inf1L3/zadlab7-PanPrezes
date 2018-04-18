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
public class Osoba {
    String imie;
    String nazwisko;
    String dataurodzenia;
    String płeć;

    public Osoba(String imie, String nazwisko, String dataurodzenia, String płeć) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.płeć = płeć;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(String dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public String getPłeć() {
        return płeć;
    }

    public void setPłeć(String płeć) {
        this.płeć = płeć;
    }
    
    public void info()
  {
      System.out.println("Dane Osoby" +this.imie +this.nazwisko +this.dataurodzenia +this.płeć);
     
  
  }
    
}
