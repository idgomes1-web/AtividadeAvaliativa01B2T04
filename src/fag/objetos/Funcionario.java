package fag.objetos;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	
	//construtores
	public Funcionario() {		
	}
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome != null &&  !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if (salario >= 0 ) {
			this.salario = salario;
		}
	}
	
	//metodo aumetar salario
	public void aumentarSalario(double percentual) {
		this.salario += salario*(percentual/100);		//o salario recebe, o salario mais o calculo da porcentagem sobre o salario
	}
	
	
	
	
	
	

}
