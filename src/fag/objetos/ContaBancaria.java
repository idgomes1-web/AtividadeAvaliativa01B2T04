package fag.objetos;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	
	public ContaBancaria() {
		
	}
	
	//construtor do objeto
	public ContaBancaria(String titular, double saldo) {
		setSaldo(saldo);
		setTitular(titular);
	}
	
	
	
	public String getTitular() {
	return titular;
	}
	
	public void setTitular(String titular) {			//valida titular nao vazio
		if (titular != null  && !titular.isBlank()) {
			this.titular = titular;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {		// valida saldo positivo
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		
	}
	
	
	//metodos
	public void depositar(double valor) {			//valida deposito maior q 0
		if(valor> 0 ) {
			this.saldo += valor;
		}
		else {
			System.out.println("Insira um valor positivo!");
		}
	}
	
	
	public void sacar(double valor) {		//valida saque n pode ser maior que saldo
		if (valor <= saldo) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Valor de saque supera o saldo!");
		}
	}

	
}