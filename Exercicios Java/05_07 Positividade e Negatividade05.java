import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("Digite um número:");
          num = leia.nextInt();
        
        if(num > 0) {
            System.out.println("O número é positivo.");
        }
        
        else if(num < 0) {
            System.out.println("O número é negativo.");
        }
        
        else {
            System.out.println("O número é zero.");
        }
    }
}
