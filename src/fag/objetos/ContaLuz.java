package fag.objetos;

public class ContaLuz {
	
	
	private double consumoKwh;
	private double valorKwh;
	
	//construtores
	public ContaLuz() {
		
	}
	
	public ContaLuz(double consumoKwh, double valorKwh) {
		setConsumoKwh(consumoKwh);
		setValorKwh(valorKwh);
	}
	
	
	
	//getters e setters
	public double getConsumoKwh() {
		return consumoKwh;
	}
	
	public double getValorKwh() {
		return valorKwh;
	}
	
	public void setConsumoKwh(double consumoKwh) {
		if (consumoKwh > 0) {
			this.consumoKwh = consumoKwh;
		}
	}
	
	public void setValorKwh(double valorKwh) {
		if(valorKwh > 0) {
			this.valorKwh = valorKwh;
		}
	}
	
	
	
	//metodo
	public double calcularValorTotal() {
		return consumoKwh * valorKwh;
	}
	






}
