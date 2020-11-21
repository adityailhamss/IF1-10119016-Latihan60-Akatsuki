package if1.pkg10119016.latihan60.akatsuki;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan karakter
 * akatsuki
 */
public class AnggotaAkatsuki extends Ninja {
    private String cincin, makananFavorit;
    
    public String getCincin() {
        return this.cincin;
    }
    
    public void setCincin(String cincin) {
        this.cincin = cincin;
    }
    
    public String getMakananFavorit() {
        return this.makananFavorit;
    }
    
    public void setMakananFavorit(String makananFavorit) {
        this.makananFavorit = makananFavorit;
    }
    
    public void tampilAnggota() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Asal Desa\t: " + super.getAsalDesa());
        System.out.println("Identitas Cincin: " + getCincin());
        System.out.println("Makanan Favorit\t: " + getMakananFavorit());
        System.out.println();
    }    
}
