/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apa;

/**
 *
 * @author user11
 */
public abstract class BangunDatar {
    public double pjg,lbr,r, keliling, luas;  // atribut
    
    BangunDatar()   // konstruktor
    {
        pjg = 15;
        lbr = 8;
        r = 10;
    }
    
     abstract public double hitLuas();  // method non void -- wajib override karena abstract
     
      public String label()  // method non void -- tidak wajib override karena bukan abstract
     {
         return "Menghitung luas";
     }
}
