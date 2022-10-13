/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;
import pertemuan_1.bd;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class bdMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pilih Bangun Datar:\n1. Luas Persegi\n2. Luas Segitiga\n3. Luas persegi panjang\n4. Keliling Persegi\n5. Keliling persegi panjang\nPilihan: ");
        int i=sc.nextInt();
        System.out.print("Panjang: ");
        int x =sc.nextInt();
        System.out.print("Lebar: ");
        int y =sc.nextInt();
        
        bd b1 = new bd(i,x,y);
        
    }
}
