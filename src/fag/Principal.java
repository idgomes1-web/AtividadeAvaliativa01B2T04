package fag;

import fag.objetos.ContaBancaria;
import fag.objetos.Filme;
import fag.objetos.Funcionario;
import fag.objetos.Retangulo;
import fag.objetos.Musica;
import fag.objetos.Pessoa;
import fag.objetos.ContaLuz;
import fag.objetos.BicicletaAlugada;
import fag.objetos.ProdutoEstoque;
import fag.objetos.Temperatura;

public class Principal {
	
	public static void main(String[] args) {
		//atividadeUm();
		//atividadeDois();
		//atividadeTres();
		//atividadeQuatro();
		//atividadeCinco();
		//atividadeSeis();
		//atividadeSete();
		//atividadeOito();
		//atividadeNove();
		//atividadeDez();
	}
	
	
	
	public static void atividadeUm() {
		ContaBancaria UM = new ContaBancaria("isabel", 100);
		
		System.out.printf("saldo inicial: %.2f", UM.getSaldo());
		
		
		UM.depositar(20);
		System.out.printf("\nsaldo pos deposito: %.2f \n", UM.getSaldo());
		
		UM.sacar(50);
		System.out.printf("\nsaldo pos saque: %.2f", UM.getSaldo());
		
		System.out.printf("\nsaldo final: %.2f", UM.getSaldo());
	}
	
	public static void atividadeDois() {
		Filme UM = new Filme("Piratas do Caribe", 4.5);
		Filme DOIS = new Filme("Orgulho e Preconceito", 3.5);
		
		
		UM.exibir();
		System.out.println();
		DOIS.exibir();

	}
	
	public static void atividadeTres() {
		Funcionario UM = new Funcionario("isa", 100);
		
		System.out.printf("Funcionario: %s, possui salario: %.2f", UM.getNome(), UM.getSalario());
		
		UM.aumentarSalario(10);
		
		System.out.printf("\no salario de %s apos o aumento e de: %.2f", UM.getNome(), UM.getSalario());
	}
	
	public static void atividadeQuatro() {
		Retangulo UM = new Retangulo(10, 20);
		
		System.out.printf("Area: %.2f , perimetro: %.2f", UM.area(), UM.perimetro());
			
	}
	
	public static void atividadeCinco() {
		Musica UM = new Musica("Beds are burning", 246);
		Musica DOIS = new Musica("Poison", 210);

		System.out.println("titulo: " + UM.getTitulo()+ ", Duracao: " + UM.formatarDuracao() );

		System.out.println("titulo: " + DOIS.getTitulo()+ ", Duracao: " + DOIS.formatarDuracao() );	
	}
	
	public static void atividadeSeis() {
		Pessoa UM = new Pessoa("isa", 1.65, 40);
		
		System.out.printf("nome: %s\n", UM.getNome());
		System.out.printf("IMC: %f\n", UM.calcularIMC());
		System.out.println("Classificacao: " + UM.classificacaoIMC() );
	}
	
	public static void atividadeSete() {
		ContaLuz UM = new ContaLuz(10, 0.60);
		
		System.out.println("consumo de Kwh: " + UM.getConsumoKwh());
		System.out.println("valor do Kwh: " + UM.getValorKwh());
		System.out.printf("total da conta a pagar: R$ %.2f", UM.calcularValorTotal());
		
	}
	
	public static void atividadeOito() {
		BicicletaAlugada um = new BicicletaAlugada(4, 15);
		
		System.out.println("quantas horas andou: " + um.getHoras());
		System.out.println("Valor do aluguel por hora: " + um.getValorHora());
		System.out.printf("total do aluguel: R$ %.2f", um.calcularValor());		
	}
	
	public static void atividadeNove() {
		ProdutoEstoque um = new ProdutoEstoque("caneta", 20);
		
		System.out.println("quantidade inicial: " + um.getQuantidade());
		
		um.adicionarEstoque(5);
		System.out.println("quantidade depois de adicionar: " + um.getQuantidade());
		
		um.removerEstoque(10);
		System.out.println("quantidade depois de remover do estoque: " + um.getQuantidade());
		
		System.out.printf("\nquantidaed final são de %d %s", um.getQuantidade(), um.getNome());
		
		
	}
	
	
	public static void atividadeDez() {
		Temperatura um = new Temperatura(30);
		
		System.out.printf("graus Celsius: %.2f °C", um.getCelsius());
		
		
		System.out.printf("\nCelsius convertidos para Fahrenheit: %.2f °F", um.paraFahrenheit());
		
		System.out.printf("\nCelsius convertidos para Kelvin: %.2f °K", um.paraKelvin());
		
		
		
	}
	
	
	
	

}
