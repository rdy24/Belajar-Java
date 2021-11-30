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
    String nama,NIM, kode_mk;
    private int nilaiTugas, nilaiPrak;
    double nilaiAkhir;

    public int getNT() {
        return nilaiTugas;
    }

    public void setNT(int nt) {
        this.nilaiTugas = nt;
    }

    public int getNP() {
        return nilaiPrak;
    }

    public void setNP(int np) {
        this.nilaiPrak = np;
    }

    double nilaiAkhirPrak(){
        return ((getNT()*0.6)+(getNP()*0.4));
                
    }
    abstract double nilaiAkhir(); 
         
}

