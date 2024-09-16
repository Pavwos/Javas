import java.util.Scanner;

public class Media{
  public static void main(String[] args){
    Scanner scann = new Scanner(System.in);
    System.out.println("Digite a nota da A1: "); 
    double A1 = scann.nextDouble();
    System.out.println("Digite a nota da A2: "); 
    double A2 = scann.nextDouble();
    System.out.println("Digite a frequência (em %): ");
    int Freq = scann.nextInt();

    double media = (A1 + A2) / 2;

    if (Freq < 75){
      System.out.println("Retido por faltas");
    } else {
      if(media >= 6){
        System.out.println("Aprovado");
      } else if (media >= 4) {
        System.out.println("Deve fazer AF");
      } else{
        System.out.println("Reprovado");
      }
    }
    scann.close();
  }
}