import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite o nome do Cliente: ");
       String nomeCliente = scan.nextLine();
       System.out.println("Por favor digite o Número da Agência: ");
       String agencia = scan.nextLine();
       System.out.println("Digite o Número da Conta: ");
       int numeroConta = scan.nextInt();
       System.out.println("Digite o Saldo: ");
       double saldo = scan.nextDouble();

       System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +saldo+ " já está disponível para saque.");

      
    }
}
