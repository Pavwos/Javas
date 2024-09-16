import java.util.Scanner;

public class Imposto {
  public static void main(String[] args){
    Scanner scann = new Scanner(System.in);
    System.out.println("Digite o salário bruto: "); 
    double salarioBruto = scann.nextDouble();
    double desconto = 0;

    if (salarioBruto < 2112.00){
      desconto = 0;
    } else if (salarioBruto <= 2826.65){
      desconto = salarioBruto * 0.075;
    } else if (salarioBruto <= 3751.05){
      desconto = salarioBruto * 0.15;
    } else if (salarioBruto <= 4664.68){
      desconto = salarioBruto * 0.225;
    } else {
      desconto = salarioBruto * 0.275;
    }

    double salarioLiquido = salarioBruto - desconto;

    System.out.println("Salário Bruto: R$" + salarioBruto);
    System.out.println("Desconto de IR: R$" + desconto);
    System.out.println("Salário Líquido: R$" + salarioLiquido);

    scann.close();
  }
}
