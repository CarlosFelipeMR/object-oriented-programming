public abstract class Empregado extends Pessoa{

  
	private int codigoSetor;
	private Double salarioBase;
	private Double imposto;
	
	public Empregado(String nome,String endereco,String telefone,int codigoSetor,Double salarioBase,Double imposto){
		
		super(nome,endereco,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	
	}
	
	public abstract Double calculaSalario();
	
	
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Double getImposto() {
        return imposto;
    }

   

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    
}
