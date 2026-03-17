package br.unibh;

// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
  static void main() {
    Scanner input = new Scanner(System.in).useLocale(Locale.UK);

    System.out.println("Distância (km):");
    int distance = input.nextInt();
    System.out.println("Velocidade média (km/h):");
    int averageVelocity = input.nextInt();

    double estimatedTimeOfArrival = (double) distance / averageVelocity;

    int hours = (int) estimatedTimeOfArrival;
    int minutes = (int) ((estimatedTimeOfArrival - hours) * 60);

    System.out.println("Tempo estimado: " + hours + " e " + minutes + " minutos");

    input.close();
  }
}