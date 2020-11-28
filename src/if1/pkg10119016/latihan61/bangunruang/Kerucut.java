package if1.pkg10119016.latihan61.bangunruang;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menghitung volume bangun ruang
 */
public class Kerucut implements BangunRuang{
    private int r,tinggi;
    // tinggi = 9, r = 14
    
    public Kerucut(int r,int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return (22*r*r*tinggi)/(3*7);
    }

    @Override    
    public void tampilBangunRuang() {
        System.out.printf("Hasil Volume Kerucut : V = %.0f%n", hitungVolume());
    }
}
