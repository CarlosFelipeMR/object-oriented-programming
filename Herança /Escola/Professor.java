public class Professor extends Pessoa{

	private String diciplina;
	private Double valorHoraAula;
	private int quantidadeHoras;

	
	public Double calculaPagamento(){
		
		Double total = valorHoraAula * quantidadeHoras;
		
		return total;
		
	}

	public String getDiciplina(){
		
		return this.diciplina;
	
	}
	public void setDiciplina(String diciplina){
		
		this.diciplina = diciplina;
		
	}
	
	public Double getValorHoraAula(){
		
		return this.valorHoraAula;
	
	}
	public void setValorHoraAula(Double valorHoraAula){
		
		this.valorHoraAula = valorHoraAula;
	
	}
	
	public int getQuantidadeHoras(){
		
		return this.quantidadeHoras;
		
	}
	public void setQuantidadeHoras(int quantidadeHoras){
		
		this.quantidadeHoras = quantidadeHoras;
		
	}
}
