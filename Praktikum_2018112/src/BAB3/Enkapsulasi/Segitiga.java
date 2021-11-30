/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Enkapsulasi;

/**
 *
 * @author user11
 */
public class Segitiga {
    private double alas;
    public double tinggi, Luas;
    
    public void setAlas (double a){
        this.alas = a;
    }
    
    public double getAlas(){
        return alas;
    }
    
    double Luas(){ //hak akses default (tidak ada modifier)
        Luas = (getAlas()*tinggi)/2;
        return Luas;
    }
}
