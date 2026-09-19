public class Funcionario {
	
	String nome;
	double horasTrabalhadas;
	double valorHora;
	

	public double SalarioFinal(){
			
		double salario = horasTrabalhadas * valorHora;
		salario = salario - (salario * 0.11);
		
		return salario;
		
	}
	
	
}
