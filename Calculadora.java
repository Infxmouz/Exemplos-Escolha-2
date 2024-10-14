package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número");
        double valor2 = scanner.nextDouble();
        
        char operação = scanner.next().charAt(0);
         System.out.println("Qual operação deseja usar? (+, -, *, /): ");
        
        switch (operação){
            case '+':                
                double soma = valor1 + valor2;
                System.out.println("resultado: " + soma);
                break;
            case '-':
                double subtração = valor1 - valor2;
                System.out.println("resultado: " + subtração);
                break;
            case '*':
                double multiplicação = valor1 * valor2;
                System.out.println("resultado: " + multiplicação);
                break;
            case '/':
                double divisão = valor1 / valor2;
                System.out.printf("resultado: %.2f%n", divisão);
                break; 
            default:
                System.out.println("Operação inválida");
            }
        scanner.close();
    }
    
}
