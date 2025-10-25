package fag.objetos;

public class Temperatura {
	
	private double celsius;
	
	public Temperatura() {
		
	}
	
	public Temperatura(double celsius) {
		setCelsius(celsius);
	}
	
	
	
	//getters e setters
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		if (celsius>= -273.15) {
			this.celsius = celsius;
		}
	}
	
	
	//metodos
	public double paraFahrenheit() {
		return (celsius * (9.0/5)) + 32;		//converte para fahrenheit
	}
	
	public double paraKelvin() {
		return celsius + 273.15;
	}
	
	
	
	
	
	

}
