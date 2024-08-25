public class Metodos {
  public static void main(String[] args){
    saudacao();
    int resultado = soma(5, 10);
    System.out.println("Resultado da soma: " + resultado);

  }

  public static void saudacao(){
    System.out.println("Oi, eu sou o Goku.");
  }

  public static int soma(int a, int b){
    return a + b;
  }
}
