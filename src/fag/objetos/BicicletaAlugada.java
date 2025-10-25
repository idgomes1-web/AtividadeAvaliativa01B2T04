package fag.objetos;

public class BicicletaAlugada {
	
	private int hora;
	private double valorHora;
	
	//construtores
	public BicicletaAlugada() {
		
	}
	
	public BicicletaAlugada(int hora, double valorHora) {
		setHora(hora);
		setValorHora(valorHora);
	}
	
	
	//getters e setters
	public int getHoras() {
		return hora;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	
	public void setHora(int hora) {
		if(hora >=1 ) {
			this.hora = hora;
		}
	}
	
	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		}
	}
	
	
	//metodos
	public double calcularValor() {
		return hora*valorHora;
	}
	
	

}
