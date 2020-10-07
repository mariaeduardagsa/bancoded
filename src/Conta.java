import java.util.Scanner;

public class Conta extends Usuario {
	
	// Herdando da classe Usuario
	
	public Conta(String nome, String email, String login, String senha, double saldo) {
		super(nome, email, login, senha, saldo);
		
	}	
	
	//anunciando medoto usado depois em outra classe
	public void sacarDinheiro(String nome) {
	}
	//anunciando medoto usado depois em outra classe
	public void depositarDinheiro(String nome) {
	}
	//anunciando medoto usado depois em outra classe
	public void FazerCambio(double moeda) {
	}
	
	// Validando dados através de Scanner para mostrar dados
				public void mostrarDados(String Nome) {
				   
				   String Confirma;
				   
				   Scanner Confirma1 = new Scanner(System.in);
				   System.out.println("Informe seu Login");
				   
				   Confirma = Confirma1.next();
				   
				   String Validacao;
				   
				   Scanner Validacao1 = new Scanner(System.in);
				   System.out.println("Informe a senha");
				   
				   Validacao = Validacao1.next();
					
				  
				  System.out.println("Usuario [Nome=" + Nome + ", Email=" + Email + ", Login=" + Login + ", Senha=" + Senha + ", Saldo="
							+ Saldo + "]");
						    
				  }
	
	}
