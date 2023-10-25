public class MatematikaInheritance {
  public static void main(String[] args) {
    Matematika2 mtk2 = new Matematika2();

    int hasilTambah = mtk2.Tambah(20, 30);
    int hasilKurang = mtk2.Kurang(10, 5);
    int hasilKali = mtk2.Kali(10, 3);
    int hasilBagi = mtk2.Bagi(21, 2);
    // Panggil methods dari class Matematika 2 yang di extends
    int mdls = mtk2.modulus(8, 5);

    System.out.println("Pertambahan : 20+30 = " + hasilTambah);
    System.out.println("Pengurangan : 10-5 = " + hasilKurang);
    System.out.println("Perkalian : 10*3 = " + hasilKali);
    System.out.println("Pembagian : 21/2 = " + hasilBagi);
    System.out.println("Modulus dari 8 dan 5 = " + mdls);
  }

}
