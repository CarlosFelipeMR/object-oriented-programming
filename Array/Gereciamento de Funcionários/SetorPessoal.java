public class SetorPessoal{

	
	private Funcionario [] funcionarios;
	
	public SetorPessoal(int tamanho){
	
		funcionarios = new Funcionario[tamanho];
		
	}
	
	public boolean adicionarFuncionario(Funcionario funcionario){
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] != null && (funcionarios[i].getMatricula() == funcionario.getMatricula() ||
			funcionarios[i].getNome().equals(funcionario.getNome())))
			{
				return false;
			}
			
		}
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if(funcionarios[i] == null){
				
				funcionarios[i] = funcionario;
				return true;
			}
		}
		
		return false;
	
	
	}
	public boolean removerFuncionario(Funcionario funcionario){
		
		
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if(funcionarios[i] != null && funcionarios[i] == funcionario){
				
				funcionarios[i] = null;
				return true;
			
			}
		}
		
		return false;
	
	
	}
	
	public Funcionario buscarFuncionario(int matricula){
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] != null && funcionarios[i].getMatricula() == matricula)
			{
				return funcionarios[i];
			}
		}
		
		return null;
	}
	public Funcionario buscarFuncionario(String nome){
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] != null && funcionarios[i].getNome().equals(nome))
			
			{
				return funcionarios[i];
			}
		}
		
		return null;
	}
	
	public Funcionario[] listarFuncionarios(int departamento){
		
		int quantidade = 0;
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if(funcionarios[i] != null && funcionarios[i].getDepartamento() == departamento){
					
				quantidade++;
			
			}
		}
		
		Funcionario[] resultado = new Funcionario[quantidade];
		int j = 0;
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] != null && funcionarios[i].getDepartamento() == departamento)
			{
				resultado[j] = funcionarios[i];
				j++;
			}
		}
		ordenarFuncionarios(resultado);
		return resultado;
	}
	public Funcionario[] listarFuncionarios(String funcao){
		
		int quantidade = 0;
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if(funcionarios[i] != null && funcionarios[i].getFuncao().equals(funcao)){
					
				quantidade++;
			
			}
		}
		
		Funcionario[] resultado = new Funcionario[quantidade];
		int j = 0;
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] != null && funcionarios[i].getFuncao().equals(funcao))
			{
				resultado[j] = funcionarios[i];
				j++;
			}
		}
		ordenarFuncionarios(resultado);
		return resultado;
	}
	public Funcionario[] listarFuncionarios(){
		
		int quantidade = 0;
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if(funcionarios[i] != null){
					
				quantidade++;
			
			}
		}
		
		Funcionario[] resultado = new Funcionario[quantidade];
		int j = 0;
		
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] != null)
			{
				resultado[j] = funcionarios[i];
				j++;
			}
		}
		ordenarFuncionarios(resultado);
		return resultado;
	
	}
	
	public void ordenarFuncionarios(Funcionario[] resultado){
		
		for (int i = 0; i < resultado.length - 1; i++)
		{
			for (int j = 0; j < resultado.length - 1 - i; j++)
			{
				if (resultado[j].getMatricula() > resultado[j+1].getMatricula())
				{
					Funcionario aux = resultado[j];
					resultado[j] = resultado[j+1];
					resultado[j+1] = aux;
				}
			}
		}
	}

	
	
}

