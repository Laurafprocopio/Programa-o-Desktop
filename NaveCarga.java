
public class NaveCarga extends NaveEspacial {

	protected double capacidadecarga;
	
	
	
	public NaveCarga(String nome, double velmax, int numtri, double combustivel, double capacidadecarga) {
		super(nome, velmax, numtri, combustivel);
		this.capacidadecarga = capacidadecarga;
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

	@Override
	public String toString() {
		return "NaveCarga [capacidadecarga=" + capacidadecarga + "]";
	}

	@Override
	public void abastecer(double litros) {
		 combustivel = combustivel / litros;
		

		
	}

	@Override
	public void viajar(double distancia) {
		double distnpercorrida = 950;
		if(distnpercorrida >= distancia ) {
			System.out.println ("Chegou ao seu Destino");
		}else {
			System.out.println ("não Chegou ao Destino");

		}
	}

	@Override
	protected void carregar(int i) {
		// TODO Auto-generated method stub
		
	}

}

		
	}

}
