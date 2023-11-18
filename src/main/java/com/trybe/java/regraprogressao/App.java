package com.trybe.java.regraprogressao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Método main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String inputAtividadesQtd = scanner.next();

    int totalAtividades = Integer.parseInt(inputAtividadesQtd);

    String[] nomeAtividades = new String[totalAtividades];
    int[] pesoAtividades = new int[totalAtividades];

    for (int i = 0; i < totalAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String nomeAtividade = scanner.next();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      String inputPeso = scanner.next();

      int peso = Integer.parseInt(inputPeso);
      nomeAtividades[i] = nomeAtividade;
      pesoAtividades[i] = peso;
    }
    System.out.println(Arrays.toString(nomeAtividades));
    System.out.println(Arrays.toString(pesoAtividades));
    scanner.close();
  }
}