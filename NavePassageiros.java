
public class NavePassageiros extends NaveEspacial{

	int numeropassageiros;
	
	
	public NavePassageiros(String nome, double velmax, int numtri, double combustivel, int numeropassageiros) {
		super(nome, velmax, numtri, combustivel);
		this.numeropassageiros = numeropassageiros;
	}

	

	@Override
	public String toString() {
		return "NavePassageiros [numeropassageiros=" + numeropassageiros + "]";
	}

	
	protected void carregar(int i) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
