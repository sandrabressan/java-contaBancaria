package contaBanco;

import java.util.Scanner;

public class contaTerminal {
	
	public static void main(String[] args) {
		
		Double saldo = 0.00;
		
		Scanner conta = new Scanner(System.in);
		System.out.println("Qual o seu nome completo?");
		String nomeCliente = conta.nextLine();
		System.out.println("Qual o número da agência?");
		String agencia =  conta.nextLine();
		System.out.println("Qual o número da conta?");
		int numeroConta = conta.nextInt();
		
		System.out.println("Olá " + nomeCliente + "!, obrigado"
				+ " por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numeroConta + " e seu saldo é R$ " + saldo + ".");
		
		conta.close();		
	}
}
