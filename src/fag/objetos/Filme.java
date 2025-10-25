package fag.objetos;

public class Filme {
	
	
	private String titulo;
	private double avaliacao;
	
	public Filme() {
		
	}
	
	//contrutores do objeto
	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}
	
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo) {			//valida que o titulo n pode ser vazio
		if(titulo!= null  && !titulo.isBlank()) {
		this.titulo = titulo;
		}
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(double avaliacao) {		//valida avaliacao entre 0 e 5
		if (avaliacao >=0 && avaliacao <=5) {
			this.avaliacao = avaliacao;
		}
	}
	
	public void exibir() {
		System.out.printf("O filme '%s' tem '%.2f' de avaliacao", titulo, avaliacao);
	}
	
	

}
