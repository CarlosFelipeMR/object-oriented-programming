public class Paciente {

	String nome;
	String sexo;	
	double peso;
	double altura;

	public Double CalcularIMC(){
	
		double imc = peso / (altura * altura);
		
		return imc;
	} 


}


