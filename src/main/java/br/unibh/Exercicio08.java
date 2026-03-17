package br.unibh;

// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
  static void main() {
    Scanner input = new Scanner(System.in).useLocale(Locale.UK);

    System.out.println("Digite a temperatura em Celsius:");
    double celsiusTemperature = input.nextDouble();

    double farenheitConversion = (celsiusTemperature * 9 / 5) + 32;
    double kelvinConversion = celsiusTemperature  + 273.15;

    System.out.printf(Locale.UK, "Fahrenheit: %.1f °F%n", farenheitConversion);
    System.out.printf(Locale.UK, "Kelvin: %.2f K%n", kelvinConversion);

    input.close();
  }
}