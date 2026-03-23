// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

package br.unibh.PSC.Atividade03;

import java.util.Scanner;

public class Exercicio01 {
  static void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o primeiro numeral: ");
    double numberA = input.nextDouble();
    System.out.println("Insira o segundo numeral: ");
    double numberB = input.nextDouble();
    System.out.println("Adição: " + (numberA + numberB));
    System.out.println("Subtração: " + (numberA - numberB));
    System.out.println("Multiplicação: " + (numberA * numberB));
    System.out.println("Divisão: " + (numberA / numberB));

    input.close();
  }
}