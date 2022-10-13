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
public class siswa {

    private String nama;
    private int absen = 0;
    private String kelas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAbsen() {
        return absen;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void getAll() {
        System.out.println("Nama: " + getNama());
        System.out.println("Absen: " + getAbsen());
        System.out.println("Kelas: " + getKelas());
    }
}
