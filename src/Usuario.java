

//CLASSE MAE
public class Usuario {
	
	public String Nome;
	public String Email;
	public String Login;
	public String Senha;
	public Double Saldo;
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	// toString para não procurar endereço de memória 
	
	public String toString() {
		return "Usuario [Nome=" + Nome + ", Email=" + Email + ", Dialogo=" + Login + ", Senha=" + Senha + ", Saldo="
				+ Saldo + "]";
	}
	
	//Constructor da classe mãe

	public Usuario(String nome, String email, String login, String senha, double saldo) {
		super();
		Nome = nome;
		Email = email;
		Login = login;
		Senha = senha;
		Saldo = saldo;
	}

}
