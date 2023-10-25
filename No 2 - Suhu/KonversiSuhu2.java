public class KonversiSuhu2 extends KonversiSuhu {
  // Methods farenheit to reamur
  public double FtoR(double farenheit) {
    return (farenheit - 32) * 4 / 9;
  }

  // Methods farenheit to celcius
  public double FtoC(double farenheit) {
    return (farenheit - 32) * 5 / 9;
  }

  // Methods farenheit to celcius
  public double FtoK(double farenheit) {
    return ((farenheit - 32) * 5 / 9) + 273;
  }
}
