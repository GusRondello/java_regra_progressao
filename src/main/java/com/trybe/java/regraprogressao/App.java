package com.trybe.java.regraprogressao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Método para calcular resultado e retornar informação do mesmo.
   *
   * @param notas notas das atividades do aluno.
   * @param pesos peso de cada atividade feita.
   */
  public static void informarResultado(int[] notas, int[] pesos) {
    int calculoNota = 0;
    for (int i = 0; i < notas.length; i++) {
      calculoNota += (notas[i] * pesos[i]);
    }
    double resultado = calculoNota / 100f;

    if (resultado >= 85) {
      System.out.println("Parabéns! Você alcançou " + resultado
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + resultado
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }

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
    int[] notaAtividades = new int[totalAtividades];
    int somaPeso = 0;

    for (int i = 0; i < totalAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String nomeAtividade = scanner.next();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      String inputPeso = scanner.next();

      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      String inputNota = scanner.next();

      int peso = Integer.parseInt(inputPeso);
      int nota = Integer.parseInt(inputNota);
      nomeAtividades[i] = nomeAtividade;
      pesoAtividades[i] = peso;
      notaAtividades[i] = nota;
      somaPeso += pesoAtividades[i];
    }
    if (somaPeso != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      informarResultado(notaAtividades, pesoAtividades);
    }

    System.out.println(Arrays.toString(nomeAtividades));
    System.out.println(Arrays.toString(pesoAtividades));
    scanner.close();
  }
}