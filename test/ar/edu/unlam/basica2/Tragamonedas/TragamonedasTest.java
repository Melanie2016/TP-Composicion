package ar.edu.unlam.basica2.Tragamonedas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void testearQueSeCreeElTragamonedasYSusTambores(){
		
		Tragamonedas tragamonedas = new Tragamonedas(new Tambor(3),new Tambor(3),new Tambor(3));
		
		assertTrue(tragamonedas.getTambor1()!=null);
		
		assertTrue(tragamonedas.getTambor2()!=null);
		
		assertTrue(tragamonedas.getTambor3()!=null);
		
	}
		
	@Test
	public void testearQueLosTamboresGirenAleatoriamente(){
		
		Tragamonedas tragamonedas = new Tragamonedas(new Tambor(5),new Tambor(5),new Tambor(5));
		tragamonedas.girarTambores() ;
		
		assertTrue(tragamonedas.getValorTambor1()>=1 && tragamonedas.getValorTambor1()<=5);
		
		assertTrue(tragamonedas.getValorTambor2()>=1 && tragamonedas.getValorTambor2()<=5);
		
		assertTrue(tragamonedas.getValorTambor3()>=1 && tragamonedas.getValorTambor3()<=5);
	}
	

	

	@Test
	public void testearQueUnTragamonedasEntreguePremioParaTresCarasIguales() {
		
		Tragamonedas tragamonedas = new Tragamonedas(new Tambor(2), new Tambor(2) ,new Tambor(2));
		
		tragamonedas.girarTambores();
		
		
		if (tragamonedas.entregarPremio() == true){
			System.out.println(" CONGRATULATION ");
		}
		else{
			
			System.out.println(" SIGA PARTICIPANDO ");
		}
	}
	
	
}