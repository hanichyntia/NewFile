
package perpustakaan;

public class Main {
    public static void main(String[] args) {
        buku buku = new buku();
        Petugas petugas = new Petugas();
        Laporan laporan  = new Laporan();
        Peminjaman pinjam = new Peminjaman();
        Siswa siswa = new Siswa();
        
        laporan.laporanBarang(buku);
        laporan.laporanSiswa(siswa);
        System.out.println("");
        pinjam.prosesPeminjaman(siswa, pinjam, buku);
    }
}
