// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

package br.unibh.PSC.Atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
  static void main() {
    Scanner input = new Scanner(System.in).useLocale(Locale.UK);

    System.out.println("Distância percorrida (km):");
    double distanceTravelled = input.nextDouble();
    System.out.println("Combustível gasto (litros):");
    double spentFuel = input.nextDouble();

    double averageConsumption = distanceTravelled / spentFuel;

    System.out.printf(Locale.UK, "Consumo médio: %.1f km/l%n", averageConsumption);

    input.close();
  }
}