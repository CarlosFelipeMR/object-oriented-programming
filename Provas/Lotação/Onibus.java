public class Onibus{
	
	private int numero;
	private String linha;
	private int capacidade;
	private int passageirosAtuais;
	private Double tarifa;
	
	public Onibus(int numero,String linha,int capacidade,Double tarifa){
		
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.passageirosAtuais = 0;
		this.tarifa = tarifa;
	
	
	}
	
	public Onibus(int numero,String linha, int capacidade){
		
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.passageirosAtuais = 0;
		this.tarifa = 4.50;
	
	}
	public boolean  embarcarPassageiro(){
		
		if(this.passageirosAtuais < capacidade){
			
			passageirosAtuais ++;
			return true;
		}else{
			return false;
		}
	}
	public boolean  embarcarPassageiro(int quantidade){
	 
		if(this.passageirosAtuais + quantidade <= capacidade){
			
			this.passageirosAtuais += quantidade;
			return true;
		}else{
			
			return false;
		}
	}
	
	public boolean desembarcarPassageiro(){
		
		if(this.passageirosAtuais >= 1){
			
			this.passageirosAtuais --;
			return true;
		}else{
			
			return false;
		}
	
	}
	public boolean desembarcarPassageiro(int quantidade){
		
		if(this.passageirosAtuais >= quantidade){
			
			this.passageirosAtuais -= quantidade;
			return true;
		}else{
			
			return false;
		}
		
	
	}
	
	public Double calcularRenda(String tipoTarifa){
		
		if(tipoTarifa.equals("SIMPLES") || tipoTarifa.equals("Simples") || tipoTarifa.equals("simples")){
			
			return this.passageirosAtuais * this.tarifa;
		
		}else if(tipoTarifa.equals("INTEGRADA") || tipoTarifa.equals("Integrada") || tipoTarifa.equals("integrada")){
		
			return this.passageirosAtuais * this.tarifa * 1.5;
		}
		return -1.0;
	}
	
	public String exibirInfo(){
		
		return "Ônibus [ "+ getNumero() +" ]"
		+"\nlinha: [ "+ getLinha() +" ]";
		
	}
	public String exibirInfo(boolean detalhado){
		
		if(detalhado){
			
			return "Ônibus [ "+ getNumero() +" ]"
			+"\nLinha: [ "+ getLinha() +" ]"
			+"\nPassageiro: [ "+ getPassageiroAtuais() + "/" + getCapacidade()+" ]"
			+"\nTarifa: R$ [ " + getTarifa() + " ]";
			
		}else{
			
			return "Ônibus [ "+ getNumero() +" ]"
			+"\nLinha: [ "+ getLinha() +" ]"
			+"\nTarifa: R$ [ " + getTarifa() + " ]";
			
			
		}
	}
	
	public int getNumero(){
	
		return this.numero;
		
	}
	public String getLinha(){
	
		return this.linha;
		
	}
	public int getCapacidade(){
	
		return this.capacidade;
		
	}
	public int getPassageiroAtuais(){
	
		return this.passageirosAtuais;
		
	}
	public Double getTarifa(){
	
		return this.tarifa;
		
	}
	
	public void setNumero(int numero){
		
		this.numero = numero;
		
    }
	public void setLinha(String linha){
		
		this.linha = linha;
		
    }
	public void setCapacidade(int capacidade){
		
		this.capacidade = capacidade;
		
    }
	public void setPassageirosAtuais(int passageirosAtuais){
		
		this.passageirosAtuais = passageirosAtuais;
		
    }
	public void setTarifa(double tarifa){
		
		this.tarifa = tarifa;
		
    }


}
