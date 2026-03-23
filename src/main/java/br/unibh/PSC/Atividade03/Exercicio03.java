// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

package br.unibh.PSC.Atividade03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
  static void main() {
    final double USD_EXCHANGE_RATE = 5.23;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor em dólar: ");
    double amount = input.nextDouble();
    System.out.printf(Locale.UK, "Valor convertido: R$ %.2f%n", (amount * USD_EXCHANGE_RATE));

    input.close();
  }
}