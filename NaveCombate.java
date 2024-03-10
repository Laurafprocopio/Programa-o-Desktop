public class NaveCombate extends NaveEspacial {

	private String armamento;
	
	public NaveCombate(String nome, double velmax, int numtri, double combustivel, String armamento) {
		super(nome, velmax, numtri, combustivel);
		this.armamento = armamento;
	}

	public void atacar() {
		System.out.println("A nave de combate " + nome + " atacou com " + armamento + ".");
	}

	@Override
	public String toString() {
		return "NaveCombate [armamento=" + armamento + "]";
	}

	@Override
	public void acelerar(double velocidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desacelerar(double velocidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abastecer(double litros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar(double distancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void carregar(int i) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
