import java.util.Scanner; // Biblioteca Scanner

public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        Double nota = scanner.nextDouble();
        char classificacao;
        
        
        if (nota >= 90) {
            classificacao = 'A';
        } else if (nota >= 80) {
            classificacao = 'B';
        } else if (nota >= 70) {
            classificacao = 'C';
        } else if (nota >= 60) {
            classificacao = 'D';
        } else {
            classificacao = 'F';
        }

        System.out.println("o aluno tirou: " + classificacao);
    }
}