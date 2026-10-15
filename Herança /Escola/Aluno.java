public class Aluno{
	
	private String matricula;
	private String curso;
	private Double nota1;
	private Double nota2;

	public Double calculaMedia(){
		
		Double media = (nota1 + nota2) / 2;
		return media;
	
	}

	public String situacao(){
		
		Double result = calculaMedia();
		
		if(result >= 6){
		
			return "Aprovado";
		
		}else{
			
			return "Em recuperação";
			
		}
		
	}
	
	
	public String getMatricula(){
		
		return this.matricula;
		
	}
	public void setMatricula(String matricula){
		
		this.matricula = matricula;
	
	}
	
	public String getCurso(){
		
		return this.curso;
		
	}
	public void setCurso(String curso){
		
		this.curso = curso;
	
	}
	
	public Double getNota1(){
		
		return this.nota1;
		
	}
	public void setNota1(Double nota1){
		
		this.nota1 = nota1;
	
	}
	public Double getNota2(){
		
		return this.nota2;
		
	}
	public void setNota2(Double nota2){
		
		this.nota2 = nota2;
	
	}
	
}
