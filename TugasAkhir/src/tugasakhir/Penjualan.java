/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

/**
 *
 * @author TUFF
 */
public class Penjualan {
    String menu;
    int jumlah,harga;
    void menu(String Menu){
        this.menu = Menu;
    }
    void jumlah(int jumlah){
        this.jumlah = jumlah;
    }
    void harga(int harga){
        this.harga = harga;
    }
    String cetakMenu(){
        return menu;
    }
    Integer cetakJumlah(){
        return jumlah;
    }
    Integer cetakHarga(){
        return harga;
    }
    
}
