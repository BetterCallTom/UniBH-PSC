// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

package br.unibh.PSC;

import java.util.Scanner;

public class Exercicio02 {
  static void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o primeiro numeral: ");
    int numberA = input.nextInt();
    System.out.println("Insira o segundo numeral: ");
    int numberB = input.nextInt();
    System.out.println("O resto da divisão de " + numberA + " por " + numberB + " é " + (numberA % numberB));

    input.close();
  }
}