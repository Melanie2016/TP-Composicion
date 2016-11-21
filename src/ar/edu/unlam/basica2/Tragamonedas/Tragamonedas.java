package ar.edu.unlam.basica2.Tragamonedas;

public class Tragamonedas {
	

	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;

	private Boolean entregaPremio;

	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3){
		this.tambor1 = tambor1;
		this.tambor2 = tambor2;
		this.tambor3 = tambor3;
		
		
		this.entregaPremio = false;

	}

	

	public void girarTambores() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	
	

	public Boolean entregarPremio() {

		if (this.tambor1.getCara() == this.tambor2.getCara() &&
				this.tambor1.getCara() == this.tambor3.getCara()) {

			this.entregaPremio = true;
			
		} 
		
		else {
				this.entregaPremio = false;
		}

		
		
		return this.entregaPremio;

	}


	
	

	public Object getTambor1() {
		// TODO Auto-generated method stub
		return tambor1;
	}



	public Object getTambor2() {
		// TODO Auto-generated method stub
		return tambor2;
	}



	public Object getTambor3() {
		// TODO Auto-generated method stub
		return tambor3;
	}



	public int getValorTambor1() {
		// TODO Auto-generated method stub
		return tambor1.getValorActual();
	}



	public int getValorTambor2() {
		// TODO Auto-generated method stub
		return tambor2.getValorActual();
	}



	public int getValorTambor3() {
		// TODO Auto-generated method stub
		return tambor3.getValorActual();
	}
	
	
	
	
	
	

}
