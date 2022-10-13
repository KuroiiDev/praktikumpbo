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
public class belajar {
    public String x;
    private String y;
    private String z;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
    
    public void cetak(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
}
