public class CondiçãoRepeticao {
  public static void main(String[] args){
    int num = 15;
    if (num < 10){
      System.out.println("O número é menor que 10");
    } else{
      System.out.println("O número é maior que 10");
    }

    switch (num) {
      case 10:
        System.out.println("Número é 10");
        break;

      case 15:
        System.out.println("Número é 15");
    
      default:
      System.out.println("Não é nem 15 nem 10");
        break;
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("Contagem: " + i);
  }

  int count = 0;
  while (count < 3) {
      System.out.println("Enquanto count é: " + count);
      count++;
  }

  do{
    System.out.println("Do-while: " + count);
            count--;
  } while(count > 0);


  }
}
