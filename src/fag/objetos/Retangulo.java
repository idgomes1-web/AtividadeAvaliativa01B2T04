package fag.objetos;

public class Retangulo {
	
	private double altura;
	private double largura;
	
	//construtores
	public Retangulo() {
		
	}
	
	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}
	
	
	//getters e setters
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}	
	}
	
	public double getLargura(){
		return largura;
	}
	
	public void setLargura(double largura) {
		if (largura > 0) {
			this.largura = largura;
		}
	}
	
	
	
	public double area() {
		return largura*altura;
	}
	
	public double perimetro() {
		return 2*(altura + largura);
	}
	
	

}
