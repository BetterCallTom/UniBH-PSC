package br.unibh;

// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
  static void main() {
    Scanner input = new Scanner(System.in).useLocale(Locale.UK);

    System.out.println("Digite a nota A:");
    double scoreA = input.nextDouble();
    System.out.println("Digite a nota B:");
    double scoreB = input.nextDouble();
    System.out.println("Digite a nota C:");
    double scoreC = input.nextDouble();

    double averageScore = (scoreA + scoreB + scoreC ) / 3;

    System.out.printf(Locale.UK, "Média: %.2f%n", averageScore);

    input.close();
  }
}