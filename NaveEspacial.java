public abstract class NaveEspacial {

	protected String nome;
	protected double velmax;
	protected int numtri;
	protected double combustivel;
	
	public NaveEspacial (String nome, double velmax, int numtri, double combustivel) {
	
		this.combustivel = combustivel;
		this.velmax = velmax;
		this.nome = nome;
		this.numtri = numtri;
		
	}
	  


	public void acelerar(double velocidade) {
		velmax = velmax + 10;
	
	}
	
	public void desacelerar(double velocidade) {
		velmax = velmax - 10;
	}
	
	public void carregar(double carga) {
		double cargamax = 1000;
		if (carga <= cargamax) {
			carga -= cargamax;	
			System.out.println("Carga maxima atingida");
		}
		else {
			System.out.println("Carga maxima ultrapassada");

		}
		
		System.out.println("Carga de " + carga + " toneladas carregada na nave de carga " );
	}

	
	


	public void abastecer(double litros) {
		 combustivel = combustivel / litros;
				
	}

	
	public void viajar(double distancia) {
		double distnpercorrida = 950;
		if(distnpercorrida >= distancia ) {
			System.out.println ("Chegou ao seu Destino");
		}else {
			System.out.println ("não Chegou ao Destino");

		}
	}
	
		

	@Override
	public String toString() {
		return "NaveEspacial [nome=" + nome + ", velmax=" + velmax + ", numtri=" + numtri + ", combustivel="
				+ combustivel + "]";
	}


	protected abstract void carregar(int i);
	
	
	
	}
