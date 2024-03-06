
public abstract class NaveEspacial {

	protected String nome;
	private double velmax;
	private int numtri;
	private double combustivel;
	
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
	
	
	
	}
