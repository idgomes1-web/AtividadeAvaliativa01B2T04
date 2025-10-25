package fag.objetos;

public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;
	
	//construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, double altura, double peso) {
		setNome(nome);
		setAltura(altura);
		setPeso(peso);
	}
	
	
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	//metodos
	public double calcularIMC() {
		double calculo = peso / (altura*altura);
		return calculo;
	}
	
	
	public String classificacaoIMC() {
		double calculo = calcularIMC();
		
		if ( calculo < 16) {
			 return "Desnutrido";
		}
		else if (calculo>= 16 && calculo < 18.5) {
			return "Abaixo do peso";
		} 
		else if (calculo >= 18.5 && calculo < 25) {
			return "Peso normal";
		} 
		else if (calculo>=25 && calculo < 30) {
			return "Sobrepeso";
		} 
		else {
			return "Obesidade";
		}
		
	}
	

}
