/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeyeye;

/**
 *
 * @author user11
 */
public class Perpustakaan {
    String judul, status;
    int halaman;
    public void buku() {
        judul = "Laskar Pelangi";
    }
    
    public void buku(String judul,int halaman) {
        this.judul = judul;
        this.halaman = halaman;
        status = "Dipinjam";
    }
    
    public void buku(String judul, String status, int halaman) {
        this.judul = judul;
        this.status = status;
        this.halaman = halaman;
    }
}
