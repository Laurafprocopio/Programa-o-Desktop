
public class NaveCarga extends NaveEspacial {

	private double capacidadecarga;
	
	
	
	public NaveCarga(String nome, double velmax, int numtri, double combustivel, double capacidadecarga) {
		super(nome, velmax, numtri, combustivel);
		this.capacidadecarga = capacidadecarga;
	}

	public void acelerar(double velocidade) {
	
	}
	
	public void desacelerar(double velocidade) {
		
	}
	
	public void carregar(double carga) {
		System.out.println("Carga de " + carga + " toneladas carregada na nave de carga " );
	}

	@Override
	public String toString() {
		return "NaveCarga [capacidadecarga=" + capacidadecarga + "]";
	}

	@Override
	public void abastecer(double litros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar(double distancia) {
		// TODO Auto-generated method stub
		
	}

}
