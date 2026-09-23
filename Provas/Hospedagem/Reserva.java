public class Reserva{

	private int codigo;
	private String nomeHospede;
	private int diarias;
	private boolean incluiRefeicoes;
	
	public Reserva (int codigo, String nomeHospede,int diarias){
		
		this.codigo = codigo;
		this.nomeHospede = nomeHospede;
		this.diarias = diarias;
		this.incluiRefeicoes = false;
		
	}
	public Reserva (int codigo, String nomeHospede,int diarias,boolean refeicoes){
		
		this.codigo = codigo;
		this.nomeHospede = nomeHospede;
		this.diarias = diarias;
		this.incluiRefeicoes = refeicoes;
		
		
	}

	public  Double calculaDiaria(){
		
		double ref;	
		if(incluiRefeicoes){
			ref = diarias * 50.0;
			return (this.diarias * 200.0) + ref;
		}else{
			
			return this.diarias * 200.0;
		}
			
	}
	public  Double calculaDiaria(Double taxaLimpeza){
		
		double ref;	
		if(incluiRefeicoes){
			ref = diarias * 50.0;
			return ((this.diarias * 200.0) + ref) + taxaLimpeza;
		}else{
			
			return (this.diarias * 200.0) + taxaLimpeza;
		}
			
	}
	
	public Double adicionarPasseio(String tipo){
		
		if(tipo.equalsIgnoreCase("CAVALGADA")){
			
			return 80.0;
			
		}else if(tipo.equalsIgnoreCase("TRILHA")){
		
			return 60.0;
		
		}else if(tipo.equalsIgnoreCase("PESCA")){
		
			return 70.0;
		
		}else{
			
			return 0.0;
		}
	
	}
	public Double adicionarPasseio(String tipo, int quantidade){
		
		if(tipo.equalsIgnoreCase("CAVALGADA")){
			
			return 80.0 * quantidade;
			
		}else if(tipo.equalsIgnoreCase("TRILHA")){
		
			return 60.0 * quantidade;
		
		}else if(tipo.equalsIgnoreCase("PESCA")){
		
			return 70.0 * quantidade;
		
		}else{
			
			return 0.0;
		}
	
	}
	
	public String exibirReserva(){
		
		return "Reserva: [" + getCodigo() + "]"
		+"\nHospede: [" + getNomeHospede() + "]"
		+"\nDiárias: [" + getDiarias() + "]";
	
	}
	public String exibirReserva(boolean comDetalhes){
		
		if(comDetalhes){
			return "Reserva: [" + getCodigo() + "]"
			+"\nHospede: [" + getNomeHospede() + "]"
			+"\nDiárias: [" + getDiarias() + "]"
			+"\nRefeições Inclusas [Sim]";
		}else{
			return "Reserva: [" + getCodigo() + "]"
			+"\nHospede: [" + getNomeHospede() + "]"
			+"\nDiárias: [" + getDiarias() + "]"
			+"\nRefeições Inclusas [Não]";
		}
	}
	public int getCodigo(){
		
		return this.codigo;
		
	}
	public String getNomeHospede(){
		
		return this.nomeHospede;
		
	}
	public int getDiarias(){
		
		return this.diarias;
		
	}
	public boolean getIncluiRefeicoes(){
		
		return this.incluiRefeicoes;
		
	}
	
	public void setCodigo(int codigo){
		
		this.codigo = codigo;
	
	}
	public void setNomeHospede(String hospede){
		
		this.nomeHospede = hospede;
	
	}
	public void setDiarias(int diarias){
		
		this.diarias = diarias;
	
	}
	public void setIncluirRefeicoes(boolean refeicoes){
		
		this.incluiRefeicoes = refeicoes;
	
	}
}
