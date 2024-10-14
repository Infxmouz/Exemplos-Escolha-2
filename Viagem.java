package viagem;
import java.util.Scanner;


public class Viagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o destino:");
        System.out.println("1 - Região Norte");
        System.out.println("2 - Região Nordeste");
        System.out.println("3 - Região Centro-Oeste");
        System.out.println("4 - Região Sul");
        
        System.out.print("Digite o número do destino: ");
        int destino = scanner.nextInt();

        System.out.print("A viagem inclui retorno (ida e volta)? (s): ");
        char retorno = scanner.next().charAt(0);

        double preço = 0.0;

        switch (destino) {
            case 1:
                preço = (retorno == 's') ? 900.00 : 500.00;
                break;
            case 2:
                preço = (retorno == 's') ? 650.00 : 350.00;
                break;
            case 3:
                preço = (retorno == 's') ? 600.00 : 350.00;
                break;
            case 4:
                preço = (retorno == 's') ? 550.00 : 600.00;
                break;
            default:
                System.out.println("Destino inválido!");
                scanner.close();
                return; 
        }
        System.out.printf("O preço da passagem é: R$ %.2f%n", preço);
        scanner.close();
    }
    
}
