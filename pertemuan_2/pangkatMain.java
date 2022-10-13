/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;
import pertemuan_2.pangkat;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class pangkatMain {
    public static void main(String[] args) {
        pangkat p = new pangkat();
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukan Bilangan yang Akan Dipangkat 2"));
        p.setX(a);
        p.hitung();
        JOptionPane.showMessageDialog(null, "Hasil dari "+p.getX()+" pangkat 2 adalah "+p.getH());
    }
}
