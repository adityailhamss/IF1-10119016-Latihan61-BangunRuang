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
public class Program {

   
    public static void main(String[] args) {
      Bola b = new Bola(7);
        Tabung t = new Tabung(10,21);
        Kerucut k = new Kerucut(14,9);
        
        b.tampilBangunRuang();
        t.tampilBangunRuang();
        k.tampilBangunRuang();
    }   
}
