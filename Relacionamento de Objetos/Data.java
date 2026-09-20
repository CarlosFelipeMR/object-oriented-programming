public class Data{
    
   private int dia;
   private int mes;
   private int ano;
   
   public Data(){
	}
   
   public Data(int dia, int mes, int ano){
	   
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	   
	}
   
	public String retornarData(){
		return String.format("%02d/%02d/%04d", getDia(), getMes(), getAno());
	}
   public String calculaTempo(Data data){
	
	   int anos = data.ano - this.ano;
	   int meses = data.mes - this.mes;
	   int dias = data.dia - this.dia;
	   if(dias < 0){
		   
			meses --;
			
			int mesAnterior = data.mes - 1;
			
			if(mesAnterior == 2){
				dias += 28;
			}else if(mesAnterior == 4 || mesAnterior == 6 ||
			mesAnterior == 9 || mesAnterior == 11){
				dias+= 30;
			}else{
				dias += 31;
			}
		}
		if(meses < 0){
		
			anos--;
			meses += 12;
			
		}
	
		return anos + " anos, " + meses + " meses, " + dias + " dias";
	}
	
	
	public int getDia(){
		
		return this.dia;
	
	}
	public int getMes(){
		
		return this.mes;
	
	}
	public int getAno(){
		
		return this.ano;
	
	}
	public void setDia(int dia){
	
		this.dia = dia;
		
	}
	public void setMes(int Mes){
	
		this.mes = mes;
		
	}
	public void setAno(int ano){
	
		this.ano = ano;
		
	}
}
