public class Funcionario{

	private int matricula;
	private String nome;
	private int departamento;
	private Double salario;
	private String funcao;


	public Funcionario (int matricula,String nome,int departamento,Double salario,String funcao){
		
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.funcao = funcao;
	}
	
	public int getMatricula(){
		
		return this.matricula;
		
	}
	public String getNome(){
		
		return this.nome;
		
	}
	public int getDepartamento(){
		
		return this.departamento;
		
	}
	public Double getSalario(){
		
		return this.salario;
		
	}
	public String getFuncao(){
		
		return this.funcao;
		
	}

	public void setMatricula(int matricula){
		
		this.matricula = matricula;	
	
	}
	public void setNome(String nome){
		
		this.nome = nome;	
	
	}
	public void setDepartamento(int departamento){
		
		this.departamento = departamento;	
	
	}
	public void setSalario(Double salario){
		
		this.salario = salario;	
	
	}
	public void setFuncao(String funcao){
		
		this.funcao = funcao;	
	
	}
	public String toString() {
    return "Matrícula: " + getMatricula()
        + "\nNome: " + getNome()
        + "\nDepartamento: " + getDepartamento()
        + "\nSalário: " + getSalario()
        + "\nFunção: " + getFuncao();
	}
}	
	
