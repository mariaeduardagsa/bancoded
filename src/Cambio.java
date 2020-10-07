

public abstract class Cambio extends Conta {
	
		public Cambio(String nome, String email, String login, String senha, double saldo) {
		super(nome, email, login, senha, saldo);
		// TODO Auto-generated constructor stub
	}


	double dollar = 5.06;
	double euro = 5.68;
	double peso = 0.23;
	double moeda;
	
	public void FazerCambio(double moeda) {
		if(moeda == dollar) {
			double ValorDepoisCambio = Saldo * dollar;
			System.out.println("Depois de fazer Câmbio do REAL para "+ moeda + "escolhida, você conseguiu um valor de " +ValorDepoisCambio+"$.");
		} else if (moeda == euro) {
			double ValorDepoisCambio = Saldo * euro;
			System.out.println("Depois de fazer Câmbio do REAL para "+ moeda + "escolhida, você conseguiu um valor de " +ValorDepoisCambio+"£.");
		} else if (moeda == peso) {
			double ValorDepoisCambio = Saldo * peso;
			System.out.println("Depois de fazer Câmbio do REAL para "+ moeda + "escolhida, você conseguiu um valor de " +ValorDepoisCambio+"$");
		}
		
}};
