/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayhello;

/**
 *
 * @author C-26
 */
public class Penjualanmobil {
     public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Honda Civic", 200000000);
        Mobil mobil2 = new Mobil("Toyota Corolla", 250000000);

        // Menampilkan informasi mobil
        System.out.println("Informasi Mobil:");
        System.out.println("Nama: " + mobil1.getNama());
        System.out.println("Harga: " + mobil1.getHarga());
        System.out.println("Nama: " + mobil2.getNama());
        System.out.println("Harga: " + mobil2.getHarga());

        // Melakukan penjualan mobil
        mobil1.penjualan();
        mobil2.penjualan();
    }
}

class Mobil {
    private String nama;
    private double harga;

    public Mobil(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void penjualan() {
        System.out.println("Mobil " + nama + " terjual dengan harga " + harga);
    }
}

