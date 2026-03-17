package br.unibh;

// Nome: Tom Alexander
// RA: 1261933671
// Versão do Java: OpenJDK 25

import java.util.Scanner;

public class Exercicio04 {
  static void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o salário atual:");
    double currentSallary = input.nextDouble();
    System.out.printf("Salário atual: R$ %.2f%n", currentSallary);
    double newSalary = currentSallary * 1.07;
    System.out.printf("Novo salário: R$ %.2f%n", newSalary);

    input.close();
  }
}