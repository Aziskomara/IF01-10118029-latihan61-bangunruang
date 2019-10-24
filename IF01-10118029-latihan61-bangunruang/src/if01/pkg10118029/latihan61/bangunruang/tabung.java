/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan61.bangunruang;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Bangun ruang
 */
public class tabung implements volume {
    
    int jari;
    int tinggi;
    private final double phi = 3.14;
    
    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getPhi() {
        return phi;
    }

    @Override
    public double hitungVolume() {
        return phi * jari *jari * tinggi;
    }
    
}
