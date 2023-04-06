
package perpustakaan;

import java.util.ArrayList;
import perpustakaan.User;

public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    Siswa(){
        this.namaSiswa.add("Kevin");
        this.alamat.add("Pakis");
        this.telepon.add("089345675679");
        this.status.add(false);
        
        this.namaSiswa.add("Deva");
        this.alamat.add("Tumpang");
        this.telepon.add("0894567898756");
        this.status.add(true);
        
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public Boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    public void editStatus(int idSiswa, boolean status){
        this.status.set(idSiswa, status);
    }
    int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    
    @Override
    public void setNama(String Nama) {
        this.namaSiswa.add(Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        this.telepon.add(Telepon);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
}
