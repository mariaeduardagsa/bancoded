import java.util.Scanner;

public class Saque extends Conta {

	public Saque(String nome, String email, String login, String senha, double saldo) {
		super(nome, email, login, senha, saldo);
		// TODO Auto-generated constructor stub
	}

	public void sacarDinheiro(String nome) {
		System.out.println("Seu saldo atual é de R$ "+Saldo);
		
		Scanner Saque1 = new Scanner(System.in);
		
		double Saque;
		
		System.out.println("Quanto deseja sacar?");
		
		Saque = Saque1.nextDouble();
		
		if(Saque > Saldo) {
			System.out.println("Valor é maior que seu saldo.");
		} else {
			Saldo = Saldo - Saque;
			System.out.println("Operação realizada. Seu novo saldo é R$"+ Saldo);
		}
		
	}
	
	
}
