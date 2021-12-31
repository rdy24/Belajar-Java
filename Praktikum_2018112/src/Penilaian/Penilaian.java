/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penilaian;

/**
 *
 * @author user11
 */
public abstract class Penilaian {
    String NIM, kode_mk;
    int nilaiTugas, nilaiPrak;

    private double nilaiAkhirPrak(){
        return ((nilaiTugas*0.6)+(nilaiPrak*0.4));
    }

    double tampilNA(){
        return nilaiAkhirPrak();
    }
    abstract double nilaiAkhir(); 
         
}

