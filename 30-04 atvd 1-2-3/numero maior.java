import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
    
    
    System.out.print("digite o numeroA: ");
    int A = leia.nextInt();
    
    System.out.print("digite o numeroB: ");
    int B= leia.nextInt();
 
    if ( A >= B) {
      System.out.println("esse numero é maior");
    }
    else {
      System.out.println("esse numero é menor"); }  
  }
}

