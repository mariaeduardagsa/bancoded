import java.util.Scanner;

public class Deposito extends Conta {

	public Deposito(String nome, String email, String login, String senha, double saldo) {
		super(nome, email, login, senha, saldo);
		// TODO Auto-generated constructor stub
	}

	public void depositarDinheiro(String nome) {
		System.out.println("Seu saldo atual � de R$ "+Saldo);
	
		Scanner Deposito1 = new Scanner(System.in);
	
		double Deposito;
	
		System.out.println("Quanto deseja depositar?");
	
		Deposito = Deposito1.nextDouble();
	
		Saldo = Saldo + Deposito;
		System.out.println("Opera��o efetuada! Seu novo saldo � de R$"+Saldo);
	}
	
}
