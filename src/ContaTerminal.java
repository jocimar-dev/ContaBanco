import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        var numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agencia!");
        var agencia = scanner.nextInt();
        System.out.println("Por favor, digite o nome do cliente!");
        var nomeCliente = scanner.next();
        System.out.println("Por favor, digite o nome saldo!");
        var saldo = scanner.nextInt();
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " +numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}