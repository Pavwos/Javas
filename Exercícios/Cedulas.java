import java.util.Scanner;

public class Cedulas {
  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    System.out.println("Digite o valor: ");
    int valor = scann.nextInt();

    int[] notas = {100, 50, 20, 10, 5, 2, 1};

    int[] qtdNotas = new int[notas.length];

    for (int i = 0; i < notas.length; i++){
      qtdNotas[i] = valor / notas[i];
      valor %= notas[i];
    }

    System.out.println("Valor lido: " + valor);

    for (int i = 0; i < notas.length; i++){
      System.out.println(qtdNotas[i] + "nota(s) de " + notas[i] + ",00");
    }

    scann.close();
  }
}
