public class KonversiSuhu {
  // Methods celcius to farenheit
  public double CtoF(double celcius) {
    return (celcius * 9 / 5) + 32;
  }

  // Methods celcius to reamur
  public double CtoR(double celcius) {
    return celcius * 4 / 5;
  }

  // Methods celcius to kelvin
  public double CtoK(double celcius) {
    return celcius + 273;
  }
}