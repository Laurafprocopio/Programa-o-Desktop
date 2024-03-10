

public class NavePassageiros extends NaveEspacial{

	int numeropassageiros;
	
	
	public NavePassageiros(String nome, double velmax, int numtri, double combustivel, int numeropassageiros) {
		super(nome, velmax, numtri, combustivel);
		this.numeropassageiros = numeropassageiros;
	}

	public void acelerar(double velocidade) {
		
	}
	
	public void desacelerar(double velocidade) {
		
	}
	
	public void embarcar(int passageiro) {
		 System.out.println(passageiro + " passageiros embarcaram na nave de passageiros ");
	}

	@Override
	public String toString() {
		return "NavePassageiros [numeropassageiros=" + numeropassageiros + "]";
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
