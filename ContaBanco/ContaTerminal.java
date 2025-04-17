import java.util.Scanner;

public class ContaTerminal
{
	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("== Crie sua conta ==");
		
		
		// Leitura das informacoes do usuário
		System.out.println("Qual o seu nome? ");
		String nomeCliente = scanner.nextLine();
		
	    System.out.println("Digite o número da Agência: ");
	    String numeroAgencia = scanner.nextLine();
	    
	    System.out.println("Número da sua conta:");
	    int numeroConta = scanner.nextInt();
	    
	    System.out.println("Insira seu saldo: ");
	    double saldoDisponivel = scanner.nextDouble();
	    
	    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoDisponivel);
	    
	    scanner.close();
	}
}
