public class AlunoE{

	private String nome;
	private int matricula;
	private Double media;
	private String situacao;
	
	 public AlunoE (String nome,int matricula,Double media){
		 
		 this.nome = nome;
		 this.matricula = matricula;
		 this.media = media;
	
		verificarSituacao();
	}
	
	private void verificarSituacao(){
		
		if(media >= 6.0){
		
			situacao = "APROVADO!";
		
		}else{
			
			situacao = "REPROVADO!";
		
		}
	}
	
	public String resultadoFinal(){
		
		return "NOME:"+nome
		+"\nMATRICULA:"+matricula
		+"\nMÉDIA:"+media
		+"\nSITUAÇÃO:"+situacao;
		
	}
	
	public String getNome(){
	
		return this.nome;
		
	}
	public int  getMatricula(){
	
		return this.matricula;
		
	}
	public Double getMedia(){
	
		return this.media;
		
	}
	
	public void setNome(String nome){
	
		this.nome = nome;
	
	}
	
	public void setMatricula(int matricula){
		
		this.matricula = matricula;
		
	}
	
	public void setMedia(Double media){
		
		this.media = media;
		verificarSituacao();
	
	}
	
}

