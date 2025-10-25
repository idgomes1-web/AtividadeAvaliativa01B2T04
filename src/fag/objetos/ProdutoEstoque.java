package fag.objetos;

public class ProdutoEstoque {
	
	
	private String nome;
	private int quantidade;			//remete ao estoque inicial
	
	
	//construtores
	public ProdutoEstoque(){
		
	}
	
	public ProdutoEstoque(String nome, int quantidade) {
		setNome(nome);
		setQuantidade(quantidade);
	}
	
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidade = quantidade;
		}
	}
	
	
	
	//metodos
	public void adicionarEstoque(int qtd) {
		
		if(qtd> 0 ) {					// para não adicionar 0 ou negativo
			quantidade += qtd;
		}
		else {
			System.out.println("quantidade insuficiente");
		}
	
	}
	
	public void removerEstoque(int qtd) {		
		if(qtd>0 && qtd<=quantidade)  {		//o valor tem que ser maior q 0 ou igual ao estoque, ai não da negativo ou tira 0
			quantidade -= qtd;
		}
		else{
			System.out.println("valor invalido");
		}
		
		
	}
	
	
	
	

}
