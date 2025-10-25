package fag.objetos;

public class Musica {
	
	private String titulo;
	private int duracaoSegundos;
	
	//construtores
	public Musica() {
		
	}
	
	public Musica(String titulo, int duracaoSegundos) {
		setTitulo(titulo);
		setDuracaoSegundos(duracaoSegundos);
	}
	
	//getters e setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}	
	}
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}
	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
	
	public String formatarDuracao() {
		int minuto = duracaoSegundos/60;
		int segundo = duracaoSegundos % 60;
		
		return  minuto + ":" + segundo;
	}
	
	
	
	
	

}
