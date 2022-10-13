/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;

/**
 *
 * @author USER
 */
public class bd {
    private int x;
    private int y;
    private double h;
    
    public void setUkuran(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void lpersegi(){
        h=x*x;
    }
    public void segitiga(){
        h=(x*y)/2;
    }
    public void lpersegiPanjang(){
        h=x*y;
    }
    public void kpersegi(){
        h=x*4;
    }
    public void kpersegiPanjang(){
        h=x+x+y+y;
    }
    
    public bd(int plh,int a,int b) {
        setUkuran(a, b);
        System.out.println("\n======================");
        switch(plh){
            case 1:
                System.out.println("Program Menghitung Luas Persegi");
                lpersegi();
                break;
            case 2:
                System.out.println("Program Menghitung Luas Segitiga");
                segitiga();
                break;
            case 3:
                System.out.println("Program Menghitung Luas Persegi Panjang");
                lpersegiPanjang();
                break;
            case 4:
                System.out.println("Program Menghitung keliling Persegi");
                kpersegi();
                break;
            case 5:
                System.out.println("Program Menghitung Keliling Persegi Panjang");
                kpersegiPanjang();
                break;
            default:
                System.out.println("Input Salah");
        }
        System.out.println("Hasil: "+h);
    }
    
}
