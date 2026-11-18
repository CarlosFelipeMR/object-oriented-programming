
public class Auxiliar extends Funcionario{
	
	
	private String setor;
	
	public Auxiliar(int registro, String setor, String nome, Double salario){
		super(nome, salario, registro);
		this.setor = setor;
	}
	
	@Override
	public Double calculaSalario(){
		
		if(this.setor.equalsIgnoreCase("Acervo")){
			
			Double salarioTotal = getSalario() * 1.15;
			return salarioTotal * 0.90;
			
		}else{
			
			Double salarioTotal = getSalario() * 1.05;
			return salarioTotal * 0.90;
		
		}
		
	}
	
	public String organizarLivros(String genero){
		
		return "Livros de " + genero + " organizados no " + setor + ".";
	}
	
	public String getSetor(){
		return this.setor;
	}

	public void setSetor(String setor){
		this.setor = setor;
	}
}

