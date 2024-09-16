import java.util.Scanner;

public class Camisas {
  public static void main(String[] args){
    Scanner scann = new Scanner(System.in);
    
    double camisaP = 10.00;
    double camisaM = 12.00;
    double camisaG = 15.00;

    System.out.println("Digite a quantidade de camisetas pequenas: ");
    int qtdP = scann.nextInt();
    System.out.println("Digite a quantidade de camisetas médias: ");
    int qtdM = scann.nextInt();
    System.out.println("Digite a quantidade de camisetas grandes: ");
    int qtdG = scann.nextInt();

    double totalP = qtdP * camisaP;
    double totalM = qtdM * camisaM;
    double totalG = qtdG * camisaG;

    double total = totalP + totalM + totalG;

    System.out.println("O total arrecadado foi: " + total);
  
    scann.close();
  }
}
