package rodizio;

import java.util.Scanner;

public class Rodizio {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os quatro dígitos da placa do automóvel: ");
        String placa = scanner.nextLine();

        if (placa.length() != 4 || !placa.matches("\\d{4}")) {
            System.out.println("Placa inválida");
        } else {
            
            char ultimoDigito = placa.charAt(placa.length() - 1);

            switch (ultimoDigito) {
                case '1':
                case '2':
                    System.out.println("Rodízio na segunda");
                    break;
                case '3':
                case '4':
                    System.out.println("Rodízio na terça");
                    break;
                case '5':
                case '6':
                    System.out.println("Rodízio na quarta");
                    break;
                case '7':
                case '8':
                    System.out.println("Rodízio na quinta");
                    break;
                case '9':
                case '0':
                    System.out.println("Rodízio na sexta");
                    break;
                default:
                    System.out.println("Dígito inválido!");
                    break;
            }
        }

        scanner.close();
    }
    
}
