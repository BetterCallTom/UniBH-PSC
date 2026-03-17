// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

package br.unibh;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
  static void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite a base:");
    double basis = input.nextDouble();
    System.out.println("Digite a altura:");
    double height = input.nextDouble();

    double retangleArea = basis * height;

    System.out.printf(Locale.UK, "Área do retângulo: %.1f cm²%n", retangleArea);

    input.close();
  }
}