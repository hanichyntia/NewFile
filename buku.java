
package perpustakaan;

import java.util.ArrayList;

public class buku{
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    buku(){
        this.namaBuku.add("Novel");
        this.stok.add(100);
        this.harga.add(25000);
        
        this.namaBuku.add("Cerpen");
        this.stok.add(100);
        this.harga.add(50000);
        
        this.namaBuku.add("Majalah");
        this.stok.add(100);
        this.harga.add(5000);
    }
    public int getJmlBuku(){
       return this.namaBuku.size();
    }
    public void setNamaBuku(String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }
    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
}
