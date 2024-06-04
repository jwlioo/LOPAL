import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
   int media;
   
    
    System.out.print("digite a nota da prova 1: ");
    int n1 = leia.nextInt();
    
    System.out.print("digite a nota da prova 2: ");
    int n2 = leia.nextInt();
    
    
    System.out.print("digite a nota da prova 3: ");
   int n3 = leia.nextInt();
    
    media = (n1 +n2 +n3 ) /3;
   
    
 
    if ( media >=7 ) {
      System.out.println("voce foi aprovado");
      System.out.println("a sua media é" +media);
    }
    else {
      System.out.println("voce foi reprovado"); 
     System.out.println("a sua media é" +media);
      
      
        
    }  
  
      
     
      
  }
}
