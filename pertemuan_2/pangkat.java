/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;

/**
 *
 * @author USER
 */
public class pangkat {
    private int x;
    private int h;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    public void hitung(){
        int angka = getX();
        setH(angka*angka);
    }
}
