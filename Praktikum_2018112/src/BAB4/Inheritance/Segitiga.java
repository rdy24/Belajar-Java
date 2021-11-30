/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Inheritance;

/**
 *
 * @author user11
 */
public abstract class Segitiga {
    double alas,tinggi,luas;
    double Luas(){
        luas = 0.5*(alas *tinggi);
        return luas;
    } 
    abstract double Volume();
}

