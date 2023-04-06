/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Asus
 */
public class Laporan {
    public void laporanBarang (buku buku){
        int x = buku.getJmlBuku();
        System.out.println("");
        System.out.println("Tabel buku");
        System.out.println("");
        System.out.println("ID \tBuku \tStok \tHarga");
        
        for (int i = 0; i < x; i++) {
            System.out.println(i+" \t"+buku.getNamaBuku(i)+" \t"+buku.getStok(i)+" \t"+buku.getHarga(i));
        }
    }
    public void laporanSiswa(Siswa siswa){
        int x = siswa.getJmlSiswa();
        System.out.println("");
        System.out.println("Tabel Siswa");
        System.out.println("");
        System.out.println("ID \tNama \tAlamat \tTelepon");
        
        for (int i = 0; i < x; i++) {
            System.out.println(i+" \t"+siswa.getNama(i)+" \t"+siswa.getAlamat(i)+" \t"+siswa.getTelepon(i));
        }
    }
    public void laporanPeminjaman (Peminjaman pinjam, buku buku){
        int x = pinjam.getJmlPeminjaman();
        System.out.println("");
        System.out.println("Laporan Peminjaman");
        System.out.println("");
        System.out.println("Buku \tID \tHarga");
        int total=0;
        for (int i = 0; i < x; i++) {
            int jumlah = pinjam.getBanyaknya(i)*buku.getHarga(pinjam.getIdBuku(i));
            total += jumlah;
            System.out.println(buku.getNamaBuku(pinjam.getIdBuku(i))+"\t"+
                    pinjam.getBanyaknya(i)+"\t"+buku.getHarga(pinjam.getIdBuku(i))+"\t"+jumlah);
        }
        System.out.println("Total Omset ="+total);
    }
}
