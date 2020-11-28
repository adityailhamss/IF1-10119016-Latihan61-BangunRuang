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
public class Bola implements BangunRuang {
    private int r;
    // r = 7
    public Bola(int r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return (4.0/3.0)*3.14285714286*(r*r*r);
    }

    @Override
    public void tampilBangunRuang() {
        System.out.printf("Hasil Volume Bola : V = %.1f%n", hitungVolume());
    }
}