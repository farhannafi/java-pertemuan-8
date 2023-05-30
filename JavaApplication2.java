/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author C-26
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mobil mobil1 = new Mobil("Carera GT", 250000000);
        Mobil mobil2 = new Mobil("Mitsubishi Ultima", 150000000);

        // Menampilkan informasi mobil
        System.out.println("Informasi Mobil:");
        System.out.println("Mobil 1:");
        mobil1.tampilkanInfo();
        System.out.println("Mobil 2:");
        mobil2.tampilkanInfo();
    }
}

class Mobil {
    private String nama;
    private int harga;

    public Mobil(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
    }
} // TODO code application logic here
    
    

