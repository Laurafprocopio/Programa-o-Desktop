
import java.util.Scanner;

public class Principal {

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de controle de naves espaciais!");

		
		NaveCarga naveCarga = new NaveCarga(null, 200, 300, 40, 10);
        System.out.println(naveCarga);
		
        naveCarga.acelerar(100);
        
        naveCarga.desacelerar(50);
        
        naveCarga.viajar(3000);
        
        naveCarga.carregar(200);
        
        naveCarga.abastecer(42);
        
        NavePassageiros passageiros = new NavePassageiros(null, 10, 40, 90, 100);
        System.out.println(passageiros);
        
        passageiros.embarcar(30);
		
        NaveCombate combate = new NaveCombate("Estrela", 20, 40, 60, "Canhão");
        System.out.println(combate);
        
        combate.atacar();
		
        
	}
}
