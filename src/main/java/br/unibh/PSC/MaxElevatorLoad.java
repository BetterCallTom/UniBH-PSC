package br.unibh.PSC;

import java.util.Scanner;

public class MaxElevatorLoad {
  static void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o valor da 1ª carga:");
    int loadA = input.nextInt();
    System.out.println("Digite o valor da 2ª carga:");
    int loadB = input.nextInt();
    System.out.println("Carga máxima do elevador (kg):");
    int maxLoad = input.nextInt();

    int totalLoad = loadA + loadB;

    if (totalLoad >= maxLoad) {
      System.err.println("Risco de segurança ao usar o elevador!");
      input.close();
    } else {
      System.out.println("Uso autorizado do elevador!");
      input.close();
    }
  }
}
