/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassObject;

/**
 *
 * @author user11
 */
public class Kendaraan {
    //atribut
    String nama, warna;
    // method konstruktor
    
    public Kendaraan() {
        
    }

    public Kendaraan(String Nama) {
        this.nama = Nama;
    }
    
    public Kendaraan(String Nama, String Warna) {
        this.nama = Nama;
        this.warna = Warna;
    }

//    //method
//    int jmlRoda(int jml) {
//        return jml;
//    }
//
//    void kendaraanMaju() {
//        System.out.println("Berjalan ke depan");
//    }
//
//    void kendaraanMundur() {
//        System.out.println("Berjalan ke belakang");
//    }
//
//    void kendaraanBerhenti() {
//        System.out.println(" Berhenti");
//    }
}
