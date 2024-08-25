public class Operadores {
 public static void main(String[] args){
  int a = 10;
  int b = 2;

  System.out.println("Soma: " + (a+b));
  System.out.println("Subtração: " + (a-b));
  System.out.println("Multiplicação: " + (a*b));
  System.out.println("Divisão: " + (a/b));
  System.out.println("Módulo: " + (a%b));

  System.out.println("A = B? " + (a == b));
  System.out.println("A > B? " + (a > b));

  boolean resultado = (a < b) && (b > 15);
  System.out.println("A < B e B > 15? " + resultado);
 } 
}
