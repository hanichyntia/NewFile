
package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman{
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    Peminjaman(){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(0);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(0);
        
        this.idSiswa.add(1);
        this.idBuku.add(1);
        this.banyak.add(1);
    }
    
    public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, buku buku){
        Scanner ob = new Scanner(System.in);
        System.out.println("Selamat Datang di Perpustakaan");
        System.out.println("===============================");
        System.out.print("Masukkan ID Pelajar : ");
        int idMember = ob.nextInt();
        
        if (siswa.getStatus(idMember).equals(true)) {
            System.out.println("Hallo "+siswa.getNama(idMember));
            System.out.println("==================================");
            System.out.print("Masukkan ID buku : ");
            int x = ob.nextInt();
            if (x==0) {
                System.out.println("Kamu Meminjam = "+buku.getNamaBuku(x));
            }else if (x==1) {
                System.out.println("Kamu Meminjam = "+buku.getNamaBuku(x));
            }else if (x==2) {
                System.out.println("Kamu Meminjam = "+buku.getNamaBuku(x));
            }else
                System.out.println("Buku tidak ditemukan");
        }else {
            System.out.println("Maaf "+siswa.getNama(idMember)+" kamu belum mengembalikan buku");
            System.out.println("Segera kembalikan ya kalau ingin pinjam");
        }
    }
    public void setPeminjaman(buku buku, int idSiswa, int idBuku, int banyaknya){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku)-banyaknya);
    }
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    }
    
}
