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
public class Tabung implements BangunRuang{
    private int r,tinggi;
    //tinggi = 21 r = 10
    public Tabung(int r, int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return 3.14285714286*(r*r)*tinggi;
    }
 
    @Override
    public void tampilBangunRuang() {
        System.out.printf("Hasil Volume Tabung : V = %.1f%n", hitungVolume());
    }

}
