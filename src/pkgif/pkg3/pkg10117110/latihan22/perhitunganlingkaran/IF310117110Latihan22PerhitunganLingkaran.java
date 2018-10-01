


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Menghitung Jari-jari, Luas, dan Keliling Lingkaran
 */
package pkgif.pkg3.pkg10117110.latihan22.perhitunganlingkaran;

import java.util.Scanner;

public class IF310117110Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        
        int diameterL;
        double keliling;
        double luas;
        double jari2;
        Scanner scan = new Scanner (System.in);


        System.out.println("------Perhitungan Lingkaran------");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        diameterL = scan.nextInt();

        
        //proses
        jari2 = (double) (diameterL * 0.5);
        keliling = (double) (diameterL * 3.14);
        luas = (double) ((jari2*jari2)*3.14);

        
        System.out.println("------Hasil Perhitungan------");
        System.out.println("Jari-jari Lingkaran = " +jari2);
        System.out.println("Luas Lingkaran = " +luas);
        System.out.println("Keliling Lingkaran = " +keliling);
        
    }
    
}
