/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 */
public class PBOIF210119082Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     * NAMA     : Zainul Rifqi Muwaffaq
     * KELAS    : IF2
     * NIM      : 10119082
     * Deskripsi Program : Program Rata-rata Nilai 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int i, n;
        float jumlah,x,rata;
        
        System.out.print("Masukkan banyaknya mahasiswa : ");
        n = scanner.nextInt();
        jumlah=0;
        i=1;
        while (i<=n) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            x=scanner.nextFloat();
            jumlah  += x;
            i++;
        }
        rata = jumlah / n;
        System.out.println("Maka, Rata-rata Nilainya adalah : " + rata);
        System.out.println("Developed by : Zainul Rifqi Muwaffaq");
    }
    
}
