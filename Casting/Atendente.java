
public class Atendente extends Funcionario{
	
	
	private String turno;
	
	public Atendente(int registro, String turno, String nome, Double salario){
		super(nome, salario, registro);
		this.turno = turno;
	}
	
	@Override
	public Double calculaSalario(){
		
		if(this.turno.equalsIgnoreCase("Noite")){
			
			Double salarioTotal = getSalario() * 1.20;
			return salarioTotal * 0.90;
			
		}else{
		
			return super.calculaSalario();
		
		}
		
	}
	
	public String atenderUsuario(String nome){
    
		return "Usuário " + nome + " atendido no turno " + turno + ".";
	
	}
	
	public String getTurno(){
		return this.turno;
	}

	public void setTurno(String turno){
		this.turno = turno;
	}
}

