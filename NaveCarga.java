
public class NaveCarga extends NaveEspacial {

	protected double capacidadecarga;
	
	
	
	public NaveCarga(String nome, double velmax, int numtri, double combustivel, double capacidadecarga) {
		super(nome, velmax, numtri, combustivel);
		this.capacidadecarga = capacidadecarga;
	}

	

	@Override
	public String toString() {
		return "NaveCarga [capacidadecarga=" + capacidadecarga + "]";
	}

	@Override
	protected void carregar(int i) {
		// TODO Auto-generated method stub
		
	}

}
