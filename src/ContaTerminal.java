import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Olá caro cliente, por favor nos informe o seus nome: ");
        String nomeCliente = scan.next();

        System.out.print("Nos informe a sua agência: ");
        String agencia = scan.next();

        System.out.print("Nos informe o numero de sua conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Nos informe o saldo disponível em sua conta: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + " ,conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque." );

        scan.close();
    }
}
