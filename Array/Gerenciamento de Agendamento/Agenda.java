public class Agenda{

	private String nomeDaAgenda;
	private Pessoa[] contatos;
	private int totalContatos;

	public Agenda(String nomeDaAgenda,int tamanho){
		
		this.nomeDaAgenda = nomeDaAgenda;
		contatos = new Pessoa[tamanho];
		
	}

	public boolean adicionaPessoa(Pessoa pessoa){

		for (int i = 0; i < contatos.length; i++)
		{
			if (contatos[i] == null)
			{
				contatos[i] = pessoa;
				totalContatos ++;
				return true;
			}
		}
		
		return false;
	
	}
	
	public boolean removePessoa(Pessoa pessoa){
		
		for (int i = 0; i < contatos.length; i++)
		{
			if (contatos[i] != null && contatos[i] == pessoa)
			{
				contatos[i] = null;
				totalContatos --;
				return true;
			}
		}
		
		return false;
		
	}
	public boolean alteraInformacoes(Pessoa pessoa){
		
		for (int i = 0; i < contatos.length; i++)
		{
			if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(pessoa.getNome()))
			{
				contatos[i] = pessoa;
				return true;
			}
		}
		
		return false;
		
	}
	
	public Pessoa[] buscaPessoas(){
		
		ordenaContatos();
		return contatos;	
		
		
	
	}
	
	public Pessoa buscaContato(String nome){
		
		for (int i = 0; i < contatos.length; i++)
		{
			if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome))
			{
				return contatos[i];
			}
		}
		
		return null;
	
	}
	public void ordenaContatos() {

    for (int i = 0; i < contatos.length - 1; i++) {
        for (int j = i + 1; j < contatos.length; j++) {

            if (contatos[i] != null && contatos[j] != null &&
                contatos[i].getNome().compareToIgnoreCase(contatos[j].getNome()) > 0) {

                Pessoa aux = contatos[i];
                contatos[i] = contatos[j];
                contatos[j] = aux;
            }
        }
    }
}
}
