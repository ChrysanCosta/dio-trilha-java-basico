import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            // Solicita os dois números
            System.out.print("Digite o primeiro número (num1): ");
            int parametroUm = terminal.nextInt();

            System.out.print("Digite o segundo número (num2): ");
            int parametroDois = terminal.nextInt();

            // Verifica se os parâmetros são válidos
            if (parametroDois > parametroUm) {
                throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");
            }

            int resultado = parametroUm - parametroDois;
            System.out.println("Contando de 1 até " + resultado + ":");
            for (int i = 1; i <= resultado; i++) {
                System.out.println(i);
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite apenas números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }
}
