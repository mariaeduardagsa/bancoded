import Interface.Desistencia;
import Interface.SAC;

public abstract class Gerencia implements SAC, Desistencia{
	
	int Funcionarios;
	double salarioFuncionarios;
	double valorSalario;
	double valeAlimencao;
	int diasTrabalhados;
	
	public void ContaFuncionarios (double valorSalario, int Funcionarios, double valeAlimentacao, int diasTrabalhados) {
		Double Receita = (valorSalario * Funcionarios) + valeAlimentacao*diasTrabalhados;
		System.out.println("O valor a ser gasto pelo banco para pagamento de funcionários será de R$ "+Receita);		
	}

}
