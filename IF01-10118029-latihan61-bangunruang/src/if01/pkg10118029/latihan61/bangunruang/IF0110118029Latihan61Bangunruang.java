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
 *
 */
public class IF0110118029Latihan61Bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bola bola = new bola();
        bola.setJari(7);
        System.out.println("jari-jari sebuah bola : V = " + bola.getJari()+"cm");
        System.out.println("hasil : V = " + bola.hitungVolume());
        
        tabung tabung = new tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);
        System.out.println("\njari-jari sebuah tabung : V = " + tabung.getJari() +"cm");
        System.out.println("tinggi sebuah tabung : V = " + tabung.getTinggi() +"cm");
        System.out.println("hasil : V = " + tabung.hitungVolume());
        
        kerucut kerucut = new kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("\njari-jari sebuah kerucut : V = " + kerucut.getJari() +"cm");
        System.out.println("tinggi sebuah kerucut : V = " + kerucut.getTinggi() +"cm");
        System.out.println("hasil : V = " + kerucut.hitungVolume());
    }
    
}
