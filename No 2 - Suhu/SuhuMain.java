public class SuhuMain {
  public static void main(String[] args) {
    KonversiSuhu2 suhu2 = new KonversiSuhu2();

    // Nilai celcius
    double celcius = 26.0;
    double ctofarenheit = suhu2.CtoF(celcius);
    double ctoreamur = suhu2.CtoR(celcius);
    double ctokelvin = suhu2.CtoK(celcius);

    // Print konversisuhu1
    System.out.println(celcius + "C setara dengan " + ctofarenheit + "F");
    System.out.println(celcius + "C setara dengan " + ctoreamur + "R");
    System.out.println(celcius + "C setara dengan " + ctokelvin + "K");

    // Nilai farenheit
    double farenheit = 80.0;
    double ftoreamur = suhu2.FtoR(farenheit);
    double ftocelcius = suhu2.FtoC(farenheit);
    double ftokelvin = suhu2.FtoK(farenheit);

    // Print konversisuhu2
    System.out.println(farenheit + "F setara dengan " + ftoreamur + "R");
    System.out.println(farenheit + "F setara dengan " + ftocelcius + "C");
    System.out.println(farenheit + "F setara dengan " + ftokelvin + "K");
  }
}
