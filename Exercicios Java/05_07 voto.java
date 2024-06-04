import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
    int idade =17;
    
    System.out.print("digite sua idade: ");
    idade = leia.nextInt();
 
    if (idade >= 18) {
      System.out.println("você tem idade suficiente para votar.");
    }
    else {
      System.out.println("você nao tem idade suficiente para votar"); }  
  }
}

