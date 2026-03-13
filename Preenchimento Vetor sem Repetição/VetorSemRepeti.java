import java.util.Scanner;

public class VetorSemRepeti {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite o número para a posição " + i + ": ");
            int numero = scanner.nextInt();

            boolean repetido = false;
            
            for (int j = 0; j < i; j++) {
                if (vetor[j] == numero) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                System.out.println("Número repetido! Digite um valor diferente.");
                i--; 
                vetor[i] = numero;
            }
        }
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}