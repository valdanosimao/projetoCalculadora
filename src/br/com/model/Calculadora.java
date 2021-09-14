package br.com.model;

public class Calculadora {

	// atributos
	private boolean ligado = true;
	private String cor;
	private String marca;

	// métodos getters and setters
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// métodos implementáveis
	public int dividir(int num1, int num2) {
		return num1 / num2;
	}

	public int somar(int num1, int num2) {
		return num1 + num2;
	}

	public int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public double porcentagem(double num1, double num2) {
		double porcentagem = (num1 * num2) / 100;
		return porcentagem;
	}
	
	public void desligar() {
		this.ligado = false;
	}

	@Override
	public String toString() {
		return "Cor = " + cor + "Marca = " + marca;
	}

	

	
}
