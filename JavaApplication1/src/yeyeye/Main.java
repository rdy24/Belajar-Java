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
public class Main {
    public static void main(String[] args) {
        Buku book = new Buku();
        
        book.buku();
        System.out.println("Judul = " + book.judul);
        System.out.println("Halaman = " + book.halaman);
        System.out.println("Status = " + book.status);
        System.out.println("---------------------------------");
        book.buku("Hujan",150);
        System.out.println("Judul = " + book.judul);
        System.out.println("Halaman = " + book.halaman);
        System.out.println("Status = " + book.status);
        System.out.println("---------------------------------");
        book.buku("Sunyi","Dipinjam",200);
        System.out.println("Judul = " + book.judul);
        System.out.println("Halaman = " + book.halaman);
        System.out.println("Status = " + book.status);
    }
}
