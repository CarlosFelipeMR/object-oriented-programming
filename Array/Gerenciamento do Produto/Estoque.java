import java.util.Objects;

public class Estoque {

    private Produto[] produtos = new Produto[10];

    public void adicionarProduto(Produto produto) {

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] == null) {

                produtos[i] = produto;
                break;
            }
        }
    }

    public Produto buscaProduto(int codigo) {

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] != null && produtos[i].getCodigo() == codigo) {

                return produtos[i];
            }
        }

        return null;
    }
    public Produto buscaProduto(String descricao) {

        for (int i = 0; i < produtos.length; i++) {

			if (produtos[i] != null && 
			Objects.equals(produtos[i].getDescricao(), descricao)) {
			
			return produtos[i];
			
			}		
        }

        return null;
    }
    
    public void excluiProduto(Produto produto){
		
		for (int i = 0; i < produtos.length; i++)
		{
			if(produtos[i] == produto){
				
				produtos[i] = null;
				break;
			}
		}
		
		
	}
}
