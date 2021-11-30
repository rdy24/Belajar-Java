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
public class CetakKTM {
    public static void main(String[] args) {
        // membuat object dengan nama “mhs” dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        //ketika akan menggunakan method dari class Mahasiswa maka harus menyertakan nama object
        mhs.dataNIM("2018112");
        mhs.dataNama("Raflizar Deswandi Yahya");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2020");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM : "+ mhs.cetakNIM());
        System.out.println("Nama : "+ mhs.cetakNama());
        System.out.println("Prodi : "+ mhs.cetakProdi());
        System.out.println("Angkatan : "+ mhs.cetakAngkatan());
    }
}
