/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author user11
 */
public class Mahasiswa {
    String nim, nama, prodi, angktn;
    void dataNIM(String Nim){
        this.nim = Nim;
    }
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataProdi(String Prodi){
        this.prodi = Prodi;
    }
    void dataAngkatan(String Angktn){
        this.angktn = Angktn;
    }
    String cetakNIM(){
        return nim;
    }
    String cetakNama(){
        return nama;
    }
    String cetakProdi(){
        return prodi;
    }
    String cetakAngkatan(){
        return angktn;
    }
}
