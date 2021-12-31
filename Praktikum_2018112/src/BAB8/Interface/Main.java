/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author user11
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        
        lingkaran.r = 7;
        System.out.println("jari jari Lingkaran : " + lingkaran.r);
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("keliling Lingkaran : " + lingkaran.keliling());
        
        persegi.s = 7;
        persegi.judul();
        System.out.println("Sisi : " + persegi.s);
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("keliling Persegi : " + persegi.keliling());
    }
}
