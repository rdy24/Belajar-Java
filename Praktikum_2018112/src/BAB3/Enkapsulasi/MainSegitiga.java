/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Enkapsulasi;

/**
 *
 * @author user11
 */
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.tinggi = 5;
        segitiga.setAlas(7.4);
        System.out.println("Luas Segitiga = "+Double.toString(segitiga.Luas()));   
    }
}
