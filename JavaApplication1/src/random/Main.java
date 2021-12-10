/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author user11
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        lingkaran.r = 7;
        System.out.println("Jari-jari Lingkaran = " + lingkaran.r);
        System.out.println("Luas Lingkaran = " + lingkaran.luas());
        System.out.println("Keliling Lingkaran = " + lingkaran.keliling());
        System.out.println("-----------------------------------------------");
        persegi.s = 7;
        persegi.Judul();
        System.out.println("Sisi Persegi = " + persegi.s);
        System.out.println("Luas Persegi = " + persegi.luas());
        System.out.println("Keliling Persegi = " + persegi.keliling());
    }
}
