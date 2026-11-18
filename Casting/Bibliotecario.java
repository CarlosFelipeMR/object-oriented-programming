
public class Bibliotecario extends Funcionario{
	
	
	private String cargo;
	
	public Bibliotecario(int registro, String cargo, String nome, Double salario){
		super(nome, salario, registro);
		this.cargo = cargo;
	}
	
	@Override
	public Double calculaSalario(){
		
		if(this.cargo.equalsIgnoreCase("Senior")){
			
			Double salarioTotal = getSalario() * 1.30;
			return salarioTotal * 0.90;
			
		}else{
			
			Double salarioTotal = getSalario() * 1.10;
			return salarioTotal * 0.90;
		
		}
		
	}
	
	public String processarEmprestimo(String livro){
		return "Empréstimo de " + livro + " processado por " + cargo + ".";
	}
	
	public String getCargo(){
		return this.cargo;
	}

	public void setCargo(String cargo){
		this.cargo = cargo;
	}
}

