
public class CaixaEletronico {

	public static void main(String[] args) {
		
		Conta Jose = new Conta("Jose Antonio", "joseantonio@hotmail.com", "jantonio", "123456", 500);
		Jose.mostrarDados("Jose Antonio");
				
		Conta Evandro = new Conta("Evandro Mesquita", "evandromesquita@hotmail.com", "emesquita", "123456", 1000);
		Evandro.sacarDinheiro("Evandro Mesquita");
		
		Conta Lucio = new Conta("Lucio Tadeu", "luciotadeu@hotmail.com", "ltadeu", "123456", 5000);
		Lucio.depositarDinheiro("Lucio Tadeu");
	}

}
