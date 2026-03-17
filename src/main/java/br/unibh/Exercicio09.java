package br.unibh;

// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
  static void main() {
    Scanner input = new Scanner(System.in).useLocale(Locale.UK);

    System.out.println("Preço do produto:");
    double productPrice = input.nextDouble();
    System.out.println("Valor pago:");
    double paidAmount = input.nextDouble();

    if (paidAmount < productPrice) {
      System.err.println("Não é possível adquirir o produto!");
    } else {
      double exchangedAmount = paidAmount - productPrice;
      System.out.printf(Locale.UK, "Troco: R$ %.2f%n", exchangedAmount);
    }

    input.close();
  }
}