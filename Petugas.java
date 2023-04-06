
package perpustakaan;

import java.util.ArrayList;
import perpustakaan.User;

public class Petugas extends Siswa{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    Petugas(){
        this.namaPetugas.add("Kusrini");
        this.alamat.add("Madyopuro");
        this.telepon.add("08212345678");
        
        this.namaPetugas.add("Marsinah");
        this.alamat.add("Ranu Grati");
        this.telepon.add("08209878076");
        
        this.namaPetugas.add("Joko");
        this.alamat.add("Sawojajar");
        this.telepon.add("08567876598");
        
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
