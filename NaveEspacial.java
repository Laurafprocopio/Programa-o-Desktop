

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
	  

	public abstract void acelerar (double velocidade);
	
	public abstract void desacelerar(double velocidade);
	
	public abstract void abastecer(double litros); 
		
		
	public abstract void viajar(double distancia); 
		

	@Override
	public String toString() {
		return "NaveEspacial [nome=" + nome + ", velmax=" + velmax + ", numtri=" + numtri + ", combustivel="
				+ combustivel + "]";
	}


	protected abstract void carregar(int i);
	
	
	
	}
