package ar.edu.unlam.basica2.Tragamonedas;

import java.util.Random;

public class Tambor {

	private int valorActual;
	private Integer cara;
	

	public Tambor(Integer caras){
		this.cara = caras;
	}
	
	public void girar() {
		
		Random r = new Random();
		this.setValorActual(r.nextInt(this.cara-1) + 1);
	}
	
	
	
	
	
	
	public Integer getCara() {
		return cara;
	}
	
	public void setCara(Integer valor) {
		this.cara = valor;
	}

	public int getValorActual() {
		return valorActual;
	}
	
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	
}
