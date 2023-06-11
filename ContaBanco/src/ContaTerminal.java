import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String padrao = "###,###.00";
       DecimalFormat df = new DecimalFormat(padrao);
       System.out.println("***SISTEMA DE CADASTRO BANCÁRIO***");
       System.out.print("Agora, digite o seu nome: ");
       String nome = scn.nextLine();
       System.out.print("Por favor, digite o numero da Agência: ");
       int agencia = scn.nextInt();
       System.out.print("Por favor, digite o número da conta: ");
       String conta = scn.next();
       System.out.print("Por favor, digite o saldo inicial: ");
       float saldo = scn.nextFloat();
       System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + df.format(saldo) + " já está disponível para saque.");

    }
}
