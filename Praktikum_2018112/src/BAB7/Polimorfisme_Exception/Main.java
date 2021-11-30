/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme_Exception;

/**
 *
 * @author user11
 */
public class Main {
    public static void main(String[] args) {
        Bentuk shape; // instansiasi (pembuatan objek dr class)
        
        System.out.println("Penerapan Polimorfisme");

        shape = new Kubus(); // objek "shape" dr superclass diinisialisasi dengan SubClass Kubus
        System.out.println("Volume Kubus         : "+ shape.volume());
        System.out.println("Luas Permukaan Kubus : "+ shape.luasPermukaan());
        System.out.println("---------------------------------------------");

        shape = new Tabung(); // objek "shape" dr superclass diinisialisasi dengan SubClass Tabung
        System.out.println("Volume Tabung         : "+ shape.volume());
        System.out.println("Luas Permukaan Tabung : "+ shape.luasPermukaan());
    }

}
